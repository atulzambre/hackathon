package com.barclays.hackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclays.hackathon.entity.EmployeeEntity;

@Repository
public interface EmployeeManagementSystemRepository extends JpaRepository<EmployeeEntity, Long> {

	public List<EmployeeEntity> findAll();
}
