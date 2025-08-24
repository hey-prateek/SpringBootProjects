package com.example.employee_management.controller;

import com.example.employee_management.dto.EmployeeDTO;
import com.example.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //get all employees
    @GetMapping
    public List<EmployeeDTO> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    //get employee by id
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id)
    {
        Optional<EmployeeDTO> employee=employeeService.findEmployeeById(id);
        return employee.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //create new employee
    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        return employeeService.createNewEmployee(employeeDTO);
    }

}
