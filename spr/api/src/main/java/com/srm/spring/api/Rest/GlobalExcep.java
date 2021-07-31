package com.srm.spring.api.Rest;

import com.srm.spring.api.vo.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExcep extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value={RuntimeException.class})
    public ResponseEntity<Error> handleRtException(RuntimeException ex, WebRequest req) {
        Error error = new Error();
        error.setId(System.currentTimeMillis() + "");
        error.setErrcode("Err001");
        error.setCategory(ex.toString().concat(",contact your system admin"));
        error.setMessage("general runtime");
        System.err.println("error occured"+ error.toString());
        ex.printStackTrace();
        return new ResponseEntity<Error>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    }

  
}
