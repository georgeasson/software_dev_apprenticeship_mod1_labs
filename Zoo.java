package lab5;

import java.util.HashMap;

public class Zoo {

	HashMap<String, Integer> animalMap = null;

	String[ ] originalAnimals = {"Zebra", "Lion", "Buffalo"};
	String[ ] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
	
	public Zoo() {
		animalMap = new HashMap<String, Integer>();
		this.addAnimals(originalAnimals);
		this.addAnimals(newAnimals);
		displayAnimalData();
	}

	void addAnimals(String[] animals) {
		for (String a : animals) {
			if (animalMap.containsKey(a)) {
				animalMap.put(a,  animalMap.get(a) + 1);
			} else {
				animalMap.put(a,  1);
			}
		}
	}
	
	void displayAnimalData() {
		for (String a : animalMap.keySet()) {
			System.out.println(a + "\t" + animalMap.get(a));
		}
	}
	
}
