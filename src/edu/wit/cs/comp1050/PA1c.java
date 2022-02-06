package edu.wit.cs.comp1050;
import java.util.Scanner;
//TODO: document this class
public class PA1c {
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "Dollar amount must be non-negative!";
	
	/**
	 * Method to convert a double to
	 * an integer
	 * 
	 * @param num number to convert
	 * @return converted value
	 */
	public static int convertToInt(double num) {
		  num = num * 100;
	        return (int) Math.round(num);
	}

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		 Scanner input = new Scanner(System.in);

	        System.out.printf("Enter total amount: ");
	        double total = input.nextDouble();
	        if(total<0) {
	            System.out.printf("$Dollar amount must be non-negative!%n");
	            System.exit(0);
	        }
	        int wholeTotal = convertToInt(total);
	        int quarters,dimes,nickels,Pennies;

	        quarters = wholeTotal/25;
	        int leftover = wholeTotal % 25;

	        dimes = leftover/10;
	        int leftover2 = leftover % 10;

	        nickels = leftover2/5;
	        int leftover3 = leftover2 % 5;

	        Pennies = leftover3/1;
	        
	        String qs = "";
	        String ds = "";
	        String ns = "";
	        String ps = "y";
	        if (quarters != 1) {
	            qs = "s";
	        }
	        if (dimes != 1) {
	            ds = "s";
	        }
	        if (nickels != 1) {
	            ns = "s";
	        }
	        if (Pennies != 1) {
	            ps = "ies";
	        }
	        System.out.printf("$You have %d quarter%s, %d dime%s, %d nickel%s, and %d penn%s.%n", quarters, qs, dimes, ds, nickels, ns, Pennies, ps);
	}

}
