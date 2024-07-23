package ru.base.authentication.service;

import com.google.common.base.Converter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.base.authentication.TokenGenerationData;
import ru.base.authentication.provider.JwtProvider;
import ru.base.authentication.service.api.AuthService;
import ru.base.authentication.service.grpc.client.GrpcUserClientService;
import ru.base.authentication.validator.Validator;
import ru.base.common.model.dto.sign.SignInData;
import ru.base.common.model.dto.sign.SignUpData;
import ru.base.common.util.CommonBuilder;
import ru.base.grpc.user.UserMessage;

@Service
public class AuthServiceImpl implements AuthService {

    private final JwtProvider jwtProvider;
    private final GrpcUserClientService databaseClientService;
    private final Converter<SignInData, UserMessage.UserData> signInDataConverter;
    private final Converter<SignUpData, UserMessage.FullUserData> signUpDataFullUserDataConverter;
    private final Converter<UserMessage.FullUserData, TokenGenerationData> tokenDataGenerationConverter;
    private final Validator<String, String> passwordValidator;

    public AuthServiceImpl(JwtProvider jwtProvider, GrpcUserClientService databaseClientService,
                           @Qualifier("signInUserDataConverter") Converter<SignInData, UserMessage.UserData> signInDataConverter,
                           @Qualifier("signUpDataFullUserDataConverter") Converter<SignUpData, UserMessage.FullUserData> signUpDataFullUserDataConverter,
                           @Qualifier("tokenDataGenerationConverter") Converter<UserMessage.FullUserData, TokenGenerationData> tokenDataGenerationConverter,
                           @Qualifier("passwordValidator") Validator<String, String> passwordValidator) {
        this.jwtProvider = jwtProvider;
        this.databaseClientService = databaseClientService;
        this.signInDataConverter = signInDataConverter;
        this.signUpDataFullUserDataConverter = signUpDataFullUserDataConverter;
        this.tokenDataGenerationConverter = tokenDataGenerationConverter;
        this.passwordValidator = passwordValidator;
    }

    /**
     * @return Возвращает jwtToken при успешной авторизации
     */
    @Override
    public String signIn(SignInData signInData) {
        UserMessage.FullUserData fullUserData = databaseClientService.findUserByUsername(
                CommonBuilder
                        .buildUsername(signInData.getUsername()
                        )
        );
        passwordValidator.validate(fullUserData
                                           .getPassword()
                                           .getPassword(),
                                   signInData.getPassword());
        return jwtProvider.generateToken(
                tokenDataGenerationConverter.convert(fullUserData)
        );
    }

    /**
     * @return Возвращает jwtToken при успешной регистрации
     */
    @Override
    public String signUp(SignUpData signUpData) {
        UserMessage.FullUserData fullUserData = databaseClientService.saveUser(
                signUpDataFullUserDataConverter.convert(signUpData)
        );
        return jwtProvider.generateToken(
                tokenDataGenerationConverter.convert(fullUserData)
        );
    }

}
