package oop2Odev;


public class User {  // base class.
	
	int id;
	String fullName;
	String eMail;
	String password;

	
	public User() {
		System.out.println("User constructer �al��t�");
	}

	
	public User(String fullName, String eMail, String password) { //parametre k�sm�ndan giri� yap�labilmesi i�in olu�turuldu.
		super();
	   // this.id = id;
		this.fullName = fullName;
		this.eMail = eMail;
		this.password = password;
	}

}