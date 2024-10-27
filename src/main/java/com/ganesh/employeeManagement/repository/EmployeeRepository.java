package com.ganesh.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.employeeManagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
