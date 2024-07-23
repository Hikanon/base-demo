package ru.base.common.converter;

import com.google.common.base.Converter;
import ru.base.common.annotation.ModelConverter;
import ru.base.common.model.dto.sign.SignInData;
import ru.base.grpc.auth.AuthMessage;

@ModelConverter("signInConverter")
public class SignInConverter extends Converter<SignInData, AuthMessage.SignInRequest> {

    @Override
    protected AuthMessage.SignInRequest doForward(SignInData signInData) {
        return AuthMessage.SignInRequest
                .newBuilder()
                .setUsername(signInData.getUsername())
                .setPassword(signInData.getPassword())
                .build();
    }

    @Override
    protected SignInData doBackward(AuthMessage.SignInRequest signInRequest) {
        return SignInData
                .builder()
                .username(signInRequest.getUsername())
                .password(signInRequest.getPassword())
                .build();
    }

}
