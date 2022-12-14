package com.example.SpringJPAHibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository cjr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		cjr.insert(
				new Course (2, "Spring","James"));

		cjr.insert(
				new Course (3, "Jpa","chaerl"));
		cjr.insert(
				new Course (4, "Hibernate","Chico"));
		
		
		cjr.deletebyId(4);
		
		Course c= cjr.selectbyId(2);
		
		System.out.println(c.toString());
	}
	
	

}
