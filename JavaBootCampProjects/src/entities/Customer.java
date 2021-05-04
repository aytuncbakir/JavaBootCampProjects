package entities;

import java.util.Date;


public class Customer{

	public int id;
	public String firstName;
	public String lastName;
	public Date date;
	public String nationalityId;
	
	public Customer(int id, String firstName, String lastName, Date date, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.nationalityId = nationalityId;
	}
	
	
	
}
