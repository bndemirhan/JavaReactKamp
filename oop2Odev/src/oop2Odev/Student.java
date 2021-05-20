package oop2Odev;

public class Student extends User {  // student sýnýfý user sýnýfýndan miras alýr.
	
	String school;     // öðrenci sýnýfýnýn kendine has özellikleri.
	String department;
	
	
	public Student() {
		System.out.println("Student constructor çalýþtý");
	}
	
	
	public Student(int id, String fullName, String eMail, String password, String school, String department) { 
		
		/*base classýn deðiþkenini buradaki parametreye ekleyip aþaðýda this'leyerek kullanabiliyoruz.(diðer classta parametre eklemeden+thislemeden.)
		hangi classta parametre olarak eklersen deðiþkeni o classta thislemek zorundasýn.
	    base classta parametre ekleyip+orada thislediðimiz bir deðiþkeni burada parametre olarak eklediðimizde thislemeye gerek yok.
		Yalnýzca ismini super'in içine yazsak yeterli oluyor. */
		
		super(fullName, eMail, password);
		this.school = school;
		this.department = department;
		this.id=id;
	  
	}

}
