package com.company.operation;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import com.company.model.EmployeeModel;
import com.company.rowmapper.EmployeeRowMapper;

public class EmployeeCRUDoperation {
	
	private EmployeeModel employeeModel;
	
	public void addEmployee(JdbcTemplate jdbcTemplate, Scanner scanner) {
		
		System.out.println("\n\n++++++++++++++++++++++ Add Employee ++++++++++++++++++");
		
		employeeModel = new EmployeeModel();
		
		System.out.println("Enter Employee id :");
    	employeeModel.setEmployeeId(scanner.nextInt());
    	

    	System.out.println("Enter Employee Name :");
    	employeeModel.setEmployeeName(scanner.next());
    	

    	System.out.println("Enter Employee Mobile  :");
    	employeeModel.setEmployeeMobile(scanner.next());
    	

    	System.out.println("Enter Employee Date Of Joining :");
    	employeeModel.setDobOfJoin(scanner.next());
    	    	
    	//Data Insert
    	String employeeInsert = "INSERT INTO employee VALUES(?,?,?,?)";
    	int a = jdbcTemplate.update(employeeInsert, employeeModel.getEmployeeId(), employeeModel.getEmployeeName(), employeeModel.getEmployeeMobile(), employeeModel.getDobOfJoin());
    	
    	workingMessage(a, "Added Employee", "Not added");
    	
	}
	
	public void updateEmployee(JdbcTemplate jdbcTemplate, Scanner scanner) {
		
		System.out.println("\n\n+++++++++++++++++++ Employee Update ++++++++++++++++++");
		
		employeeModel = searchEmployeeById(jdbcTemplate, scanner);
		
		if(employeeModel != null)
		{
			System.out.println("******* Confirm your Data : **********\n\n" + employeeModel.toString());
			
			System.out.println("Enter Employee Name :");
	    	employeeModel.setEmployeeName(scanner.next());
	    	

	    	System.out.println("Enter Employee Mobile  :");
	    	employeeModel.setEmployeeMobile(scanner.next());
	    	
	    	String employeeUpdateQuery = "UPDATE employee SET employeeName = ?, employeeMobile = ? WHERE employeeId = ?";
	    	
	    	int a = jdbcTemplate.update(employeeUpdateQuery, employeeModel.getEmployeeName(), employeeModel.getEmployeeMobile(), employeeModel.getEmployeeId());
	    	
	    	workingMessage(a, "Updated ok", "Not Update");
	   
		}		
	}
	
	public EmployeeModel searchEmployeeById(JdbcTemplate jdbcTemplate, Scanner scanner) {
		
		System.out.println("\n\n++++++++++++++++++++++ Search Employee +++++++++++++++++++");
		employeeModel = new EmployeeModel();
		
		System.out.println("Enter EmployeeId for Search :");
		int employeeId = scanner.nextInt();
		
		String employeeSearchQuery = "SELECT * FROM employee WHERE employeeId = ?";
		employeeModel = (EmployeeModel) jdbcTemplate.queryForObject(employeeSearchQuery, new EmployeeRowMapper(), employeeId);
		
//		System.out.println("********** Employee Info **********\n\n" + employeeModel.toString());
		if(employeeModel != null) {
			return employeeModel;
		}else {
			System.out.println("Emmployee Not found ... !!!");
		}
		
		return null ;
	}
	
	public void getEmployeeList(JdbcTemplate jdbcTemplate) {
		
		System.out.println("\n\n++++++++++++++++++++ List of Employee ++++++++++++++++");
		
		String employeeSearchQuery = "SELECT * FROM employee";
		List<EmployeeModel> employeeList = jdbcTemplate.query(employeeSearchQuery, new EmployeeRowMapper());
		
		System.out.println("Employee List");
		for(EmployeeModel employeeModel : employeeList) {
			System.out.println(employeeModel.toString());
		}
	}
	
	
	public void deleteEmployee(JdbcTemplate jdbcTemplate, Scanner scanner) {
		
		System.out.println("\n\n+++++++++++++++++++++++++++  Delete Employee +++++++++++++++++++++++++");
		
		employeeModel = searchEmployeeById(jdbcTemplate, scanner);
		
		if(employeeModel != null) {
			
			String employeeDeleteQuery = "DELETE employee WHERE employeeId = ?";
			int a = jdbcTemplate.update(employeeDeleteQuery, employeeModel.getEmployeeId());
			
			workingMessage(a, "Delete Employee", "Not Delete");
		}
	}
	
	public void workingMessage(int a,  String sucessfull, String unsucessfull) {
		
		if(a > 0) {
    		System.out.println(sucessfull);
    	}else {
    		System.out.println(unsucessfull);
    	}
		
	}
	
}
