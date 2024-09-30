package com.example.sqlintegration.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "EMPLOYEE101")
public class Employee101 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specify the strategy if needed
    private int empId;

    @Column(name = "Fname")
    private String firstName;

    @Column(name = "Lname")
    private String lastName;

    @Column(name = "Bdate", nullable = false, length = 200)
    private String Bdate;

    @Override
    public String toString() {
        return "Employee101{" +
                "EmpId=" + empId +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Bdate='" + Bdate + '\'' +
                '}';
    }
}