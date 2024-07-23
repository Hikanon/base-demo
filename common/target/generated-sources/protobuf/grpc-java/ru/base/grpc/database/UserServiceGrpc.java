package ru.base.grpc.database;

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
    comments = "Source: DatabaseService.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "ru.base.grpc.database.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Id,
      ru.base.grpc.user.UserMessage.FullUserData> getFindUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUserById",
      requestType = ru.base.grpc.common.CommonMessage.Id.class,
      responseType = ru.base.grpc.user.UserMessage.FullUserData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Id,
      ru.base.grpc.user.UserMessage.FullUserData> getFindUserByIdMethod() {
    io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Id, ru.base.grpc.user.UserMessage.FullUserData> getFindUserByIdMethod;
    if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
          UserServiceGrpc.getFindUserByIdMethod = getFindUserByIdMethod =
              io.grpc.MethodDescriptor.<ru.base.grpc.common.CommonMessage.Id, ru.base.grpc.user.UserMessage.FullUserData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.common.CommonMessage.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.user.UserMessage.FullUserData.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserById"))
              .build();
        }
      }
    }
    return getFindUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Username,
      ru.base.grpc.user.UserMessage.FullUserData> getFindUserByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUserByUsername",
      requestType = ru.base.grpc.common.CommonMessage.Username.class,
      responseType = ru.base.grpc.user.UserMessage.FullUserData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Username,
      ru.base.grpc.user.UserMessage.FullUserData> getFindUserByUsernameMethod() {
    io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Username, ru.base.grpc.user.UserMessage.FullUserData> getFindUserByUsernameMethod;
    if ((getFindUserByUsernameMethod = UserServiceGrpc.getFindUserByUsernameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserByUsernameMethod = UserServiceGrpc.getFindUserByUsernameMethod) == null) {
          UserServiceGrpc.getFindUserByUsernameMethod = getFindUserByUsernameMethod =
              io.grpc.MethodDescriptor.<ru.base.grpc.common.CommonMessage.Username, ru.base.grpc.user.UserMessage.FullUserData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findUserByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.common.CommonMessage.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.user.UserMessage.FullUserData.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserByUsername"))
              .build();
        }
      }
    }
    return getFindUserByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Email,
      ru.base.grpc.user.UserMessage.FullUserData> getFindUserByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUserByEmail",
      requestType = ru.base.grpc.common.CommonMessage.Email.class,
      responseType = ru.base.grpc.user.UserMessage.FullUserData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Email,
      ru.base.grpc.user.UserMessage.FullUserData> getFindUserByEmailMethod() {
    io.grpc.MethodDescriptor<ru.base.grpc.common.CommonMessage.Email, ru.base.grpc.user.UserMessage.FullUserData> getFindUserByEmailMethod;
    if ((getFindUserByEmailMethod = UserServiceGrpc.getFindUserByEmailMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserByEmailMethod = UserServiceGrpc.getFindUserByEmailMethod) == null) {
          UserServiceGrpc.getFindUserByEmailMethod = getFindUserByEmailMethod =
              io.grpc.MethodDescriptor.<ru.base.grpc.common.CommonMessage.Email, ru.base.grpc.user.UserMessage.FullUserData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findUserByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.common.CommonMessage.Email.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.user.UserMessage.FullUserData.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserByEmail"))
              .build();
        }
      }
    }
    return getFindUserByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.base.grpc.user.UserMessage.FullUserData,
      ru.base.grpc.user.UserMessage.FullUserData> getSaveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUser",
      requestType = ru.base.grpc.user.UserMessage.FullUserData.class,
      responseType = ru.base.grpc.user.UserMessage.FullUserData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.base.grpc.user.UserMessage.FullUserData,
      ru.base.grpc.user.UserMessage.FullUserData> getSaveUserMethod() {
    io.grpc.MethodDescriptor<ru.base.grpc.user.UserMessage.FullUserData, ru.base.grpc.user.UserMessage.FullUserData> getSaveUserMethod;
    if ((getSaveUserMethod = UserServiceGrpc.getSaveUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSaveUserMethod = UserServiceGrpc.getSaveUserMethod) == null) {
          UserServiceGrpc.getSaveUserMethod = getSaveUserMethod =
              io.grpc.MethodDescriptor.<ru.base.grpc.user.UserMessage.FullUserData, ru.base.grpc.user.UserMessage.FullUserData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.user.UserMessage.FullUserData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.base.grpc.user.UserMessage.FullUserData.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("saveUser"))
              .build();
        }
      }
    }
    return getSaveUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findUserById(ru.base.grpc.common.CommonMessage.Id request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void findUserByUsername(ru.base.grpc.common.CommonMessage.Username request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void findUserByEmail(ru.base.grpc.common.CommonMessage.Email request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByEmailMethod(), responseObserver);
    }

    /**
     */
    public void saveUser(ru.base.grpc.user.UserMessage.FullUserData request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.base.grpc.common.CommonMessage.Id,
                ru.base.grpc.user.UserMessage.FullUserData>(
                  this, METHODID_FIND_USER_BY_ID)))
          .addMethod(
            getFindUserByUsernameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.base.grpc.common.CommonMessage.Username,
                ru.base.grpc.user.UserMessage.FullUserData>(
                  this, METHODID_FIND_USER_BY_USERNAME)))
          .addMethod(
            getFindUserByEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.base.grpc.common.CommonMessage.Email,
                ru.base.grpc.user.UserMessage.FullUserData>(
                  this, METHODID_FIND_USER_BY_EMAIL)))
          .addMethod(
            getSaveUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.base.grpc.user.UserMessage.FullUserData,
                ru.base.grpc.user.UserMessage.FullUserData>(
                  this, METHODID_SAVE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void findUserById(ru.base.grpc.common.CommonMessage.Id request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUserByUsername(ru.base.grpc.common.CommonMessage.Username request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUserByEmail(ru.base.grpc.common.CommonMessage.Email request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveUser(ru.base.grpc.user.UserMessage.FullUserData request,
        io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.base.grpc.user.UserMessage.FullUserData findUserById(ru.base.grpc.common.CommonMessage.Id request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.base.grpc.user.UserMessage.FullUserData findUserByUsername(ru.base.grpc.common.CommonMessage.Username request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.base.grpc.user.UserMessage.FullUserData findUserByEmail(ru.base.grpc.common.CommonMessage.Email request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.base.grpc.user.UserMessage.FullUserData saveUser(ru.base.grpc.user.UserMessage.FullUserData request) {
      return blockingUnaryCall(
          getChannel(), getSaveUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.base.grpc.user.UserMessage.FullUserData> findUserById(
        ru.base.grpc.common.CommonMessage.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.base.grpc.user.UserMessage.FullUserData> findUserByUsername(
        ru.base.grpc.common.CommonMessage.Username request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.base.grpc.user.UserMessage.FullUserData> findUserByEmail(
        ru.base.grpc.common.CommonMessage.Email request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.base.grpc.user.UserMessage.FullUserData> saveUser(
        ru.base.grpc.user.UserMessage.FullUserData request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_USER_BY_ID = 0;
  private static final int METHODID_FIND_USER_BY_USERNAME = 1;
  private static final int METHODID_FIND_USER_BY_EMAIL = 2;
  private static final int METHODID_SAVE_USER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_USER_BY_ID:
          serviceImpl.findUserById((ru.base.grpc.common.CommonMessage.Id) request,
              (io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData>) responseObserver);
          break;
        case METHODID_FIND_USER_BY_USERNAME:
          serviceImpl.findUserByUsername((ru.base.grpc.common.CommonMessage.Username) request,
              (io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData>) responseObserver);
          break;
        case METHODID_FIND_USER_BY_EMAIL:
          serviceImpl.findUserByEmail((ru.base.grpc.common.CommonMessage.Email) request,
              (io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData>) responseObserver);
          break;
        case METHODID_SAVE_USER:
          serviceImpl.saveUser((ru.base.grpc.user.UserMessage.FullUserData) request,
              (io.grpc.stub.StreamObserver<ru.base.grpc.user.UserMessage.FullUserData>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.base.grpc.database.DatabaseService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getFindUserByIdMethod())
              .addMethod(getFindUserByUsernameMethod())
              .addMethod(getFindUserByEmailMethod())
              .addMethod(getSaveUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
