package com.ashish.SpringBootprac.demo.error;

import com.ashish.SpringBootprac.demo.entity.Errormessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<Errormessage> departmentNotFoundException(DepartmentNotFoundException exception, WebRequest request){
    Errormessage message=new Errormessage(HttpStatus.NOT_FOUND, exception.getMessage() );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    };
}
