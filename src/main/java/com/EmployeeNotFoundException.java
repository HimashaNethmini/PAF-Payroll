package com;

public class EmployeeNotFoundException extends RuntimeException {
    
    //exception class
    EmployeeNotFoundException(Long id) {
        super("Could not find the employee" + id);
    }
}
