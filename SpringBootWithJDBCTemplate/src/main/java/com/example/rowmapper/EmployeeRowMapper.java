/*package com.example.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.example.dao.Employee;

public class EmployeeRowMapper implements RowMapper<com.example.dao.Employee> {

	@Override
	public Employee mapRow(ResultSet row, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setFirstName(row.getString("firstName"));
		employee.setLastName(row.getString("lastName"));
		employee.setEmail(row.getString("email"));
		employee.setSalary(row.getInt("salary"));
		return employee;
	}

}
*/