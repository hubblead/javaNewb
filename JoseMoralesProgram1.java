/*Program 1 Assignment 10 By Jose Morales Mendizabal
 ==================================================== */

import java.util.Scanner;

public class JoseMoralesProgram1 {

	public static void main(String[] args) {
		
		// Instantiate Scanner Object
		Scanner input = new Scanner(System.in);

		// declare and initialize quarter variables
		double 	quarter1 = 0; 
		double	quarter2 = 0;
		double 	quarter3 = 0;
		double 	quarter4 = 0;
		
		// declare and init counter
		int counter = 0;
		
		while (counter < 4) {
			
			// up counter with each iteration
			counter += 1;
			System.out.println("Enter the rainfall for Quarter  " + counter + ", in inches:");
			
			switch(counter){
			case 1: 
				quarter1 = input.nextDouble();
				break;
				
			case 2: 
				quarter2 = input.nextDouble();
				break;
				
			case 3: 
				quarter3 = input.nextDouble();
				break;
				
			case 4: 
				quarter4 = input.nextDouble();
				break;
			
			}
			
			
		}// end while
		
		
		// Average computation
		double average = (quarter1 + quarter2 + quarter3 + quarter4) / 4;
		System.out.println("The average rainfall for the year was " + average + " inches.");
		
		// Total Rainfall computation
		double totalRainfall = quarter1 + quarter2 + quarter3 + quarter4;
		System.out.println("The total rainfall for the year was " + totalRainfall + " inches.");
	
	} // end main method

}
