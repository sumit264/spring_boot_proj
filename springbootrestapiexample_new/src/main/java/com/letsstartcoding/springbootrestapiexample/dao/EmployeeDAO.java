package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Employee;
import com.letsstartcoding.springbootrestapiexample.repository.EmployeeRepository;
@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	
	//To Save an Employee
	
	public Employee save(Employee emp) {
		System.out.println("-------------2----------");
		return employeeRepository.save(emp);
		
	}
	
	//Search an Employee
	
	public List<Employee> findall(){
		return employeeRepository.findAll();
		
	}
	
	//Update an Employee
	
	//get an Employee by Id
	
	
	public Employee findone(Long empId) {
		return employeeRepository.findOne(empId);
		
	}
	
	//delete an Employee
	
	public void delete(Employee emp) {
		
		employeeRepository.delete(emp);
	}
	
	

}
