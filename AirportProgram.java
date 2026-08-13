package lab2;

public class AirportProgram {

	public static void main(String[] args) {

		double gbp = 4589.23;

		// Currencies: 1= USD, 2=EUR, 3=JPY
		int usd = 1;
		int eur = 2;
		int jpy = 3;

		int currency = usd;

		// Customer types: R = regular, V = VIP
		String customerType = "R";

		// Declare conversion rate, airport tax, service fee as 0 to initialise the values
		double conversionRate = 0;
		double airportTax = 0;
		double serviceFee = 0;

		// switch statement to provide logic for cases
		switch (currency) {
		case usd:
			conversionRate = 1.25;
			break;
		case eur:
			conversionRate = 1.15;
			break;
		case jpy:
			conversionRate = 180.50;
			break;
		default:
			conversionRate = 0;
		}
		
		// if statement to determine the service fee (GBP amounts >= £100 incur a 2.5% fee, < £100 incurs 5% fee)
		if (gbp >= 100) {
			serviceFee = 0.025;
		} else if (gbp > 0) {
			serviceFee = 0.05;
		}
		
		// switch statement for customerType
		switch (customerType) {
		case "R":
			airportTax = 0.1;
			break;
		case "V":
			airportTax = 0.05;
			break;
		default:
			airportTax = 0;
		}

		// Calc amount after service fee
		double amountAfterServiceFee = gbp * (1 - serviceFee);
			
		// Calc amount after tax
		double amountAfterTax = amountAfterServiceFee * (1 - airportTax);
		
		// Calc final amount in foreign currency
		double finalForeignAmount = amountAfterTax * conversionRate;
		
		if (finalForeignAmount <= 0) {
			System.out.println("Error.");
		} else {		
			System.out.printf("Final amount in foreign currency: %.2f%n", finalForeignAmount);
		}


	}

}
