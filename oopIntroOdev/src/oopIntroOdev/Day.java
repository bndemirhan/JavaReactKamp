package oopIntroOdev;

public class Day {
	
	int gun;
	String dersProgrami;
	String gunSonuKayit;
	String odev;
	String degerlendirme;


public Day() {  
	System.out.println("-- Day constructor --");    //constructor bloðu
}

public Day(int gun, String dersProgrami, String gunSonuKayit, String odev, String degerlendirme) {
	super();
	this.gun = gun;
	this.dersProgrami = dersProgrami;
	this.gunSonuKayit = gunSonuKayit;
	this.odev = odev;
	this.degerlendirme = degerlendirme;
}

}
