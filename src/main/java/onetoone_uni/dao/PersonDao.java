package onetoone_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetoone_uni.dto.AadharCard;
import onetoone_uni.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rushi");
	
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
    public void savePerson(Person person)
    {
    	entityTransaction.begin();
    	
    	AadharCard aadharCard=person.getAadharCard();
    	
    	entityManager.persist(aadharCard);
    	entityManager.persist(person);
    	
    	entityTransaction.commit();
    }
    public void findPerson(int id) {

    	Person person= entityManager.find(Person.class, id);
    	
    	System.out.println(person);
    }
    
    public void findAllPerson()
    {
      Query query=entityManager.createQuery("select p from Person p");
      
      List<Person> list=query.getResultList();
      
      System.out.println(list);
    }
    public void deletePerson(int id)
    {
   
    	Person person=entityManager.find(Person.class,id);
   
    	entityTransaction.begin();
    	entityManager.remove(person);
    	entityTransaction.commit();
    }
    
    public void updateAadharCard(int id,AadharCard aadharCard)
    {
    	AadharCard dbaadharCard =entityManager.find(AadharCard.class,id);
    			if (dbaadharCard !=null) 
    			{
    				     dbaadharCard.setId(id);
    				    entityTransaction.begin();
    				    entityManager.merge(aadharCard);
    				    entityTransaction.commit();
					
				}
    			else
    			{
    				System.out.println("id not found");
    			}
    }
    
    public void updatePerson(int id,Person person)
    {
    	
      Person dbperson=entityManager.find(Person.class, id);
      if (dbperson!=null) 
      {
    	  person.setId(id);
    	  person.setAdharCard(dbperson.getAadharCard());
    	  
    	  entityTransaction.begin();
    	  entityManager.merge(person);
    	  entityTransaction.commit();
		
	}
      else
      {
    	  System.out.println("id not found");
      }
    	
    }
    
    public void mapping(int pid,int aid)
    {
     Person dbperson=entityManager.find(Person.class, pid);
     AadharCard dbAadharCard=entityManager.find(AadharCard.class, aid);
     if(dbperson!=null)
     {
     dbperson.setAdharCard(dbAadharCard);
     
     entityTransaction.begin();
     entityManager.merge(dbperson);
     entityTransaction.commit();
     }
    }
    
    public void updateAadharPerson(int pid,Person person,AadharCard aadharCard)
    {
      Person dbPerson=entityManager.find(Person.class, pid);
      
      if(dbPerson !=null)
      {
    	  dbPerson.setId(pid);
    	  aadharCard.setId(dbPerson.getAadharCard().getId());
    	  entityTransaction.begin();
    	  entityManager.merge(aadharCard);
    	  entityManager.merge(person);
    	  entityTransaction.commit();
    	  
      }
      else
      {
    	  System.out.println("user not find");
      }
      
    }
    

}
