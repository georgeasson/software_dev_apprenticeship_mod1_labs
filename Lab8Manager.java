package lab8;

import java.util.ArrayList;

public class Lab8Manager extends Lab8Employee{

	public Lab8Manager(String name, String jobTitle) {
		super(name, jobTitle);
	}

	ArrayList<Lab8Employee> employees = new ArrayList<Lab8Employee>();
	
	public void addEmployee(Lab8Employee emp) {
		employees.add(emp);
	}
	
	@Override
	public String getInfo() {
		String info = super.getInfo();
		for (Lab8Employee e : employees) {
			info += "\n" + e.getInfo();
		}
		return info;
	}
	
}
