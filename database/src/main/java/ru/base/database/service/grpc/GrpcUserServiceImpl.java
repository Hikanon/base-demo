package ru.base.database.service.grpc;

import com.google.common.base.Converter;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.base.common.exception.EntityDataExistsException;
import ru.base.common.model.entity.User;
import ru.base.database.service.api.UserService;
import ru.base.grpc.common.CommonMessage;
import ru.base.grpc.database.UserServiceGrpc;
import ru.base.grpc.user.UserMessage;
import static ru.base.common.util.CommonBuilder.buildId;
import static ru.base.common.util.CommonBuilder.buildUserData;

@GrpcService
public class GrpcUserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private final Converter<UserMessage.FullUserData, User> userConverter;
    private final UserService userService;

    public GrpcUserServiceImpl(
            @Qualifier("userFullUserDataConverter") Converter<UserMessage.FullUserData, User> userConverter,
            UserService userService) {
        this.userConverter = userConverter;
        this.userService = userService;
    }

    @Override
    public void findUserById(CommonMessage.Id request, StreamObserver<UserMessage.FullUserData> responseObserver) {
        User user = userService.getById(request.getId());
        responseObserver.onNext(userConverter.reverse().convert(user));
        responseObserver.onCompleted();
    }

    @Override
    public void findUserByUsername(CommonMessage.Username request, StreamObserver<UserMessage.FullUserData> responseObserver) {
        User user = userService.getByUsername(request.getUsername());
        responseObserver.onNext(userConverter.reverse().convert(user));
        responseObserver.onCompleted();
    }

    @Override
    public void findUserByEmail(CommonMessage.Email request, StreamObserver<UserMessage.FullUserData> responseObserver) {
        User user = userService.getByEmail(request.getEmail());
        responseObserver.onNext(userConverter.reverse().convert(user));
        responseObserver.onCompleted();
    }

    @Override
    public void saveUser(UserMessage.FullUserData request, StreamObserver<UserMessage.FullUserData> responseObserver) {
        try {
            User user = userService.create(
                    userConverter.convert(request));
            responseObserver.onNext(UserMessage.FullUserData
                                            .newBuilder()
                                            .setId(buildId(user))
                                            .setUserData(buildUserData(user))
                                            .build());
            responseObserver.onCompleted();
        } catch (EntityDataExistsException e) {
            responseObserver.onError(Status.ALREADY_EXISTS.withDescription(e.getCode().name()).asRuntimeException());
        }
    }

}
