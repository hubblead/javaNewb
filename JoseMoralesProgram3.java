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
			
			String plural = "";
			
			for (int s = 59; s >= 0; s--) {
				
				
				if (s != 1 || m != 1) {
					plural = "s";
				}
				System.out.println(m + " minute" + plural + " " + s +  " Second" + plural);
			} //end inner for loop
		
		} // end outer for loop
		System.out.println("The timer is done!");
	}

}
