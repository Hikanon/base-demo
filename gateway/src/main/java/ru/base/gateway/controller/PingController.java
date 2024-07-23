package ru.base.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.base.gateway.service.grpc.client.GrpcPingBackendClientService;

@RestController
@RequestMapping("/ping")
public class PingController {

    private final GrpcPingBackendClientService grpcPingBackendClientService;

    public PingController(GrpcPingBackendClientService grpcPingBackendClientService) {
        this.grpcPingBackendClientService = grpcPingBackendClientService;
    }

    @GetMapping("")
    public String ping() {
        return "Service work";
    }

    @GetMapping("/backend")
    public boolean pingBackend() {
        return grpcPingBackendClientService.ping().getServiceActive();
    }

}
