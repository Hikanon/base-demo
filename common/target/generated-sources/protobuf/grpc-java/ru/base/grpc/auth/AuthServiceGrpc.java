package ru.base.grpc.auth;

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
    comments = "Source: AuthService.proto")
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.base.grpc.auth.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.base.grpc.auth.AuthMessage.SignInRequest,
      ru.base.grpc.common.CommonMessage.JwtToken> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signIn",
      requestType = ru.base.grpc.auth.AuthMessage.SignInRequest.class,
      responseType = ru.base.grpc.common.CommonMessage.JwtToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.base.grpc.auth.AuthMessage.SignInRequest,
      ru.base.grpc.common.CommonMessage.JwtToken> getSignInMethod() {
    io.grpc.MethodDescriptor<ru.base.grpc.auth.AuthMessage.SignInRequest, ru.base.grpc.common.CommonMessage.JwtToken> getSignInMethod;
    if ((getSignInMethod = AuthServiceGrpc.getSignInMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSignInMethod = AuthServiceGrpc.getSignInMethod) == null) {
          AuthServiceGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<ru.base.grpc.auth.AuthMessage.SignInRequest, ru.base.grpc.common.CommonMessage.JwtToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "signIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.auth.AuthMessage.SignInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.common.CommonMessage.JwtToken.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("signIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.base.grpc.auth.AuthMessage.SignUpRequest,
      ru.base.grpc.common.CommonMessage.JwtToken> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signUp",
      requestType = ru.base.grpc.auth.AuthMessage.SignUpRequest.class,
      responseType = ru.base.grpc.common.CommonMessage.JwtToken.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.base.grpc.auth.AuthMessage.SignUpRequest,
      ru.base.grpc.common.CommonMessage.JwtToken> getSignUpMethod() {
    io.grpc.MethodDescriptor<ru.base.grpc.auth.AuthMessage.SignUpRequest, ru.base.grpc.common.CommonMessage.JwtToken> getSignUpMethod;
    if ((getSignUpMethod = AuthServiceGrpc.getSignUpMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSignUpMethod = AuthServiceGrpc.getSignUpMethod) == null) {
          AuthServiceGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<ru.base.grpc.auth.AuthMessage.SignUpRequest, ru.base.grpc.common.CommonMessage.JwtToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "signUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.auth.AuthMessage.SignUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.common.CommonMessage.JwtToken.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("signUp"))
              .build();
        }
      }
    }
    return getSignUpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    return new AuthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void signIn(ru.base.grpc.auth.AuthMessage.SignInRequest request,
        io.grpc.stub.StreamObserver<ru.base.grpc.common.CommonMessage.JwtToken> responseObserver) {
      asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     */
    public void signUp(ru.base.grpc.auth.AuthMessage.SignUpRequest request,
        io.grpc.stub.StreamObserver<ru.base.grpc.common.CommonMessage.JwtToken> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.base.grpc.auth.AuthMessage.SignInRequest,
                ru.base.grpc.common.CommonMessage.JwtToken>(
                  this, METHODID_SIGN_IN)))
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.base.grpc.auth.AuthMessage.SignUpRequest,
                ru.base.grpc.common.CommonMessage.JwtToken>(
                  this, METHODID_SIGN_UP)))
          .build();
    }
  }

  /**
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractStub<AuthServiceStub> {
    private AuthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void signIn(ru.base.grpc.auth.AuthMessage.SignInRequest request,
        io.grpc.stub.StreamObserver<ru.base.grpc.common.CommonMessage.JwtToken> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(ru.base.grpc.auth.AuthMessage.SignUpRequest request,
        io.grpc.stub.StreamObserver<ru.base.grpc.common.CommonMessage.JwtToken> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.base.grpc.common.CommonMessage.JwtToken signIn(ru.base.grpc.auth.AuthMessage.SignInRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.base.grpc.common.CommonMessage.JwtToken signUp(ru.base.grpc.auth.AuthMessage.SignUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.base.grpc.common.CommonMessage.JwtToken> signIn(
        ru.base.grpc.auth.AuthMessage.SignInRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.base.grpc.common.CommonMessage.JwtToken> signUp(
        ru.base.grpc.auth.AuthMessage.SignUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_IN = 0;
  private static final int METHODID_SIGN_UP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_IN:
          serviceImpl.signIn((ru.base.grpc.auth.AuthMessage.SignInRequest) request,
              (io.grpc.stub.StreamObserver<ru.base.grpc.common.CommonMessage.JwtToken>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((ru.base.grpc.auth.AuthMessage.SignUpRequest) request,
              (io.grpc.stub.StreamObserver<ru.base.grpc.common.CommonMessage.JwtToken>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.base.grpc.auth.AuthServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getSignInMethod())
              .addMethod(getSignUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
