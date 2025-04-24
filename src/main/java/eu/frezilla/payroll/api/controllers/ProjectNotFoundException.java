package eu.frezilla.payroll.api.controllers;

public class ProjectNotFoundException extends RuntimeException {

    ProjectNotFoundException(Long id) {
        super("Could not find project " + id);
    }
    
}
