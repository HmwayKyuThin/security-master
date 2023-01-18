package com.example.securitymaster.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorController {
    private Logger logger = LoggerFactory.getLogger(ErrorController.class);
    @ExceptionHandler(Throwable.class)
    //@ResponseStatus(HttpStatus.FORBIDDEN)
    public String handleErrors(Throwable throwable, Model model,HttpServletResponse response)throws Throwable{
        //logger.info(throwable.getCause().getMessage());
        //String  msg = throwable != null ? throwable.getMessage(): "unknown error.";
        model.addAttribute("status",response.getStatus());
        model.addAttribute("exception",throwable);
        model.addAttribute("errorMessage","Unknown Error.");
        return "error";
    }
    @ModelAttribute("response")
    public HttpServletResponse httpServletResponse(HttpServletResponse response){
        return response;
    }
}
