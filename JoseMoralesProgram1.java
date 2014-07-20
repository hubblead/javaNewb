/*Program 1 Assignment 10 By Jose Morales Mendizabal
 ==================================================== */


import java.util.Scanner;


public class JoseMoralesProgram1 {

	public static void main(String[] args) {
		
		// Instantiate Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Initialize Variables
		double totalRainfall = 0;
		double averageRainfall;
		double maxRainfall = Integer.MIN_VALUE; // maximum rainfall possible assigned to smallest possible value
		double minRainfall = Integer.MAX_VALUE; // minimum rainfall possible assigned to highest possible value
		double quarterRainfall;
		
		
	
		
		for(int i = 1; i < 5; i++){
			
		
			System.out.println("Enter rainfall for quarterRainFall " + i);
			quarterRainfall = input.nextDouble();
			
			// add each quarter together with each iteration
			totalRainfall += quarterRainfall;
			
			
			// check for max and min rain totals
			if(quarterRainfall > maxRainfall) {
				
				maxRainfall = quarterRainfall;
				
				//store Quarter's ID number, with Highest Rainfall
				int maxRainfallQuarter = i;
				
				// output wettest quarter
				System.out.println("The quarter with most rain is Quarter " + maxRainfallQuarter);
				
			} else if (quarterRainfall < minRainfall){
				
				minRainfall = quarterRainfall;
				int leastRainfallQuarter = i;
				
				// output wettest quarter
				System.out.println("The quarter with least rain is Quarter " + leastRainfallQuarter);
			}
			
			
			
		} // end for loop

		

		// Output sum total
		System.out.println("It rained " + totalRainfall + " inches in total this year");
		
		// Output average
		averageRainfall = totalRainfall / 4;
		System.out.println("There was an average annual rainfall of " + averageRainfall + " inches.");
		

	}

}
