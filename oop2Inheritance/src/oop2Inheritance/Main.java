package oop2Inheritance;

public class Main {

public static void main(String[] args) {
		
		IndividualCustomer mehmet = new IndividualCustomer();
		mehmet.customerNumber = "123";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "456";
		
		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber = "789";
		
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(hepsiBurada);
		customerManager.add(mehmet);
		customerManager.add(abc);*/
		
		Customer[] customers = {mehmet, hepsiBurada, abc};  //customers dizisi oluþturuldu.
		
		customerManager.addMultiple(customers); // çoklu ekleme metodu çaðýrýldý ve dizi elemanlarý eklendi.
	}
}