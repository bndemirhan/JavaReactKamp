package oop3Interfaces;

public class DatabaseLogger implements Logger { //Logger interface'si implemente edildi.

	@Override
	public void log(String message) {
		
		System.out.println("Database loglandi: "+ message);
		
	}

}
