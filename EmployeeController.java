package com.aits.Employeedemo.controller;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;



import com.aits.Employeedemo.Employee;

import com.aits.Employeedemo.EmployeeRepository;

@Controller



public class EmployeeController {

	@Autowired

	EmployeeRepository employeerepository;

	

	@GetMapping("/employees/{id}")

	@ResponseBody

	public Optional<Employee> display(@PathVariable Long id) {

		

		return employeerepository.findById(id);

		

	}

	

	

	@PostMapping("/employees")

	@ResponseBody

	public Employee insert(@RequestBody Employee employee) {

		

		employeerepository.save(employee);

		

		return employee;

	}

	

	@PutMapping("/employees/{id}")

	@ResponseBody

	public Employee update(@RequestBody Employee employee,@PathVariable Long id) {

		

		

		if(employeerepository.existsById(id)) {

			

		employee.setId(id);

			employeerepository.save(employee);

			

			return employee;

			

		}

		

		else {

			

			return null;

		}

		

		

	}

	

	

	

	@GetMapping("/employees")

	@ResponseBody

	public List <Employee> display(){

		

		return (List<Employee>) employeerepository.findAll();

	}

	



}

