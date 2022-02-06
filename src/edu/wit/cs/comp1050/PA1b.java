package edu.wit.cs.comp1050;
import java.util.Scanner;
//TODO: document this class
public class PA1b {
	
	/**
	 * Error message to display for any non-negative counts 
	 */
	public static final String ERR_MSG = "All coin counts must be non-negative!";

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
        double total;
        double quarters, dimes, nickels, Pennies;
        System.out.printf("Enter number of quarters: ");
        quarters = input.nextDouble();
        System.out.printf("Enter number of dimes: ");
        dimes = input.nextDouble();
        System.out.printf("Enter number of nickels: ");
        nickels = input.nextDouble();
        System.out.printf("Enter number of pennies: ");
        Pennies = input.nextDouble();
        
        if (quarters < 0 || dimes < 0 || nickels < 0 || Pennies < 0) {
            System.out.printf("All coin counts must be non-negative!%n");
            System.exit(0);
        }
        quarters = quarters*.25;
        dimes = dimes*.10;
        nickels = nickels* .05;
        Pennies = Pennies*.01;

        total= quarters+dimes+nickels+Pennies;

        System.out.printf("You have $%.2f in coins.%n", total);
	}

}
