package ru.base.common.converter;

import com.google.common.base.Converter;
import ru.base.common.annotation.ModelConverter;
import ru.base.common.model.entity.User;
import ru.base.grpc.common.CommonMessage;
import ru.base.grpc.user.UserMessage;
import static ru.base.common.converter.ConverterUtils.fillField;
import static ru.base.common.util.CommonBuilder.buildUserData;

/**
 * Конвертер из DTO полученной по gRPC в модель БД {@link User}
 * @author Makhanov
 */
@ModelConverter("userFullUserDataConverter")
public class UserFullUserDataConverter extends Converter<UserMessage.FullUserData, User> {

    @Override
    protected User doForward(UserMessage.FullUserData fullUserDataRequest) {
        User user = new User();
        UserMessage.UserData userData = fullUserDataRequest.getUserData();
        fillField(user::setId, fullUserDataRequest::hasId, fullUserDataRequest.getId().getId());
        user.setUsername(userData.hasUsername() ? userData.getUsername().getUsername() : null);
        user.setPassword(fullUserDataRequest.hasPassword() ? fullUserDataRequest.getPassword().getPassword() : null);
        user.setEmail(userData.hasEmail() ? userData.getEmail().getEmail() : null);
        return user;
    }

    @Override
    protected UserMessage.FullUserData doBackward(User user) {
        return UserMessage.FullUserData
                .newBuilder()
                .setId(CommonMessage.Id.newBuilder().setId(user.getId()))
                .setPassword(CommonMessage.Password.newBuilder().setPassword(user.getPassword()))
                .setUserData(buildUserData(user))
                .build();
    }

}
