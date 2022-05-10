package com.bycoders.app.utils.exception;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    private Integer status;
    private String message;
    private Long timestamp;
    private String exception;
}
