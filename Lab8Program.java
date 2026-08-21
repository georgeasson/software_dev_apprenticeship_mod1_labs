package lab8;

public class Lab8Program {

	public static void main(String[] args) {
		
		Lab8Car c1 = new Lab8Car("Fiesta");
		c1.getToSixty();
		c1.accelerate(10);
		System.out.println(c1);
		
		Lab8Car[] cars = new Lab8Car[5];
		cars[0] = new Lab8Car("Fiesta");
		cars[1] = new Lab8Car("Model Y");
		cars[2] = new Lab8RacingCar("Alice", 2);
		cars[3] = new Lab8RacingCar("Bob", 3);
		cars[4] = new Lab8Car("i10");
		
		processCars(cars);
		
		System.out.println("Employee task begins below: \n");
		
		Lab8Manager manager = new Lab8Manager("Matty", "Lead CRXO Engineer");
		Lab8Employee emp1 = new Lab8Employee("John", "CRXO Engineer");
		Lab8Employee emp2 = new Lab8Employee("Tom", "Software Engineer");
		Lab8Employee emp3 = new Lab8Employee("Dom", "Front-end Developer");
		Lab8SkilledWorker sw = new Lab8SkilledWorker("George", "CRXO Engineer");
		
		// Add employees to manager's 'employees' array list
		manager.addEmployee(emp1);
		manager.addEmployee(emp2);
		manager.addEmployee(emp3);
		
		// Add some skills to skilled worker
		sw.addSkill("Java");
		sw.addSkill("JavaScript");
		sw.addSkill("A/B testing");
		
		System.out.println(manager.getInfo());
		
	}

	
	public static void processCars(Lab8Car[] cars) {
		for (Lab8Car c : cars) {
			c.getToSixty();
		}
		for (Lab8Car c : cars) {
			c.accelerate(2);
		}
		
		for (Lab8Car c : cars) {
			System.out.println(c.getModel());
			System.out.println(c.getSpeed());
			
			if (c instanceof Lab8RacingCar) {
				System.out.println(
						((Lab8RacingCar) c).getDriver()
				);
			}
			System.out.println();
		}
		
		
	}
	
}
