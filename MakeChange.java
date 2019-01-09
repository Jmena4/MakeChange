package skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		double itemPrice = 0;
		double tendered = 0;
		double remainder;

		String change = "yes";
		boolean go = true;

		Scanner scanner = new Scanner(System.in);

		// do loop that executes while the user does not type "no"
		do {
			// Prompting Cash Register user for transaction values itemPrice & tendered
			System.out.println("What is the price of the item?");
			itemPrice = scanner.nextDouble();

			System.out.println("How much money was tendered by the customer?");
			tendered = scanner.nextDouble();
			// while go is true check each if statement for <, ==, >
			while (go) {
				if (tendered < itemPrice) {
					tooLow();
					go = false;
				}
				if (tendered == itemPrice) {
					exact();
					go = false;
				}
				if (tendered > itemPrice) {

					remainder = tendered - itemPrice;
					System.out.printf("\nResult: %.2f ", remainder);
					getChange(remainder);
					go = false;
				}
			}
			// loop here...
			System.out.println("\nYou can try another sale: type \"yes\" to continue, \"no\" to exit\n");
			change = scanner.next();
			if (change.equals("yes")) {
				go = true;
			}
		}
		// exit loop by typing "no"
		while (!change.equals("no"));
		System.out.println("Finished.");
		scanner.close();
	}

	// call the tooLow() method
	public static void tooLow() {
		System.out.println("Amount tendered is too low. ");
	}

	// call the exact() method
	public static void exact() {
		System.out.println("The customer provided the exact amount. No change required!");
	}

	// call the getChange() method and calculate the correct denominations to print
	// out
	public static void getChange(double changeOwed) {
		double changeDenominations[] = { 20.00, 10.00, 5.00, 1.00, .25, .10, .05, .01 };
		String changeBills[] = { "twenty dollar bill", "ten dollar bill", "five dollar bill", "one dollar bill",
				"quater", "dime", "nickel", "penn" };
		int counter;
		double balance = changeOwed;
//		boolean stop = true;
		// counter continues until balance = 0
		for (int i = 0; i < changeDenominations.length; i++) {
			counter = 0;
			// while checks each cash denomination and subtracts the values from the balance
			while (balance >= changeDenominations[i]) {
				balance = Math.round((balance)*100) / 100.0;
				balance -= changeDenominations[i];
				counter++;
//				System.out.println(balance);
				if (counter != 0 && changeBills[i] == "penn") {
					changeBills[i] = "penn" + "y";

				}
				else if (counter != 0 && counter >= 1 && changeBills[i] == "penn") {
					changeBills[i] = changeBills[i] + "ies";
				}
			}
			if (counter != 0 ) {
				System.out.print(counter + " " + changeBills[i] + "(s) ");
				
			}
		}
	}
}
