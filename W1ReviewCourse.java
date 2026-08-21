package week1review;

import java.util.HashMap;

public class W1ReviewCourse {
	
	String courseName;
	HashMap<W1ReviewStudent, Integer> hMap = new HashMap<>();

	public W1ReviewCourse(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(W1ReviewStudent s, int grade) {
		hMap.put(s, grade);
	}
		
	public void printStudentList() {
		System.out.println(courseName);
		for (W1ReviewStudent s : hMap.keySet()) {
			int grade = hMap.get(s);
			
			System.out.println(s.getDetails() + ", \t Grade: \t"+  grade);
		}
		System.out.println();
	}

}
