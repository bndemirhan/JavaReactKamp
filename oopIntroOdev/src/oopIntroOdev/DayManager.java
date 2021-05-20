package oopIntroOdev;

public class DayManager {
	
	//iþ sýnýfý, metotlar burada oluþturulur
	
		public void previousLesson(Day day) {
			System.out.println("Önceki Derse Geç: "+ day.gun + ". Gün");
		}
		
		public void finishAndContinue(Day day) {
			
			System.out.println(day.gun + ". Günü Bitir ve Devam Et");
			
		}
}
