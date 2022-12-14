# SpringJPA


used @ENTITY - to map java class bean to table
@Repository on repository class which communicate with database
@Transactional on repository class to execute query on database

used EntityManager to execute method
@PersitentConext/@Autowired on the entity manager

to insert use entitymanager.merge(classname.class , value);
to find use entitymanager.find(classname.class , value);

to delete  use 
Class classobj=entitymanager.merge(classname.class , value);
entitymanager.remove(classobj);

