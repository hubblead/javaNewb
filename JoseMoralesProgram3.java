/*
 * Program 3 Assignment 10 by Jose Morales Mendizabal
 * Simulates Timer Functionality
 ========================================================== */

import java.util.Scanner;

public class JoseMoralesProgram3 {

	public static void main(String[] args) {
		
		// Instantiate Scanner Object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter in Minutes to Start the Timer:");
		int numMinutes = input.nextInt();
		
		for (int m = numMinutes - 1; m >= 0; m--) {
			
			
			
				String secPlural;
				String minPlural;

				for (int s = 59; s >= 0; s--) {
					// store letter "s" to append to minutes and seconds as plural by default
					secPlural = "s";
					minPlural = "s";

					// if seconds = 1 don't append an "S"
					// if minutes = 1 don't append "S"
					
					if (s == 1) 
					{
						secPlural = "";
					}
					
					 if (m == 1) 
					{
						minPlural = "";
					}
				
					System.out.println(m + " minute" + minPlural + " " + s +  " Second" + secPlural);
			} //end inner for loop
		
		} // end outer for loop
		System.out.println("The timer is done!");
	}

}
