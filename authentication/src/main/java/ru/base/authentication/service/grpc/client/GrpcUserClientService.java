package ru.base.authentication.service.grpc.client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import ru.base.grpc.common.CommonMessage;
import ru.base.grpc.database.UserServiceGrpc;
import ru.base.grpc.user.UserMessage;

@Service
public class GrpcUserClientService {

    @GrpcClient("database")
    private UserServiceGrpc.UserServiceBlockingStub blockingStub;

    public UserMessage.FullUserData findUserById(CommonMessage.Id request) {
        return blockingStub.findUserById(request);
    }

    public UserMessage.FullUserData findUserByUsername(CommonMessage.Username request) {
        return blockingStub.findUserByUsername(request);
    }

    public UserMessage.FullUserData findUserByEmail(CommonMessage.Email request) {
        return blockingStub.findUserByEmail(request);
    }

    public UserMessage.FullUserData saveUser(UserMessage.FullUserData request) {
        return blockingStub.saveUser(request);
    }

}
