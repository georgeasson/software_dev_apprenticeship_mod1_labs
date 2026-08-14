package lab4;

public class Program {

	public static void main(String[] args) {
		
		// Part 1
		// Task 1
		int [] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		
		int totalNum = 0;
		for (int num : numbers) {
			totalNum += num;
		}
		System.out.println("Total of values is " + totalNum);

		// Task 2
		double avg = totalNum / numbers.length;
		System.out.println("The avergae of the values is " + avg);
		
		// Task 3
		int minNum = numbers[0];
		for (int num : numbers) {
			if (num < minNum) {
				minNum = num;
			}
		}
		System.out.println("The minimum value is " + minNum);
		
		// Task 4
		int maxNum = numbers[0];
		for (int num : numbers) {
			if (num > maxNum) {
				maxNum = num;
			}
		}
		System.out.println("The maximum value is " + maxNum);
		
		// Task 5
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				System.out.println("The index of '0' is " + i);
			}
		}
		
		// Test getGrade
		// getGrade(97);
		
		// Create array of student names and marks
		String [] students = {"George", "Max", "Josh", "Adele", "Owen"};
		int [] marks = {100, 97, 23, 63, 45};
		
		// Run getGrade on each student and corresponding mark
		for (int i = 0; i < students.length; i++) {
				System.out.println(students[i] + ", you got " + marks[i] + " marks");
			}
		
		// Test doubleMoneyTime
		System.out.println("Test doubleMoneyTime: ");
		doubleMoneyTime(100, 0.05);
		}
	
	
	// Part 2
	// Task 1
	public static String getGrade(int mark) {
		
		String grade = "null";
		if (mark > 100 || mark < 0) {
			return grade;
		} else if (mark >= 70) {
			grade = "Distinction";
			return grade;
		} else if (mark >= 60) {
			grade = "Merit";
			return grade;
		} else if (mark >= 50) {
			grade = "Pass";
			return grade;
		} else {
			grade = "Fail";
			return grade;
		}
	}
	
	// Part 3
	public static double doubleMoneyTime(double initialInvestment, double rate) {
		double currentTotal = initialInvestment;
		int numYears = 0;
		while (currentTotal < (initialInvestment * 2)) {
			currentTotal *= (1 + rate);
			numYears++;
		}
		
		System.out.println("For an initial investment of £" + initialInvestment + " to double, at a rate of " + rate + ", it would take " + numYears + " years.");
		return numYears;
	}

					
				
		
}