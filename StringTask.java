package oo2;

public class StringTask {

	public static void main(String[] args) {
		
		String name = "George";
		String surname = "Asson";
		
		// Display third char in lower and upper case
		System.out.println("Third character of name: " + name.toLowerCase().charAt(2) + " / " + name.toUpperCase().charAt(2));
		
		// Iterate over the characters and display each tab separated
		char nameArr[] = name.toCharArray();
		for (char c : nameArr) {
			System.out.print(c + "   ");
		}
		System.out.println("\n- - - - - - -");
		
		// Display whether it starts with a string of my choosing
		String myString = "Ge";
		String endString = "rg";
		System.out.println("Starts with " + myString + "?: " + name.startsWith(myString));
		System.out.println("Ends with " + endString + "?: " + name.endsWith(endString));
		
		// Use indexOf
		char myChar = 'r';
		System.out.println("Position of " + myChar + ": " + (name.indexOf(myChar) + 1));
		
		// Full name with concat
		String fullName = name + " " + surname;
		System.out.println(fullName);
		
		// Create a string builder obj
		StringBuilder sb = new StringBuilder("J Cole");
		
		// Use append
		sb.append(" is the artist ever");
		sb.insert(13, " greatest");
		sb.replace(23, 29, "rapper");
		
		// Use toString
		System.out.println(sb.toString());
		
		
		
	}

}
