package oop2Odev;

public class Instructor extends User { // instructor s�n�f� user s�n�f�ndan miras al�r.
	
	String experience;  // e�itmen s�n�f�n�n kendine has �zellikleri.
	
	
	public Instructor() {
		System.out.println("Instructor constructor �al��t�");
	}
	
	

	/*base class�n de�i�kenini buradaki parametreye ekleyip a�a��da this'leyerek kullanabiliyoruz.(di�er classta parametre eklemeden+thislemeden.)
	hangi classta parametre olarak eklersen de�i�keni o classta thislemek zorundas�n.
    base classta parametre ekleyip+orada thisledi�imiz bir de�i�keni burada parametre olarak ekledi�imizde thislemeye gerek yok.
	Yaln�zca ismini super'in i�ine yazsak yeterli oluyor. */

	public Instructor(int id,String fullName, String eMail, String password,String experience) {
		super(fullName,eMail,password);
		this.experience = experience;
		this.id=id;
	}

}
