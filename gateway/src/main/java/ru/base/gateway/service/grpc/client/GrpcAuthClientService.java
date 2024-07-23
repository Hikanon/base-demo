package ru.base.gateway.service.grpc.client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import ru.base.grpc.auth.AuthMessage;
import ru.base.grpc.auth.AuthServiceGrpc;
import ru.base.grpc.common.CommonMessage;

@Service
public class GrpcAuthClientService {

    @GrpcClient("auth")
    private AuthServiceGrpc.AuthServiceBlockingStub blockingStub;

    public CommonMessage.JwtToken signIn(AuthMessage.SignInRequest request) {
        return blockingStub.signIn(request);
    }

    public CommonMessage.JwtToken signUp(AuthMessage.SignUpRequest request) {
        return blockingStub.signUp(request);
    }

}
