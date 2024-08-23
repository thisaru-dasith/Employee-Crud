package com.ijse.dep.EmployeeCrud.DAO.impl;

import com.ijse.dep.EmployeeCrud.DAO.EmployeeDAO;
import com.ijse.dep.EmployeeCrud.enity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    //1. set EntityManger field
    private EntityManager entityManger;
    //2. create constructor for inject entitymanager

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManger = entityManager;
    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManger.createQuery("from Employee ", Employee.class);

        List<Employee> employees = query.getResultList();
        return employees;

    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManger.find(Employee.class, id);
        return employee;
    }

    //3.method for save and update if id == 0 it is save in merge method
    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManger.merge(theEmployee);
        return dbEmployee;

    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        //1. find the Employee
        Employee employee = entityManger.find(Employee.class, theId);

        //2. delete the employee
        entityManger.remove(employee);
    }
}
