package com.example.SpringJPAHibernate.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
	@PersistenceContext
	private EntityManager entitymanager;
  public void insert(Course course)
  {
	 entitymanager.merge(course); 
  }
  
  public Course findbyId( long id)
  {
	  return entitymanager.find(Course.class , id);
	  
  }

  public void deletbyId( long id)
  {
	  Course course= entitymanager.find(Course.class , id);
	  entitymanager.remove(course);
	  
  }
}
