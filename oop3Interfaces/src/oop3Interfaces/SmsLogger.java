package oop3Interfaces;

public class SmsLogger implements Logger { //Logger interface'si implemente edildi.

	@Override
	public void log(String message) {
		System.out.println("Sms Gönderildi: "+ message);
		
	}

}
