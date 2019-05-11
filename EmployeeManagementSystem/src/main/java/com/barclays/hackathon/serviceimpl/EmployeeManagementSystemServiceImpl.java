package com.barclays.hackathon.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.hackathon.entity.EmployeeEntity;
import com.barclays.hackathon.repository.EmployeeManagementSystemRepository;
import com.barclays.hackathon.service.EmployeeManagementSystemService;

@Service
public class EmployeeManagementSystemServiceImpl implements EmployeeManagementSystemService {

	@Autowired
	private EmployeeManagementSystemRepository employeeManagementSystemRepository;
	
	
	public List<EmployeeEntity> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeManagementSystemRepository.findAll();
	}


	public void saveEmployee(EmployeeEntity newEmployee) {
		// TODO Auto-generated method stub
		
		employeeManagementSystemRepository.save(newEmployee);	
		
	}


	public Optional<EmployeeEntity> getEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeManagementSystemRepository.findById(id);
	}


	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeManagementSystemRepository.deleteById(id);
		
	}

}
