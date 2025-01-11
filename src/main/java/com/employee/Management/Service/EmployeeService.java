package com.employee.Management.Service;

import java.util.List;

import com.employee.Management.Entity.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int theId);

}
