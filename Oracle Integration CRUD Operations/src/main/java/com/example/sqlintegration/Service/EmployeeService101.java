package com.example.sqlintegration.Service;

import com.example.sqlintegration.Entity.Employee101;
import com.example.sqlintegration.Repository.EmployeeRepository101;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService101 {

    @Autowired
    private EmployeeRepository101 repository;

    public Employee101 saveEmployee(Employee101 employee) {
        return repository.save(employee);
    }

    public List<Employee101> saveEmployees(List<Employee101> employees) {
        return repository.saveAll(employees);
    }

    public List<Employee101> getEmployees() {
        return repository.findAll();
    }

    public Employee101 getEmployeeById(int empId) {
        return repository.findById(empId).orElse(null);
    }

    public Employee101 getEmployeeByFirstName(String name) {
        return
            repository.findByFirstName(name); }

    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "Employee removed !! " + id;
    }

    public Employee101 updateEmployee(Employee101 employee) {
        Employee101 existingEmployee = repository.findById(employee.getEmpId()).orElse(null);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setBdate(employee.getBdate());
        return repository.save(existingEmployee);
    }
}