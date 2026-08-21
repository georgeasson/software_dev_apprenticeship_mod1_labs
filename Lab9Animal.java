package lab9;

import lab9.Lab9AnimalType.AnimalType;

public abstract class Lab9Animal {
	
	protected AnimalType animalType;
	private String name;
	
	public Lab9Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
