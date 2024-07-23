package ru.base.gateway.service;

import com.google.common.base.Converter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.base.common.model.dto.JwtTokenResponse;
import ru.base.common.model.dto.sign.SignInData;
import ru.base.common.model.dto.sign.SignUpData;
import ru.base.gateway.service.api.AuthService;
import ru.base.gateway.service.grpc.client.GrpcAuthClientService;
import ru.base.grpc.common.CommonMessage;
import ru.base.grpc.auth.AuthMessage;

/**
 * Сервис авторизации/регистрации пользователя
 * @author Makhanov
 */
@Service
public class AuthServiceImpl implements AuthService {

    private final GrpcAuthClientService grpcAuthClientService;
    private final Converter<SignInData, AuthMessage.SignInRequest> signInConverter;
    private final Converter<SignUpData, AuthMessage.SignUpRequest> signUpConverter;

    public AuthServiceImpl(GrpcAuthClientService grpcAuthClientService,
                           @Qualifier("signInConverter") Converter<SignInData, AuthMessage.SignInRequest> signInConverter,
                           @Qualifier("signUpConverter") Converter<SignUpData, AuthMessage.SignUpRequest> signUpConverter) {
        this.grpcAuthClientService = grpcAuthClientService;
        this.signInConverter = signInConverter;
        this.signUpConverter = signUpConverter;
    }

    /**
     * Авторизация пользователя
     * @param signInData данные для авторизации пользователя
     * @return токен авторизации пользователя
     */
    @Override
    public JwtTokenResponse signIn(SignInData signInData) {
        AuthMessage.SignInRequest request = signInConverter.convert(signInData);
        CommonMessage.JwtToken jwtToken = grpcAuthClientService.signIn(request);
        return JwtTokenResponse
                .builder()
                .token(jwtToken.getJwtToken())
                .build();
    }

    /**
     * Регистрация нового пользователя
     * @param signUpData данные для регистрации пользователя
     * @return токен авторизации пользователя
     */
    @Override
    public JwtTokenResponse signUp(SignUpData signUpData) {
        AuthMessage.SignUpRequest request = signUpConverter.convert(signUpData);
        CommonMessage.JwtToken jwtToken = grpcAuthClientService.signUp(request);
        return JwtTokenResponse
                .builder()
                .token(jwtToken.getJwtToken())
                .build();
    }

}
