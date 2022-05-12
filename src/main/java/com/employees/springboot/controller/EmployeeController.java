package com.employees.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.springboot.exception.ResourceNotFoundException;
import com.employees.springboot.model.Employee;
import com.employees.springboot.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	// Add new employee
	@PostMapping("/employees")
	public String addNewEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "The new employee has been saved!";
	}
	
	// get one employee
	@GetMapping("/employees/{id}")
	public Employee findEmployeeById(@PathVariable Long id ) {
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found!"));
	}
	
	// update an employee
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		return employeeRepository.findById(id)
				.map(employee-> {
					employee.setFirstName(newEmployee.getFirstName());
					employee.setLastName(newEmployee.getLastName());
					employee.setEmailId(newEmployee.getEmailId());
					return employeeRepository.save(employee);
					})
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found!"));
	}
	
}
