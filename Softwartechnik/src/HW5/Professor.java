package HW5;

import java.util.ArrayList;

public class Professor extends Employee {
	
	public  ArrayList<Course> courses;
	public  ArrayList<Exam> exam;
	
	public Professor(String pName, int pEID, int courseAmount, int examAmount) {
		
		super(pName, pEID);
		
		if(courseAmount>=0 && examAmount>=0) {
			courses = new ArrayList<Course>(courseAmount);
			exam = new ArrayList<Exam>(examAmount);
		}
		
	}
	
	public void addNewCourse(Course pCourse) {
		courses.add(pCourse);
	}
}
