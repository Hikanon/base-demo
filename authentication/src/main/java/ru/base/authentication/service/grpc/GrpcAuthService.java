package ru.base.authentication.service.grpc;

import com.google.common.base.Converter;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.base.authentication.exception.AuthenticationException;
import ru.base.authentication.service.api.AuthService;
import ru.base.common.model.dto.sign.SignInData;
import ru.base.common.model.dto.sign.SignUpData;
import ru.base.grpc.auth.AuthMessage;
import ru.base.grpc.auth.AuthServiceGrpc;
import ru.base.grpc.common.CommonMessage;

/**
 * gRPC сервис авторизации пользователя
 *
 * @author Makhanov
 */
@GrpcService
public class GrpcAuthService extends AuthServiceGrpc.AuthServiceImplBase {

    private final AuthService authService;
    private final Converter<SignInData, AuthMessage.SignInRequest> signInConverter;
    private final Converter<SignUpData, AuthMessage.SignUpRequest> signUpConverter;

    public GrpcAuthService(AuthService authService,
                           @Qualifier("signInConverter") Converter<SignInData, AuthMessage.SignInRequest> signInConverter,
                           @Qualifier("signUpConverter") Converter<SignUpData, AuthMessage.SignUpRequest> signUpConverter) {
        this.authService = authService;
        this.signInConverter = signInConverter;
        this.signUpConverter = signUpConverter;
    }

    /**
     * Выполняет авторизацию пользователя по логину и паролю,
     * В responseObserver записывается JWT токен
     *
     * @author Makhanov
     */
    @Override
    public void signIn(AuthMessage.SignInRequest request, StreamObserver<CommonMessage.JwtToken> responseObserver) {
        SignInData signInData = signInConverter.reverse().convert(request);
        try {
            responseObserver.onNext(
                    CommonMessage.JwtToken
                            .newBuilder()
                            .setJwtToken(authService.signIn(signInData))
                            .build()
            );
            responseObserver.onCompleted();
        } catch (AuthenticationException e) {
            responseObserver.onError(Status.UNAUTHENTICATED.withDescription("Incorrect authorization data").asRuntimeException());
        }

    }

    /**
     * Выполняет регистрацию пользователя по логину и паролю.
     * В responseObserver записывается JWT токен
     *
     * @author Makhanov
     */
    @Override
    public void signUp(AuthMessage.SignUpRequest request, StreamObserver<CommonMessage.JwtToken> responseObserver) {
        try {

            SignUpData signUpData = signUpConverter.reverse().convert(request);
            responseObserver.onNext(
                    CommonMessage.JwtToken
                            .newBuilder()
                            .setJwtToken(authService.signUp(signUpData))
                            .build()
            );
            responseObserver.onCompleted();
        } catch (StatusRuntimeException e) {
            responseObserver.onError(e.getStatus().withDescription(e.getStatus().getDescription()).asRuntimeException());
        }
    }

}
