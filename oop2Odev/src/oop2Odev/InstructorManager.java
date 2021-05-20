package oop2Odev;

public class InstructorManager extends UserManager { // instructor manager classý user manager sýnýfýndan miras alýr.
	
	public void loadLesson() {
		System.out.println("Ders yüklendi");
	}
	
	
	public void deleteLesson() {
		System.out.println("Ders silindi");
	}
	
	public void addHomeWork() {
		System.out.println("Ödev eklendi");
	}
	
	
}
