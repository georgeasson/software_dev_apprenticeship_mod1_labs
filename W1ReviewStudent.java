package week1review;

public class W1ReviewStudent extends W1ReviewPerson {

	int studentId;
	
	public W1ReviewStudent(String name, String email, int studentId) {
		super(name, email);
		this.studentId = studentId;
	}
	
	@Override
	public String getDetails() {
		return "Student name: " + name;
	}
	
}
