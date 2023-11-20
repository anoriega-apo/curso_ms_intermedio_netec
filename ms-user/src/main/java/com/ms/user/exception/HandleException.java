package com.ms.user.exception;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@ControllerAdvice
@AllArgsConstructor
public class HandleException {

    @ExceptionHandler({MyHandleException.class})
    public ResponseEntity<Object> manejadorPropioException(MyHandleException ex){
        log.error("error personalizado " + ex.getMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(
                "error personalizado " + ex.getMessage(), HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> argumentNotValid(MethodArgumentNotValidException ex){
        List<String> errors = new ArrayList<>();
        for (FieldError error: ex.getBindingResult().getFieldErrors()) {
            errors.add(error.getField() + " : " + error.getDefaultMessage());
        }
        log.error("error system " + "error infor \n{}", errors);
        return  ResponseEntity.badRequest().body(errors);
    }
}
