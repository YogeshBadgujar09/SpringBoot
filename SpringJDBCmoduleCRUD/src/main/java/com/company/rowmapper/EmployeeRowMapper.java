package com.company.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.company.model.EmployeeModel;

public class EmployeeRowMapper implements RowMapper<EmployeeModel>{

	public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmployeeModel employeeModel = new EmployeeModel();
		
		employeeModel.setEmployeeId(rs.getInt("employeeId"));
		employeeModel.setEmployeeName(rs.getString("employeeName"));
		employeeModel.setEmployeeMobile(rs.getString("employeeMobile"));
		employeeModel.setDobOfJoin(rs.getString("dateOfJoin"));
		
		return employeeModel;
	}

}
