package week1review;

import java.util.ArrayList;

public class W1ReviewProgram {

	public static void main(String[] args) {
		
		// Create an array list of two or more courses
		ArrayList<W1ReviewCourse> courses = new ArrayList<W1ReviewCourse>();
		
		W1ReviewCourse c1 = new W1ReviewCourse("Computer Science");
		W1ReviewCourse c2 = new W1ReviewCourse("Mathematics");
		W1ReviewCourse c3 = new W1ReviewCourse("Spanish");
		W1ReviewCourse c4 = new W1ReviewCourse("Physics");
		
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		
		// Create three or more students
		W1ReviewStudent s1 = new W1ReviewStudent("George", "none-of-your-business@mybusiness.co.uk", 1);
		W1ReviewStudent s2 = new W1ReviewStudent("Lucy", "lucy@outlook.com", 2);
		W1ReviewStudent s3 = new W1ReviewStudent("Ed", "ed25@gmail.com", 3);
	
		// Add students to courses
		c1.addStudent(s1, 90);
		c1.addStudent(s2, 73);
		c2.addStudent(s3, 39);
		c2.addStudent(s1, 87);
		c3.addStudent(s2, 46);
		c3.addStudent(s3, 94);
		c4.addStudent(s1, 57);
		c4.addStudent(s2, 63);
		
		// Print all students in each course, and their grade
		for (W1ReviewCourse c : courses) {
			c.printStudentList();
		}
		
	}

}
