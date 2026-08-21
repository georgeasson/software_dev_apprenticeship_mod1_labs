package lab8;

import java.util.ArrayList;

public class Lab8SkilledWorker extends Lab8Employee {
	
	public Lab8SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
	}

	ArrayList<String> skills = new ArrayList<String>();
	
	public void addSkill(String skill) {
		skills.add(skill);
	}

}
