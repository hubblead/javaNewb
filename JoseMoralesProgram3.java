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
		
		for (int m = numMinutes; m > 0; m--) {
			
			for (int s = 59; s > 0; s--) {
				
//				if (s != 1) {
//					String plural = "s"; 
//				}
				System.out.println(m + "minutes" + s + " Seconds");
			} //end inner for loop
		
		} // end outer for loop

	}

}
