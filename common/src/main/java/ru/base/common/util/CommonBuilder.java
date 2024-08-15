package ru.base.common.util;

import ru.base.common.enumeration.Role;
import ru.base.common.model.entity.BaseModel;
import ru.base.common.model.entity.User;
import ru.base.grpc.common.CommonMessage;
import ru.base.grpc.user.UserMessage;

public class CommonBuilder {

    private CommonBuilder() {
    }

    public static CommonMessage.Id buildId(BaseModel model) {
        return CommonMessage.Id
                .newBuilder()
                .setId(model.getId())
                .build();
    }

    public static CommonMessage.Username buildUsername(String username) {
        return CommonMessage.Username
                .newBuilder()
                .setUsername(username)
                .build();
    }

    public static CommonMessage.Email buildEmail(String email) {
        return CommonMessage.Email
                .newBuilder()
                .setEmail(email)
                .build();
    }

    public static CommonMessage.Password buildPassword(String password) {
        return CommonMessage.Password
                .newBuilder()
                .setPassword(password)
                .build();
    }

    public static UserMessage.UserData buildUserData(User user) {
        return UserMessage.UserData
                .newBuilder()
                .setUsername(buildUsername(user.getUsername()))
                .setEmail(buildEmail(user.getEmail()))
                .setRole(Role.ROLE_USER.name())
                .build();
    }

}
