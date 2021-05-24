package oop4CoffeeShop.Business.Concretes;

import oop4CoffeeShop.Business.Abstracts.BaseCustomerManager;
import oop4CoffeeShop.Business.Abstracts.CustomerCheckService;
import oop4CoffeeShop.Entities.Concrete.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
		
	}


	@Override
	public void Save(Customer customer) {
		
		 if(this.customerCheckService.checkIfRealPerson(customer)) {
			
	      System.out.println("Saved to db :" +  customer.getFirstName());
		 } 
		 
		 
		 else {
			 System.out.println("Not a valid person. ");
		 }
		
	}
}