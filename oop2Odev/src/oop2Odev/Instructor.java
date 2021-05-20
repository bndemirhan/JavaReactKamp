package oop2Odev;

public class Instructor extends User { // instructor sýnýfý user sýnýfýndan miras alýr.
	
	String experience;  // eðitmen sýnýfýnýn kendine has özellikleri.
	
	
	public Instructor() {
		System.out.println("Instructor constructor çalýþtý");
	}
	
	

	/*base classýn deðiþkenini buradaki parametreye ekleyip aþaðýda this'leyerek kullanabiliyoruz.(diðer classta parametre eklemeden+thislemeden.)
	hangi classta parametre olarak eklersen deðiþkeni o classta thislemek zorundasýn.
    base classta parametre ekleyip+orada thislediðimiz bir deðiþkeni burada parametre olarak eklediðimizde thislemeye gerek yok.
	Yalnýzca ismini super'in içine yazsak yeterli oluyor. */

	public Instructor(int id,String fullName, String eMail, String password,String experience) {
		super(fullName,eMail,password);
		this.experience = experience;
		this.id=id;
	}

}
