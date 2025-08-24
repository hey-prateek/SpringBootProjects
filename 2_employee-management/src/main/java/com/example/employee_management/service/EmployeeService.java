package com.example.employee_management.service;

import com.example.employee_management.dto.EmployeeDTO;
import com.example.employee_management.model.Employee;
import com.example.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employees
    public List<EmployeeDTO> getAllEmployees()
    {
        return employeeRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    //find employee by id
    public Optional<EmployeeDTO> findEmployeeById(Long id)
    {
        return employeeRepository.findById(id).map(this::convertToDTO);
    }

    //create new employee
    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO)
    {
        Employee employee=convertToEmployee(employeeDTO);
        Employee savedEmployee=employeeRepository.save(employee);
        return convertToDTO(savedEmployee);
    }

    //convert employee to DTO
    private EmployeeDTO convertToDTO(Employee employee)
    {
        return new EmployeeDTO(employee.getId(), employee.getFirstName(), employee.getLastNAME(),
                employee.getEmail(), employee.getDept());
    }

    //convert DTO to employee
    private Employee convertToEmployee(EmployeeDTO employee)
    {
        return new Employee(employee.getId(), employee.getFirstName(), employee.getLastNAME(),
                employee.getEmail(), employee.getDept());
    }
}
