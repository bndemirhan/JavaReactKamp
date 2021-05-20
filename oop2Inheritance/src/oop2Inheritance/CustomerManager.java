package oop2Inheritance;

public class CustomerManager {
	
	public void add(Customer customer){  // parantez içine base yazýlýr.
		System.out.println(customer.customerNumber + " kaydedildi.");
		
	}
	
	//Bulk Insert
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer : customers) {
			add(customer);
		}	
		
	}
}

//SOLID- Open Closed Principle