/**
 * @author Arjun Gautam
 * Project :spring-boot-indepth
 * Date : 2021-06-18
 */
package com.arjuncodes.springbootindepth.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DepartmentNameException extends RuntimeException{

    public DepartmentNameException(String message) {
        super(message);
    }

}
