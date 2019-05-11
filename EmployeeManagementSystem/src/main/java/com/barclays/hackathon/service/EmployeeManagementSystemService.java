package com.barclays.hackathon.service;

import java.util.List;
import java.util.Optional;

import com.barclays.hackathon.entity.EmployeeEntity;

public interface EmployeeManagementSystemService {

	public List<EmployeeEntity> getAllEmployees();
	
	public void saveEmployee(EmployeeEntity newEmployee);
	
	public Optional<EmployeeEntity> getEmployee(long id);
	
	public void deleteEmployee(long id);
}
