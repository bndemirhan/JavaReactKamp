package oopIntroOdev;

public class DayManager {
	
	//i� s�n�f�, metotlar burada olu�turulur
	
		public void previousLesson(Day day) {
			System.out.println("�nceki Derse Ge�: "+ day.gun + ". G�n");
		}
		
		public void finishAndContinue(Day day) {
			
			System.out.println(day.gun + ". G�n� Bitir ve Devam Et");
			
		}
}
