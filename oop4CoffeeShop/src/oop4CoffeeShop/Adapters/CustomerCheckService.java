package oop4CoffeeShop.Adapters;

import oop4CoffeeShop.Entities.Concrete.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) ;

}
