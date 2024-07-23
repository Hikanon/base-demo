package ru.base.authentication.provider;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ru.base.authentication.TokenGenerationData;
import ru.base.authentication.configuration.TokenConfiguration;

/**
 * Провайдер JWT для аутентификации
 *
 * @author Mahanov
 */
@Component
public class JwtProvider {

    private final TokenConfiguration tokenConfiguration;

    public JwtProvider(TokenConfiguration tokenConfiguration) {
        this.tokenConfiguration = tokenConfiguration;
    }

    /**
     * Получение username из токена
     *
     * @param token - JWT токен
     *
     * @return {@link UserDetails#getUsername()}
     */
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    /**
     * Генерация токена
     *
     * @param userDetails данные пользователя
     *
     * @return Возвращает токен
     */
    public String generateToken(TokenGenerationData tokenGenerationData) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", tokenGenerationData.getId());
        claims.put("email", tokenGenerationData.getEmail());
        claims.put("role", tokenGenerationData.getRole());
        return generateToken(claims, tokenGenerationData);
    }

    private String generateToken(Map<String, Object> claims, TokenGenerationData tokenGenerationData) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + tokenConfiguration.getTokenValidity());
        return Jwts.builder()
                   .claims(claims)
                   .subject(tokenGenerationData.getUsername())
                   .issuedAt(now)
                   .expiration(expiryDate)
                   .signWith(getSigningKey(), SignatureAlgorithm.HS512)
                   .compact();
    }

    /**
     * Проверка токена на валидность
     *
     * @return Возвращает true если токен валидный, иначе false
     */
    public boolean validateToken(String token, String username) {
        return username.equals(extractUsername(token)) &&
                !isTokenExpired(token);
    }

    public String getToken(String username) {
        return null;
    }

    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    /**
     * Извлечение данных из токена
     *
     * @param token          токен
     * @param claimsResolver функция извлечения данных
     * @param <T>            тип данных
     *
     * @return данные
     */
    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        return claimsResolver.apply(
                extractAllClaims(token));
    }

    /**
     * Извлечение всех данных из токена
     *
     * @param token токен
     *
     * @return данные
     */
    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                   .setSigningKey(getSigningKey())
                   .build()
                   .parseClaimsJws(token).getBody();
    }

    private Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    /**
     * Получение ключа для подписи токена
     *
     * @return ключ
     */
    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(tokenConfiguration.getSeed());
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
