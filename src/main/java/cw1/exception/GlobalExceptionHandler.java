package cw1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.converter.HttpMessageNotReadableException;


    @ControllerAdvice
    public class GlobalExceptionHandler {


        @ExceptionHandler({ InvalidDataException.class, MethodArgumentNotValidException.class, HttpMessageNotReadableException.class })
        public ResponseEntity<String> handleBadRequest(Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }