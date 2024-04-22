package onetoone_uni.controller;
import java.util.*;

import onetoone_uni.dao.AadharDao;
import onetoone_uni.dao.PersonDao;
import onetoone_uni.dto.AadharCard;
import onetoone_uni.dto.Person;

public class MainController {
	//static Scanner scanner=new Scanner (System.in);
	public static void main(String[] args) {
		
		AadharCard aadharCard=new AadharCard();
		
	//	aadharCard.setId(101);
		aadharCard.setName("rushikesh");
		aadharCard.setAddress("satara");
//		
//	AadharCard aadharCard1=new AadharCard();
//		
//		aadharCard1.setId(102);
//		aadharCard1.setName("abhi");
//		aadharCard1.setAddress("kolhapur");
//		
		
		Person person=new Person();
		
		person.setId(3);
		person.setName("Abhi");
		person.setPhono(912912712l);
		person.setAddress("warje");
		person.setAdharCard(aadharCard);
		
//        Person person1=new Person();
//		
//		person1.setId(2);
//		person1.setName("abhi");
//		person1.setPhono(9730142478l);
//		person1.setAddress("pune");
//		person1.setAdharCard(aadharCard1);
		
		PersonDao personDao=new PersonDao();
		
		//personDao.savePerson(person1);
		
		//personDao.findPerson(2);
		
		//personDao.findAllPerson();
		
	//	personDao.deletePerson(2);
		
//	  AadharDao aadharDao=new AadharDao();
//	  
//	  aadharDao.deleteAadhar(0);
		
//		AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(202);
//	aadharCard.setAddress("karve nagar");
//	aadharCard.setName("sanket");
//	
//     personDao.updateAadharCard(101, aadharCard);
//		
		
//		Person person=new Person();
//		
//		person.setName("sanket");
//		person.setAddress("pune");
//		person.setId(107);
//		person.setPhono(8989897676l);
//		
//		personDao.updatePerson(1, person);
		
		
//		
	
		
	
		
		
		


}
}
