package com.ijse.dep.EmployeeCrud.controller;

import com.ijse.dep.EmployeeCrud.enity.Employee;
import com.ijse.dep.EmployeeCrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService =  employeeService;
    }

    public List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }
}
