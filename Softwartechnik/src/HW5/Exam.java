package HW5;

import java.util.ArrayList;

public class Exam {
	public int max_value;
	public Course course;
	public ArrayList<Question> questions = new ArrayList<Question>();
	
	public Exam() {
		
	}
	
	public void addQuestion(int pID, String pTask, int pValue){
		questions.add(new Question(pTask,pID,pValue));
	}
	
	public void setMaxValue(int pMaxValue){
		max_value = pMaxValue;
	}
	
	
	
}
