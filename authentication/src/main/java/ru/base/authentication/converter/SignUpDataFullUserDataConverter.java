package ru.base.authentication.converter;

import com.google.common.base.Converter;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.NotImplementedException;
import ru.base.common.annotation.ModelConverter;
import ru.base.common.model.dto.sign.SignUpData;
import ru.base.common.util.CommonBuilder;
import ru.base.grpc.user.UserMessage;

@ModelConverter("signUpDataFullUserDataConverter")
public class SignUpDataFullUserDataConverter extends Converter<SignUpData, UserMessage.FullUserData> {

    @Override
    @Nonnull
    protected UserMessage.FullUserData doForward(SignUpData signUpData) {
        return UserMessage.FullUserData
                .newBuilder()
                .setUserData(UserMessage.UserData
                                     .newBuilder()
                                     .setUsername(CommonBuilder.buildUsername(signUpData.getUsername()))
                                     .setEmail(CommonBuilder.buildEmail(signUpData.getEmail()))
                                     .build())
                .setPassword(CommonBuilder.buildPassword(signUpData.getPassword()))
                .build();
    }

    @Override
    protected SignUpData doBackward(UserMessage.FullUserData fullUserData) {
        throw new NotImplementedException();
    }

}
