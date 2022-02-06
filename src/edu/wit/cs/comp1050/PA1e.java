package edu.wit.cs.comp1050;
import java.util.Scanner;
//TODO: document this class
public class PA1e {
	
	/**
	 * Counts the number of upper case characters
	 * within the supplied string
	 * 
	 * @param s input string
	 * @return number of upper case characters
	 */
	public static int numUpperCase(String s) {
		  int uppercase = 0;
	        char letter;
	        for (int i = 0; i < s.length(); i++) {
	            letter = s.charAt(i);
	            if(letter >='A'&& letter<='Z') {
	                uppercase++;
	            }
	        }
	        return uppercase; // TODO: replace with your method implementation
	    }
	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
	      Scanner input = new Scanner(System.in);

	        System.out.printf("Enter a string: ");
	        String word = input.nextLine();

	        int uperCase = numUpperCase(word);

	        if(uperCase !=1&&uperCase !=0) {
	            System.out.printf("There are %d uppercase characters in the string.%n", uperCase);
	        } else if (uperCase ==0) {
	            System.out.printf("There are no uppercase characters.%n");
	        } else {
	             System.out.printf("There is %d uppercase character in the string.%n", uperCase);
	        }
	    }

	}