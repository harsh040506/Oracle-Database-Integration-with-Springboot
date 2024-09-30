package com.example.sqlintegration.Controller;

import com.example.sqlintegration.Service.EmployeeService101;
import com.example.sqlintegration.Entity.Employee101;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController101 {

    @Autowired
    private EmployeeService101 service;

    @PostMapping("/addEmployee")
    public Employee101 addEmployee(@RequestBody Employee101 employee) {
        return service.saveEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee101> addEmployees(@RequestBody List<Employee101> employees) {
        return service.saveEmployees(employees);
    }

    @GetMapping("/Employees")
    public List<Employee101> findAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/EmployeeByEmpId/{id}")
    public Employee101 findEmployeeByEmpId(@PathVariable int empId) {
        return service.getEmployeeById(empId);
    }

    @GetMapping("/Employee/{firstName}")
    public Employee101 findEmployeeByFirstName(@PathVariable String firstName) {
        return
            service.getEmployeeByFirstName(firstName);
    }

    @PutMapping("/update")
    public Employee101 updateEmployee(@RequestBody Employee101 employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployee(@PathVariable int empId) {
        return service.deleteEmployee(empId);
    }
}