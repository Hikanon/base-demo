package ru.base.grpc.ping;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: PingService.proto")
public final class PingServiceGrpc {

  private PingServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.base.grpc.ping.PingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.base.grpc.ping.PingMessage.PingRequest,
      ru.base.grpc.ping.PingMessage.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ping",
      requestType = ru.base.grpc.ping.PingMessage.PingRequest.class,
      responseType = ru.base.grpc.ping.PingMessage.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.base.grpc.ping.PingMessage.PingRequest,
      ru.base.grpc.ping.PingMessage.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<ru.base.grpc.ping.PingMessage.PingRequest, ru.base.grpc.ping.PingMessage.PingResponse> getPingMethod;
    if ((getPingMethod = PingServiceGrpc.getPingMethod) == null) {
      synchronized (PingServiceGrpc.class) {
        if ((getPingMethod = PingServiceGrpc.getPingMethod) == null) {
          PingServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<ru.base.grpc.ping.PingMessage.PingRequest, ru.base.grpc.ping.PingMessage.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.ping.PingMessage.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.ping.PingMessage.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PingServiceMethodDescriptorSupplier("ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingServiceStub newStub(io.grpc.Channel channel) {
    return new PingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(ru.base.grpc.ping.PingMessage.PingRequest request,
        io.grpc.stub.StreamObserver<ru.base.grpc.ping.PingMessage.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.base.grpc.ping.PingMessage.PingRequest,
                ru.base.grpc.ping.PingMessage.PingResponse>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class PingServiceStub extends io.grpc.stub.AbstractStub<PingServiceStub> {
    private PingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(ru.base.grpc.ping.PingMessage.PingRequest request,
        io.grpc.stub.StreamObserver<ru.base.grpc.ping.PingMessage.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PingServiceBlockingStub extends io.grpc.stub.AbstractStub<PingServiceBlockingStub> {
    private PingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.base.grpc.ping.PingMessage.PingResponse ping(ru.base.grpc.ping.PingMessage.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PingServiceFutureStub extends io.grpc.stub.AbstractStub<PingServiceFutureStub> {
    private PingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.base.grpc.ping.PingMessage.PingResponse> ping(
        ru.base.grpc.ping.PingMessage.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((ru.base.grpc.ping.PingMessage.PingRequest) request,
              (io.grpc.stub.StreamObserver<ru.base.grpc.ping.PingMessage.PingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.base.grpc.ping.PingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingService");
    }
  }

  private static final class PingServiceFileDescriptorSupplier
      extends PingServiceBaseDescriptorSupplier {
    PingServiceFileDescriptorSupplier() {}
  }

  private static final class PingServiceMethodDescriptorSupplier
      extends PingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
