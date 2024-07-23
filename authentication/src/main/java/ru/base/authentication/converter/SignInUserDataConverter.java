package ru.base.authentication.converter;

import com.google.common.base.Converter;
import ru.base.common.annotation.ModelConverter;
import ru.base.common.model.dto.sign.SignInData;
import ru.base.grpc.common.CommonMessage;
import ru.base.grpc.user.UserMessage;

@ModelConverter("signInUserDataConverter")
public class SignInUserDataConverter extends Converter<SignInData, UserMessage.UserData> {

    @Override
    protected UserMessage.UserData doForward(SignInData signInData) {
        return UserMessage.UserData
                .newBuilder()
                .setUsername(CommonMessage.Username
                                     .newBuilder()
                                     .setUsername(signInData.getUsername()))
                .build();
    }

    @Override
    protected SignInData doBackward(UserMessage.UserData userData) {
        return SignInData
                .builder()
                .username(userData.getUsername().getUsername())
                .password(null)
                .build();
    }

}
