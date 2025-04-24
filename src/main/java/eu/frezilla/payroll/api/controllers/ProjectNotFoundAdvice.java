package eu.frezilla.payroll.api.controllers;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectNotFoundAdvice {
    
    @ExceptionHandler(ProjectNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public String projectNotFoundHandler(ProjectNotFoundException ex) {
        return ex.getMessage();
    }
    
}
