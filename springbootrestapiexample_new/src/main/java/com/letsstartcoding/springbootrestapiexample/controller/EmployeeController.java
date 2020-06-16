package com.letsstartcoding.springbootrestapiexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.dao.EmployeeDAO;
import com.letsstartcoding.springbootrestapiexample.exceptionhandling.ResourceNotFoundException;
import com.letsstartcoding.springbootrestapiexample.model.Employee;

@RestController
//@RequestMapping("/company")

//http://localhost:8081/v2/api-docs (Url for swagger json format o/p)
//http://localhost:8081/swagger-ui.html(Url for swagger html format o/p)
//Add this file in git

@RequestMapping(value = {"/company", "/api","/"})
public class EmployeeController {
	
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	EmployeeDAO employeeDAO;
	
	
	
	//To Save Employee into db
	
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) throws ResourceNotFoundException {
		
		System.out.println("===============1=================");
		logger.error("Enabled logging");
		//Check for Exceptioin
		
		if(employee.getId()==null) {
			
			throw new ResourceNotFoundException("ID NOT FOUND");
		}
		return employeeDAO.save(employee);
		}
	
	//Get all Employee
	@GetMapping("employees")
	public List<Employee> getAllEmployees(){
		logger.trace("Method Access");
		
		logger.error("Enabled logging");
		return employeeDAO.findall();
		}
	
	
	
	
	@GetMapping("/notes/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable (value="id") Long empid){
		
		Employee emp=employeeDAO.findone(empid);
		
		if(emp==null) {
			
			return (ResponseEntity<Employee>) ResponseEntity.notFound();
		}
		
		return ResponseEntity.ok().body(emp);
				}
	
//update an employee by empid
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable (value="id") Long empId, @Valid @RequestBody Employee empdetails){

		System.out.println("=========put=========="+empId);
		Employee emp=employeeDAO.findone(empId);
		
		if(emp==null) {
			
			return (ResponseEntity<Employee>) ResponseEntity.notFound();
		}
		emp.setName(empdetails.getName());
		emp.setDesignation(empdetails.getDesignation());
		emp.setCreatedAt(empdetails.getCreatedAt());
		emp.setExpertise(empdetails.getExpertise());
		
		Employee updateEmployee=employeeDAO.save(emp);
		return ResponseEntity.ok().body(updateEmployee);
		
		
	}
	
	//delete an Employee
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable (value="id") Long empid){
		Employee emp=employeeDAO.findone(empid);
		
		if(emp==null) {
			
			return ResponseEntity.notFound().build();
		}
		
		
		 employeeDAO.delete(emp);
	

			return ResponseEntity.ok().build();
	}
	
	
	//===================Spring Security================
	
	/*@GetMapping("/")
	public String home() {
		return ("<h1>Welcome Spring Security</h1>");
		
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome Spring Security user</h1>");
		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Spring Security admin</h1>");
		
	}
*/	
}
