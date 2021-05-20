package oop2Odev;

public class Student extends User {  // student s�n�f� user s�n�f�ndan miras al�r.
	
	String school;     // ��renci s�n�f�n�n kendine has �zellikleri.
	String department;
	
	
	public Student() {
		System.out.println("Student constructor �al��t�");
	}
	
	
	public Student(int id, String fullName, String eMail, String password, String school, String department) { 
		
		/*base class�n de�i�kenini buradaki parametreye ekleyip a�a��da this'leyerek kullanabiliyoruz.(di�er classta parametre eklemeden+thislemeden.)
		hangi classta parametre olarak eklersen de�i�keni o classta thislemek zorundas�n.
	    base classta parametre ekleyip+orada thisledi�imiz bir de�i�keni burada parametre olarak ekledi�imizde thislemeye gerek yok.
		Yaln�zca ismini super'in i�ine yazsak yeterli oluyor. */
		
		super(fullName, eMail, password);
		this.school = school;
		this.department = department;
		this.id=id;
	  
	}

}
