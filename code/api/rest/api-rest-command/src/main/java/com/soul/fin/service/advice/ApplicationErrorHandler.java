package com.soul.fin.service.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;

@ControllerAdvice
public class ApplicationErrorHandler {

    private static final Logger log = LoggerFactory.getLogger(ApplicationErrorHandler.class);

    @ExceptionHandler(ResourceAccessException.class)
    public ProblemDetail handle(ResourceAccessException exception){
        log.error("resource access error", exception);
        return ProblemDetail.forStatusAndDetail(HttpStatus.SERVICE_UNAVAILABLE, exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ProblemDetail handle(Exception exception){
        log.error("unhandled error", exception);
        return ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
    }
}
