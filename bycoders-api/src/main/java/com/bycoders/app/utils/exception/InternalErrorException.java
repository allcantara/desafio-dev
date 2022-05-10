package com.bycoders.app.utils.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@AllArgsConstructor
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalErrorException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public InternalErrorException(String message) {
        super(message);
    }

    public InternalErrorException(String message, Exception e) {
        super(message, e);
    }

    public InternalErrorException(Exception e) {
        super(e);
    }
}
