package oop2Odev;


public class User {  // base class.
	
	int id;
	String fullName;
	String eMail;
	String password;

	
	public User() {
		System.out.println("User constructer çalýþtý");
	}

	
	public User(String fullName, String eMail, String password) { //parametre kýsmýndan giriþ yapýlabilmesi için oluþturuldu.
		super();
	   // this.id = id;
		this.fullName = fullName;
		this.eMail = eMail;
		this.password = password;
	}

}