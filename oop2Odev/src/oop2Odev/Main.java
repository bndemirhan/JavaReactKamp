package oop2Odev;

public class Main {

	public static void main(String[] args) {
		

		Student ali = new Student (8,"ali arslan","arslan@gmail.com","*****","istanbul üniversitesi","bilgisayar mühendisliði");
		
		Student asli = new Student();
		asli.id=9;
		asli.fullName="asli yilmaz";
		asli.eMail="yilmaz@gmail.com";
		asli.password="*********";
		asli.school="ankara üniversitesi";
		asli.department="makine mühendisliði";
		
		
		Instructor ezgi = new Instructor();
		ezgi.id=10;
		ezgi.fullName="ezgi ateþ";
		ezgi.eMail="ates@gmail.com";
		ezgi.password="******";
		ezgi.experience="bölüm baþkaný";
		
		
		Instructor salih = new Instructor(11,"salih yýldýz", "yildiz@gmail.com","****","öðretim üyesi");
		
		
		User[] users = {ali,asli,ezgi,salih}; //array oluþturuldu.
		 
		for( User user : users) {  // kullanýcýlarýn base classtaki özellikleri yazdýrýldý.
			

			System.out.println("***************************************");
			
			System.out.println("id: "+ user.id+ "\n"+"name: "+ user.fullName+"\n" + 
			                   "mail: "+ user.eMail+"\n"+ "pasword: "+ user.password+"\n" );
			
		}
	}
}