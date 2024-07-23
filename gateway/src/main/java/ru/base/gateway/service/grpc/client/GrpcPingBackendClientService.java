package ru.base.gateway.service.grpc.client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import ru.base.grpc.ping.PingMessage;
import ru.base.grpc.ping.PingServiceGrpc;

@Service
public class GrpcPingBackendClientService {

    @GrpcClient("backend")
    private PingServiceGrpc.PingServiceBlockingStub blockingStub;

    public PingMessage.PingResponse ping() {
        return blockingStub.ping(PingMessage.PingRequest.newBuilder().build());
    }

}
