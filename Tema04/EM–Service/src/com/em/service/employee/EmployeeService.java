package com.em.service.employee;

import com.em.common.model.Employee;

public class EmployeeService {
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Peter");
        employee.setLasttName("Milanovich");
        employee.setDesignation("Scrum Master");
        
        return employee;
    }
}