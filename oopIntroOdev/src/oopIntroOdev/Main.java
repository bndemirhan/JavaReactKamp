package oopIntroOdev;

public class Main {

	public static void main(String[] args) {
		
		// ?zellikler 2 farkl? y?ntem ile girildi
		
		Day day1 = new Day(1,"classlar", "kayd? izleyiniz.", "class nedir? ara?t?r?n?z.","de?erlendiriniz.");
		
		Day day2 = new Day();
		day2.gun=2;
		day2.dersProgrami="inheritance";
		day2.gunSonuKayit="kayd? izleyiniz.";
		day2.odev="inheritance nedir? ara?t?r?n?z.";
		day2.degerlendirme="de?erlendiriniz.";
		
		
		Day day3 = new Day();
		day3.gun=3;
		day3.dersProgrami="interface";
		day3.gunSonuKayit="kayd? izleyiniz";
		day3.odev="interface nedir? ara?t?r?n?z.";
		day3.degerlendirme="de?erlendiriniz.";
		
				
		
		Day[] days = {day1, day2, day3};  //days dizisi
		
		
		
		for (Day day : days) {   // for d?g?s? ile days dizisi elemanlar? gezildi
		
			System.out.println(day.odev);  
		}
		
//--------------------------------------------------------------------
	
		
	Course course1= new Course(123,"C#","Engin Demiro?");
	
	Course course2= new Course();
	    course2.id=456;
		course2.name="Java";
		course2.teacher="Engin Demiro?";
	
		
		
		Course[] courses = {course1, course2};  //course dizisi
		
		
		
		for ( Course course : courses ) {   // for d?g?s? ile course dizisi elemanlar? gezildi
			
			
			System.out.println(course.name);
		}
		
//---------------------------------------------------------------------
		
		DayManager dayManager = new DayManager(); 
		dayManager.finishAndContinue(day1);  //metotlar ?a??r?ld?
		dayManager.previousLesson(day1);
	
}

}
