package intro;

public class Main {

	public static void main(String[] args) {
		      
				System.out.println("Hello World!");
				
				//-----------DATA TYPES-----------
				
				// The String data type is used to store a sequence of characters (text).
				String myName = "Ay?e";
				
				// -2,147,483,648 to 2,147,483,647
				int myAge = 21;
				
				// Sufficient for storing 6 to 7 decimal digits
				float myFloatNumber = 5.99f;
				
				// Stores a single character/letter or ASCII values
				char myNameFirstLetter = 'A';
				
				//Stores true or false values
				boolean myBoolean = true;
				
				System.out.println(myBoolean);
				System.out.println(myAge);
				System.out.println(myName);
				System.out.println(myNameFirstLetter);
				System.out.println(myFloatNumber);
				
				
				//----------DEGER VEREFERANS TIPLER-------------
				
				// Deger Tip
				int sayi1 = 10;
				int sayi2 = 20;
				
				sayi1 = sayi2;
				sayi2 = 100;
				System.out.println(sayi1);
				
				// Referans Tip
				int[] sayilar1 = {1,2,3,4,5};
				int[] sayilar2 = {10,20,30,40,50};
				
				sayilar1 = sayilar2;
				sayilar2[0] = 100;
				System.out.println(sayilar1[0]);
				
				// Referans tiplerde "String"ler "Deger Tip" gibi davraniyor.
				String sehir1 = "Ankara";
				String sehir2 = "?stanbul";
				sehir1 = sehir2;
				sehir2 = "?zmir";
				System.out.println(sehir1);
				
				
				// ---------------LIST--------------------
				
				String[] krediler = 
					{
						"a kredisi",
						"b kredisi",
						"c kredisi",
					};
				
				
				//-----------------LOOPS---------------------
				
				
				// For-each Loop
				for(String kredi:krediler){
					
					System.out.println(kredi);

				}
				
				System.out.println("----------------------");
				
				// For Loop
				for(int i = 0; i<krediler.length; i++) {
					System.out.println(krediler[i]);
				}		
			}
	}


