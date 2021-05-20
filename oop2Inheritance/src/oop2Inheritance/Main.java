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
		
		Customer[] customers = {mehmet, hepsiBurada, abc};  //customers dizisi olu�turuldu.
		
		customerManager.addMultiple(customers); // �oklu ekleme metodu �a��r�ld� ve dizi elemanlar� eklendi.
	}
}