package oop2Odev;

public class StudentManager extends UserManager { //student manager manager classı user manager sınıfından miras alır.
	
	
	public void registerToCourse() {
		System.out.println("Kurs kayıt olundu");		
	}
	
	
	public void takeAttendance() {		
		System.out.println("Yoklama Alındı");		
	}
	
	public void finishAndContinue() {
		System.out.println("Dersi bitir ve devam et");
	}

}
