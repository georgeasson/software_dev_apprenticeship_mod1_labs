package lab9;

public class Lab9Penguin extends Lab9Bird {

	public Lab9Penguin(String name) {
		super(name);
		
	}

	public void makePenguinNose() {
		System.out.println("???");
	}

	@Override
	public void makeNest() {
		System.out.println("I have a cold nest");		
	}
	
}
