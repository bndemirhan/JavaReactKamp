package oop4CoffeeShop.Business.Abstracts;

import oop4CoffeeShop.Entities.Concrete.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	
	  public abstract void Save(Customer customer) ;
}