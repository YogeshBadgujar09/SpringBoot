package com.yogesh.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<StudentModel>{

	public StudentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StudentModel studentModel = new StudentModel();
		
		studentModel.setRollNo(rs.getInt("rollNo"));
		studentModel.setName(rs.getString("name"));
		studentModel.setCourse(rs.getString("course"));
		
		return studentModel;
	}

	

}
