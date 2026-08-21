package lab9;

public abstract class Lab9Bird extends Lab9Animal {
	
	Lab9AnimalType.AnimalType animalType;
	
	public Lab9Bird(String name) {
		super(name);
		animalType = Lab9AnimalType.AnimalType.Bird;
	}
	
	public abstract void makeNest();
}
