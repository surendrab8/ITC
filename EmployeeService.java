package com.hcl.employee.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.employee.model.Employee;


@Service
public class EmployeeService {
	
	 private List<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(
			  new Employee("1", "ram", "20", 78800, "raj"), new Employee("2", "arun", "21", 0, null), new Employee("3", "karthick", "22", 0, null)
			 ));
			 public void createEmployee(Employee employee) {
				 employeeList.add(employee);
			 }
			 public List<Employee> getAllEmployee() {
			  return employeeList;
			 }
			 public Employee getEmployeeById(String id) {
			  return employeeList.stream().filter(employee -> employee.getIdNumber().equals(id)).findFirst().get();
			 }
			 public void updateEmployee(String id, Employee employee) {
			  int counter = 0;
			  for (Employee eachEmployee: employeeList) {
			   if (eachEmployee.getClass().equals(id)) {
				   employeeList.set(counter, employee);
			   }
			   counter++;
			  }
			 }
			 public void deleteEmployeeById(String id) {
				 employeeList.removeIf(employee -> employee.getIdNumber().equals(id));
			 }
			

		}


