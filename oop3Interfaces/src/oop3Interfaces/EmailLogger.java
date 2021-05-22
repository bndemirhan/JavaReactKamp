package oop3Interfaces;

public class EmailLogger implements Logger { //Logger interface'si implemente edildi.

	@Override
	public void log(String message) {
		
		System.out.println("Email Gönderildi: "+ message);
	}

}
