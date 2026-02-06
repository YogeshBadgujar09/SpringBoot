package com.company.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.company.model.EmployeeModel;
import com.company.operation.EmployeeCRUDoperation;
import com.company.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	EmployeeModel employeeModel = new EmployeeModel();
    	
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
    	
    	EmployeeCRUDoperation employeeCRUDoperation = new EmployeeCRUDoperation();
    	
    	employeeCRUDoperation.addEmployee(jdbcTemplate, scanner);
    	employeeCRUDoperation.updateEmployee(jdbcTemplate, scanner);
    	
    	employeeCRUDoperation.addEmployee(jdbcTemplate, scanner);
   
    	employeeModel = employeeCRUDoperation.searchEmployeeById(jdbcTemplate, scanner);
    	System.out.println(employeeModel);
    	
    	employeeCRUDoperation.getEmployeeList(jdbcTemplate);
    	
    	employeeCRUDoperation.deleteEmployee(jdbcTemplate, scanner);
    	
    	scanner.close();
    	
    }
}
