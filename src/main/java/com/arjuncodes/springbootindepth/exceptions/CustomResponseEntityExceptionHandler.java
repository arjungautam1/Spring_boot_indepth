/**
 * @author Arjun Gautam
 * Project :spring-boot-indepth
 * Date : 2021-06-18
 */
package com.arjuncodes.springbootindepth.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public final ResponseEntity<?> handleDepartmentException(DepartmentNameException ex, WebRequest request) {
        DepartmentNameExceptionResponse response = new DepartmentNameExceptionResponse(ex.getMessage());
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

}
