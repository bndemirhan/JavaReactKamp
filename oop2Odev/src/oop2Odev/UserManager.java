package oop2Odev;

public class UserManager {  // base manager class�. 
	
	//ortak operasyonlar yaz�ld�.
	
	public void login() {
		System.out.println("Giri� yap�ld�");
	}
	
	
	public void exit() {
		System.out.println("��k�� yap�ld�");
	}
	
	
	public void changeEmail() {
		System.out.println("Mail adresi de�i�tirildi");
	}
	
	
	public void changePassword() {
		System.out.println("Parola de�i�tirildi");
	}
	
	
	public void comment() {
		System.out.println("Yorum yap�ld�");
	}
	
	
	public void add() {
		System.out.println("eklendi");
	}
	
	public void getInformation(User[] users) {
		

    }
}