package oopIntroOdev;

public class Course {
	int id;
	String name;
	String teacher;
	
	
public Course() {        
	System.out.println("-- Course constructor --");  //constructor bloðu
}


public Course(int id, String name, String teacher) {
	super();
	this.id = id;
	this.name = name;
	this.teacher = teacher;
}

}
