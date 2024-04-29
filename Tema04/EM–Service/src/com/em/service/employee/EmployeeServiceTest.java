package com.em.service.employee;

import com.em.common.model.Employee;

public class EmployeeServiceTest {
 
    public static void main(String... args) {
    
        Employee e = new EmployeeService().getEmployee();
        
        System.out.println(e.getFirstName());
        System.out.println(e.getLasttName());
        System.out.println(e.getDesignation());
    }
}

