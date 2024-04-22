package onetoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetoone_uni.dto.AadharCard;

public class AadharDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rushi");
	
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    
    EntityTransaction entityTransaction = entityManager.getTransaction();
    

    public void deleteAadhar(int id)
    {
   
    	AadharCard aadharCard=entityManager.find(AadharCard.class,1);
   
    	entityTransaction.begin();
    	entityManager.remove(aadharCard);
    	entityTransaction.commit();

      System.out.println("deletion complited");
    }
}
