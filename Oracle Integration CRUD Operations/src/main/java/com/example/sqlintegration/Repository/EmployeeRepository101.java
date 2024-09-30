package com.example.sqlintegration.Repository;

import com.example.sqlintegration.Entity.Employee101;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository101 extends JpaRepository<Employee101,Integer> {

    Employee101 findByFirstName(String name);

}