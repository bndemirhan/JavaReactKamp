package oop3Interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[]loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer engin=new Customer(1,"Engin","Demirog");
		customerManager.add(engin);
		customerManager.delete(engin);
	}

}
