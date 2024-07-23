package ru.base.authentication.service.api;

import ru.base.common.model.dto.sign.SignInData;
import ru.base.common.model.dto.sign.SignUpData;

/**
 * Сервис авторизации пользователей
 *
 * @author Mahanov
 */
public interface AuthService {

    String signIn(SignInData signInData);
    String signUp(SignUpData signUpData);

}
