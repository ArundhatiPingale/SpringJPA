package com.example.SpringJPAHibernate.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJPARepository jparepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		jparepository.insert(
				new Course (2, "Spring","James"));

		jparepository.insert(
				new Course (3, "Jpa","chaerl"));
		jparepository.insert(
				new Course (4, "Hibernate","Chico"));
		
		jparepository.deletbyId(4);
		System.out.println(jparepository.findbyId(2));
		System.out.println(jparepository.findbyId(3));
		
	}
	
	

}
