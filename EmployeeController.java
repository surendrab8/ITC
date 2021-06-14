package com.hcl.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.employee.model.Employee;
import com.hcl.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@RequestMapping("/hi")
	public String Message() {
		 return "helloworl";
	}
	
	 @Autowired
	EmployeeService service;
	 @PostMapping("/create")
	 public void create(@Validated @RequestBody Employee employee) {
	  service.createEmployee(employee);
	 }
	 @GetMapping("/getAll")
	 public List<Employee> get() {
	  return service.getAllEmployee();
	 }
	 @GetMapping("/get/{id}")
	 public Employee getById(@PathVariable("idNumber") String idNumber) {
	  return service.getEmployeeById(idNumber);
	 }
	 @PutMapping("/update/{id}")public void update(@PathVariable("id") String id, @Validated @RequestBody Employee employee) {
	  service.updateEmployee(id, employee);
	 }
	 @DeleteMapping("/delete/{id}")
	 public void deleteById(@PathVariable("id") String id) {
	  this.service.deleteEmployeeById(id);
	 }
	}
	



