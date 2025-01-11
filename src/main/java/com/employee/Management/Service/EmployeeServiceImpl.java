package com.employee.Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Management.Entity.Employee;
import com.employee.Management.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository=theEmployeeRepository;
	}
	
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result=employeeRepository.findById(theId);
		Employee theEmployee=null;
		if(result.isPresent()) {
			theEmployee=result.get();
		}
		else {
			throw new RuntimeException("Employee not found at Id: " + theId);
		}
		return theEmployee;
	}

	@Override
	public Employee save(Employee theEmployee) {
		return employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
		
	}

}
