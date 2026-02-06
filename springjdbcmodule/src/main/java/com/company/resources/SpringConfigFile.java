package com.company.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan({"com.company.model.StudentBean"})
public class SpringConfigFile {

	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springdemo");
		driverManagerDataSource.setUsername("root");
		
		return driverManagerDataSource;		
	}
	
	@Bean
	public JdbcTemplate getJDBCTemplte() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDriverManagerDataSource());
		return jdbcTemplate;
	}
}
