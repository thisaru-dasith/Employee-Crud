package com.ijse.dep.EmployeeCrud.DAO;

import com.ijse.dep.EmployeeCrud.enity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
