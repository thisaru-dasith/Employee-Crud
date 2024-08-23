package com.ijse.dep.EmployeeCrud.service.ServiceImpl;

import com.ijse.dep.EmployeeCrud.DAO.EmployeeDAO;
import com.ijse.dep.EmployeeCrud.enity.Employee;
import com.ijse.dep.EmployeeCrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }
}
