package oop3Interfaces;

public class FileLogger implements Logger { //Logger interface'si implemente edildi.

	@Override
	public void log(String message) {
		System.out.println("Dosya Loglandi: "+ message);
		
	}

}
