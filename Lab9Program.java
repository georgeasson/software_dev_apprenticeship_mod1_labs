package lab9;

import java.util.ArrayList;

public class Lab9Program {

	public static void main(String[] args) {
		
		ArrayList<Lab9Animal> animals  = new ArrayList<Lab9Animal>();
		
		// Create some animals
		Lab9Duck aml1 = new Lab9Duck("Donny d'Duck");
		Lab9Fish aml2 = new Lab9Fish("Freddy d'Fish");
		Lab9Penguin aml3 = new Lab9Penguin("Penny d'Penguin");
		
		animals.add(aml1);
		animals.add(aml2);
		animals.add(aml3);
		
		for (Lab9Animal a : animals) {
			System.out.println("My name is " + a.getName());
			if (a instanceof Lab9Bird) {
				((Lab9Bird) a).makeNest();
			}
		}

	}

}
