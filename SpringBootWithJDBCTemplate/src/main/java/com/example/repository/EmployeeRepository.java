package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	// Add new employee
    public void addEmployee(String firstName, String lastName, String email, Integer salary ) {

        jdbcTemplate.update("INSERT INTO employee(first_name, last_name, email, salary) VALUES (?,?,?,?)",
        		firstName, lastName, email, salary );

    }

}
