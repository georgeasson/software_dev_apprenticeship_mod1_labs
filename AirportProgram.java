package lab2;

public class AirportProgram {

	public static void main(String[] args) {
		double gbp = 4589.23;
		// Currencies: 1= USD, 2=EUR, 3=JPY
		int currency = 1;
		// Customer types: R = regular, V = VIP
		String customerType = "R";
		// Declare conversion rate, airport tax, service fee as 0 to initialise the values
		double conversionRate = 0;
		double airportTax = 0;
		double serviceFee = 0;
		// switch statement to provide logic for cases
		switch (currency) {
		case 1:
			conversionRate = 1.25;
			break;
		case 2:
			conversionRate = 1.15;
			break;
		case 3:
			conversionRate = 180.50;
		default:
			conversionRate = 0;
		}
		
		if (gbp >= 100) {
			serviceFee = 0.025;
		} else {
			serviceFee = 0.05;
		}
		
		// Calc amount after service fee
		double amSF = (gbp * (1 - serviceFee));
		System.out.println("Amount after service fee: " + amSF);
		
		// switch statement for customerType
		switch (customerType) {
		case "R":
			airportTax = 0.1;
			break;
		case "V":
			airportTax = 0.05;
			break;
		}
			
		// Calc amount after tax
		double amT = (gbp * (1 - airportTax));
		System.out.println("Amount after tax: " + amT);
		
		// Calc final amount in foreign currency
		double amFC = ((gbp * (1 - serviceFee)) * (1 - airportTax));
		System.out.println("Final amount in foreign currency: " + amFC);
	}

}
