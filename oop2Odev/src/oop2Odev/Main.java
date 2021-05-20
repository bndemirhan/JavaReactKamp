package oop2Odev;

public class Main {

	public static void main(String[] args) {
		

		Student ali = new Student (8,"ali arslan","arslan@gmail.com","*****","istanbul �niversitesi","bilgisayar m�hendisli�i");
		
		Student asli = new Student();
		asli.id=9;
		asli.fullName="asli yilmaz";
		asli.eMail="yilmaz@gmail.com";
		asli.password="*********";
		asli.school="ankara �niversitesi";
		asli.department="makine m�hendisli�i";
		
		
		Instructor ezgi = new Instructor();
		ezgi.id=10;
		ezgi.fullName="ezgi ate�";
		ezgi.eMail="ates@gmail.com";
		ezgi.password="******";
		ezgi.experience="b�l�m ba�kan�";
		
		
		Instructor salih = new Instructor(11,"salih y�ld�z", "yildiz@gmail.com","****","��retim �yesi");
		
		
		User[] users = {ali,asli,ezgi,salih}; //array olu�turuldu.
		 
		for( User user : users) {  // kullan�c�lar�n base classtaki �zellikleri yazd�r�ld�.
			

			System.out.println("***************************************");
			
			System.out.println("id: "+ user.id+ "\n"+"name: "+ user.fullName+"\n" + 
			                   "mail: "+ user.eMail+"\n"+ "pasword: "+ user.password+"\n" );
			
		}
	}
}