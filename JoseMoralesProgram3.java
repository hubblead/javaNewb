/*
 * Program 3 Assignment 10 by Jose Morales Mendizabal
 * Replicates Timer Functionality
 ========================================================== */

import java.util.Scanner;

public class JoseMoralesProgram3 {

	public static void main(String[] args) {
		
		// Instantiate Scanner Object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter in Minutes to start the timer");
		int numMinutes = input.nextInt();
		
		for (int m = numMinutes - 1; m >= 0; m--) {
			
			// TODO figure out plural output
			// store letter s to append to minutes and seconds as plural by default
			String secPlural = "s";
			String minPlural = "s";
			
			for (int s = 59; s >= 0; s--) {
				
				// if seconds = 1 don't append an "S"
				// else if minutes = 1 do the same.
				if (s == 1) {
					secPlural = "";
				} else if (m == 1) {
					minPlural = "";
				}
				
				System.out.println(m + " minute" + minPlural + " " + s +  " Second" + secPlural);
			} //end inner for loop
		
		} // end outer for loop
		System.out.println("The timer is done!");
	}

}
