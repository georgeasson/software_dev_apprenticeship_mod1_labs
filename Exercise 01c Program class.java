package lab3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
//		int pounds = getInt("Enter number of pounds");
//		String name = getString("What's your name?");
//		System.out.println(name + ", " + pounds);
		
		theLunchQueue("Welcome");
//		convertInputToStonesPounds(135);
//		convertKgsToStonesPounds(135);
	}
	
	public static int getInt(String prompt) {
		
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		return x;
	}
	
	public static String getString(String prompt) {
		
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		return x;
	}
	
	public static String theLunchQueue(String prompt) {
		
		Utils utils = new Utils();
		
		String mainCourse = getString("What main dish would you like? (fish, burgers or veg)");
		int numPotato = utils.getInt("How many roast potatoes would you like?");
		int numSprout = getInt("How many brussel sprouts would you like?");
		String x = "Hello, your lunch is " + mainCourse + ", with " + numPotato + " potatoes, and " + numSprout + " sprouts.";
		System.out.println(x);
		return x;
	}
	
	public static String convertInputToStonesPounds(int pounds) {
		
		int weightInPounds = getInt("Enter your weight in pounds");
		int numInStone = weightInPounds / 14;
		int remainingPounds = weightInPounds % 14;
		String x = "Your weight is " + numInStone + " stone, " + remainingPounds + " pounds";
		System.out.println(x);
		return x;
	}
	
	public static void convertKgsToStonesPounds(int kg) {
		
		int weightInKgs = getInt("Enter your weight in kilograms");
		double weightInPounds = weightInKgs * 2.20462;
		System.out.println("Your weight in pounds is " + weightInPounds + " pounds");
	}
}