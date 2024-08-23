package com.ijse.dep.EmployeeCrud.service;

import com.ijse.dep.EmployeeCrud.enity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
