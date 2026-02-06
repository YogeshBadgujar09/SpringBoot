package com.company.springjdbcmodule;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.company.resources.SpringConfigFile;
import com.yogesh.model.StudentModel;
import com.yogesh.model.StudentRowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
//        
//        int rollno = 4;
//        String name = "Raman";
//        String course = "MCA";
//        
//     //   Insert Data 
//        String studentInsert = "INSERT INTO student VALUES(?,?,?)";
//        int a = jdbcTemplate.update(studentInsert, rollno, name, course);
//   
//        if(a > 0)
//        {
//        	System.out.println("Data Inserted ...!!!");
//        }else {
//        	System.out.println("Not Inserted ... !!!");
//        }
        
        // Delete Data
//        int rollNo = 1;
//        String studentDelete = "DELETE FROM student WHERE rollNo = ? ";
//        int a = jdbcTemplate.update(studentDelete,rollNo);
//        
//        if(a > 0 ) { System.out.println("student delete"); } else { System.out.println("Not deleted"); }
//        
        
        //Update Data
//        int rollNo = 1;
//        String name = "gagan";
//        
//        String updateStudent = "UPDATE student SET name = ?  WHERE rollNo = ? ";
//        int a = jdbcTemplate.update(updateStudent,name, rollNo);
//        
//        if (a > 0) {
//        	System.out.println("Update Student");
//        }else {
//        	System.out.println("Not update student ");
//        }
//        
        
    //    SELECT DATA access Multiple row
        String accessAll = "SELECT * FROM student";
        
        List<StudentModel> studentList = jdbcTemplate.query(accessAll, new StudentRowMapper());
        
        for(StudentModel studentModel : studentList) {
        	
        	System.out.println("studentModel refference :" + studentModel.hashCode());
        	
        	System.out.println(studentModel.toString());
        }
        
        
        
        
    }
}
