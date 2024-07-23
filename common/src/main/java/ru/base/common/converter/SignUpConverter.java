package ru.base.common.converter;

import com.google.common.base.Converter;
import ru.base.common.annotation.ModelConverter;
import ru.base.common.model.dto.sign.SignUpData;
import ru.base.grpc.auth.AuthMessage;

@ModelConverter("signUpConverter")
public class SignUpConverter extends Converter<SignUpData, AuthMessage.SignUpRequest> {

    @Override
    protected AuthMessage.SignUpRequest doForward(SignUpData signUpData) {
        return AuthMessage.SignUpRequest
                .newBuilder()
                .setUsername(signUpData.getUsername())
                .setEmail(signUpData.getEmail())
                .setPassword(signUpData.getPassword())
                .build();
    }

    @Override
    protected SignUpData doBackward(AuthMessage.SignUpRequest signUpRequest) {
        return SignUpData
                .builder()
                .username(signUpRequest.getUsername())
                .email(signUpRequest.getEmail())
                .password(signUpRequest.getPassword())
                .build();
    }

}
