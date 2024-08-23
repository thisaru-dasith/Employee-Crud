package com.ijse.dep.EmployeeCrud.DAO;

import com.ijse.dep.EmployeeCrud.enity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    //2.find the employee by id
    Employee findById(int id);

    //3.method for save and update if id == 0 it is save in merge method
    Employee save(Employee employee);


    //4. delete employee by id
    void deleteById(int theId);
}
