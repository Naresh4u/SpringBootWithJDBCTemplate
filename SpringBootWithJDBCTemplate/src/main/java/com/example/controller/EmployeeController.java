package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Employee;
import com.example.repository.EmployeeRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/employee/")
@ActiveProfiles(value = "development")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	@ApiOperation(value = "Add employee service", notes = "Returns a success message. SLA:500", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Empleoyee inserted successfully", response = String.class),
			@ApiResponse(code = 400, message = "Invalid Input Provided"),
			@ApiResponse(code = 404, message = "Does Not Exist") })
	public String addEmployee(@RequestBody  Employee employee)
	{
		if(employee!= null)
		{
			employeeRepository.addEmployee(employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getSalary());
			return "Successfully Inserted The Record";
		}
		else{
			return "Failed To Insert The Record"; 
		}
	}
	
}
