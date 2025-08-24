package com.example.employee_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastNAME;
    private String email;
    private String dept;

    public Employee(Long id, String firstName, String lastNAME, String email, String dept) {
        this.id = id;
        this.firstName = firstName;
        this.lastNAME = lastNAME;
        this.email = email;
        this.dept = dept;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNAME(String lastNAME) {
        this.lastNAME = lastNAME;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNAME() {
        return lastNAME;
    }

    public String getEmail() {
        return email;
    }

    public String getDept() {
        return dept;
    }
}
