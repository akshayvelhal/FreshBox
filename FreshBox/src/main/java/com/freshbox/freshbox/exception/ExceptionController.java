/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freshbox.freshbox.exception;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Akshay Velhal
 */
@ControllerAdvice
public class ExceptionController {
    
    
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
        @ExceptionHandler(Exception.class)
        @ResponseBody ErrorInfo handelAllError(HttpServletRequest req, Exception ex) {
            return new ErrorInfo(req.getRequestURL(), ex);
        }
    
}
