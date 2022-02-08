package edu.wit.cs.comp1050;
import java.util.Scanner;
//TODO: document this class
public class PA1d {
	
	/**
	 * Error message to display for negative amount 
	 */
	public static final String ERR_MSG = "The package cannot be shipped!";
	
	/**
	 * Method to compute shipping cost
	 * 
	 * @param weight, assumed to be in (0, 20]
	 * @return cost to ship
	 */
	   public static double shippingCost(double weight) {
	        double cost = 0;
	        if (weight <= 1 && weight > 0) {
	            cost = 3.50;
	        } else if (weight<= 3 && weight > 1) {
	            cost = 5.50;
	        } else if (weight<=10 && weight>3) {
	            cost = 8.50;
	        } else if (weight<=20 && weight >10) {
	            cost = 10.50;
	        }
	        return cost; // TODO: replace with your method implementation
	    }
	// TODO: document this method
	public static void main(String[] args) {
		 // TODO: write your code here
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter package weight: ");
        double packageWeight = input.nextDouble();
//hi
        if(packageWeight <=0 || packageWeight > 20) {
            System.out.printf("%s%n", ERR_MSG);
            System.exit(0);
        }

        double cost = shippingCost(packageWeight);

        System.out.printf("It will cost $%.2f to ship this package.%n", cost);

    }

}
