package oop4CoffeeShop.Business.Concretes;

import oop4CoffeeShop.Business.Abstracts.CustomerCheckService;
import oop4CoffeeShop.Entities.Concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
	
		return true;
	}

}
