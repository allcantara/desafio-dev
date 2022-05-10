package com.bycoders.app.utils.exception;

import java.io.Serial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ByCodersAppException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public ByCodersAppException(String message) {
        super(message);
    }

    public ByCodersAppException(String message, Exception e) {
        super(message, e);
    }

    public ByCodersAppException(Exception e) {
        super(e);
    }
}
