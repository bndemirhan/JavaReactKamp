package oop4CoffeeShop.Business.Abstracts;

import oop4CoffeeShop.Entities.Concrete.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) ;

}
