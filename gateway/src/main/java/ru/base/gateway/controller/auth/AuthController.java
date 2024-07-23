package ru.base.gateway.controller.auth;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.base.common.model.dto.JwtTokenResponse;
import ru.base.common.model.dto.sign.SignInData;
import ru.base.common.model.dto.sign.SignUpData;
import ru.base.gateway.service.AuthServiceImpl;

/**
 * Контроллер для авторизации/регистрации пользователя
 * @author Makhanov
 */
@RestController
@RequestMapping("/auth")
@Validated
public class AuthController {

    private final AuthServiceImpl authService;

    public AuthController(AuthServiceImpl authService) {
        this.authService = authService;
    }

    /**
     * Авторизация пользователя
     * @param signInData данные для авторизации пользователя
     * @return токен авторизации пользователя
     */
    @PostMapping("/signIn")
    public JwtTokenResponse signIn(@Valid @RequestBody SignInData signInData) {
        return authService.signIn(signInData);
    }

    /**
     * Регистрация нового пользователя
     * @param signUpData данные для регистрации пользователя
     * @return токен авторизации пользователя
     */
    @PostMapping("/signUp")
    public JwtTokenResponse signUp(@Valid @RequestBody SignUpData signUpData) {
        return authService.signUp(signUpData);
    }

}
