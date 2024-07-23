package ru.base.gateway.handler;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AuthExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {StatusRuntimeException.class})
    protected ResponseEntity<Object> handleAuthException(StatusRuntimeException ex, WebRequest request) {
        if (Status.UNAUTHENTICATED.getCode().equals(ex.getStatus().getCode())) {
            return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.UNAUTHORIZED, request);
        } else if (Status.ALREADY_EXISTS.getCode().equals(ex.getStatus().getCode())) {
            return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
        }
        throw new IllegalArgumentException("Unknown exception");
    }

}
