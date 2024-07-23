package ru.base.authentication.converter;

import com.google.common.base.Converter;
import org.apache.commons.lang3.NotImplementedException;
import ru.base.authentication.TokenGenerationData;
import ru.base.common.annotation.ModelConverter;
import ru.base.common.enumeration.Role;
import ru.base.grpc.user.UserMessage;

@ModelConverter("tokenDataGenerationConverter")
public class TokenDataGenerationConverter extends Converter<UserMessage.FullUserData, TokenGenerationData> {

    @Override
    protected TokenGenerationData doForward(UserMessage.FullUserData fullUserData) {
        UserMessage.UserData userData = fullUserData
                .getUserData();
        return TokenGenerationData
                .builder()
                .id(fullUserData.getId().getId())
                .username(userData
                                  .getUsername()
                                  .getUsername())
                .email(userData
                               .getEmail()
                               .getEmail())
                .role(Role.valueOf(userData.getRole()))
                .build();
    }

    @Override
    protected UserMessage.FullUserData doBackward(TokenGenerationData tokenGenerationData) {
        throw new NotImplementedException();
    }

}
