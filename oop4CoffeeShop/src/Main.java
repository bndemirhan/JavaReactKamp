import oop4CoffeeShop.Adapters.MernisServiceAdapter;
import oop4CoffeeShop.Business.Abstracts.BaseCustomerManager;
import oop4CoffeeShop.Business.Concretes.StarbucksCustomerManager;
import oop4CoffeeShop.Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
	    customerManager.Save(new Customer(1,"BETÜL NUR","DEMÝRHAN",1999,"12743478521"));

}
}
