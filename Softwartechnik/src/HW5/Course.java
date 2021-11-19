package HW5;

import java.util.ArrayList;

public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof;
	public ArrayList<Exam> exam = new ArrayList<Exam>();

	public Course() {

	}

	public Course(Integer id, String pName, Integer pCap, Professor pProf) {
		this.id = id;
		name = pName;
		maxCapacity = pCap;
		prof = pProf;

	}

}
