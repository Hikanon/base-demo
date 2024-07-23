package ru.base.backend.service.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.base.backend.service.PingService;
import ru.base.grpc.ping.PingMessage;
import ru.base.grpc.ping.PingServiceGrpc;

/**
 * gRPC сервис для проверки работоспособности сервера
 *
 * @author Mahanov
 */
@GrpcService
public class GrpcPingServiceImpl extends PingServiceGrpc.PingServiceImplBase {

    private final PingService pingService;

    public GrpcPingServiceImpl(PingService pingService) {
        this.pingService = pingService;
    }

    @Override
    public void ping(PingMessage.PingRequest request, StreamObserver<PingMessage.PingResponse> responseObserver) {
        responseObserver.onNext(
                PingMessage.PingResponse
                        .newBuilder()
                        .setServiceActive(pingService.ping())
                        .build()
        );
        responseObserver.onCompleted();
    }

}
