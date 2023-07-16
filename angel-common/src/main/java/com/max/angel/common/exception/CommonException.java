package com.max.angel.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class CommonException extends RuntimeException {

    private int code;
    private String message;
}
