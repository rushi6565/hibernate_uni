package onetoone_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private long phono;
	private String address;
	
    
	@OneToOne
	AadharCard aadharCard;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhono() {
		return phono;
	}
	public void setPhono(long phono) {
		this.phono = phono;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public AadharCard getAadharCard() 
	{
		return aadharCard;
	}
	
	public void setAdharCard(AadharCard aadharCard )
	{
	this.aadharCard	=aadharCard;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phono=" + phono + ", address=" + address + "]";
	}
	
	
	

}
