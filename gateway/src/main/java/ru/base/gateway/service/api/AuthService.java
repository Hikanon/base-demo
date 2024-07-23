package ru.base.gateway.service.api;

import ru.base.common.model.dto.JwtTokenResponse;
import ru.base.common.model.dto.sign.SignInData;
import ru.base.common.model.dto.sign.SignUpData;

/**
 * Сервис авторизации/регистрации пользователя
 * @author Makhanov
 */
public interface AuthService {

    /**
     * Авторизация пользователя
     * @param signInData данные для авторизации пользователя
     * @return токен авторизации пользователя
     */
    JwtTokenResponse signIn(SignInData signInData);

    /**
     * Регистрация нового пользователя
     * @param signUpData данные для регистрации пользователя
     * @return токен авторизации пользователя
     */
    JwtTokenResponse signUp(SignUpData signUpData);


}
