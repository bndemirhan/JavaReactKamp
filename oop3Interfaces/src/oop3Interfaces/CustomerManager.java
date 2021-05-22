package oop3Interfaces;

public class CustomerManager {
	
	private Logger[] loggers ;
	  
    public CustomerManager(Logger[] loggers) {
    	this.loggers=loggers;
    }
    
	
	public void add(Customer customer) {	//loosy(zayif) - tightly(kati) coupled
		
		System.out.println("Müsteri eklendi: " + customer.getFirstName());
	     Utils.runLoggers(loggers, customer.getFirstName());
		//Utils utils=new Utils();
		//utils.runLoggers(loggers, customer.getLastName());  --> bu new lemeyi Utils de static yapmazsak yapacaktýk.
}
	public void delete(Customer customer) {
		
		System.out.println("Müsteri silindi "+ customer.getFirstName());
		 Utils.runLoggers(loggers, customer.getFirstName());
	}

}
