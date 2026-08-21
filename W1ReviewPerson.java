package week1review;

public class W1ReviewPerson {
	
	String name;
	String email;
	
	public W1ReviewPerson(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getDetails() {
		return name + " (" + email + ")";
	}

}
