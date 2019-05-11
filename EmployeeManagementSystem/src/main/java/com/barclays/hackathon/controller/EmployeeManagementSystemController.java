package com.barclays.hackathon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.hackathon.entity.EmployeeEntity;
import com.barclays.hackathon.service.EmployeeManagementSystemService;

@RestController
public class EmployeeManagementSystemController {
	
	@Autowired
	private EmployeeManagementSystemService employeeManagementSystemService;

	@GetMapping("/employees")
	public List<EmployeeEntity> getAllEmployees(){
		//List<EmployeeEntity> employeeList=new ArrayList<EmployeeEntity>();
		return employeeManagementSystemService.getAllEmployees();	
	}
	
	@PostMapping("/saveEmployee")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity newEmployee) {
		employeeManagementSystemService.saveEmployee(newEmployee);
		EmployeeEntity employee=new EmployeeEntity();
		return employee;
	}
	
	@GetMapping("/employee/{id}")
	public Optional<EmployeeEntity> getEmployee(@PathVariable long id) {
		return employeeManagementSystemService.getEmployee(id);
	}
	
	@DeleteMapping("/employee/{id}")
	  public void deleteEmployee(@PathVariable Long id) {
	    employeeManagementSystemService.deleteEmployee(id);
	  }
	
}
