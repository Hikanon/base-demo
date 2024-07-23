package ru.base.common.exception;

import lombok.Getter;
import ru.base.grpc.error.ErrorMessage;

@Getter
public class EntityDataExistsException extends RuntimeException {

    private final ErrorMessage.ErrorCode code;

    public EntityDataExistsException(ErrorMessage.ErrorCode code) {
        this.code = code;
    }

}
