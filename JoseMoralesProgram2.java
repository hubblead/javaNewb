
/*Program 2 Assignment 10 By Jose Morales Mendizabal
 * Modifies Program 1 by adding Multidimensional iteration
 ========================================================== */


import java.util.Scanner;


public class JoseMoralesProgram2 {

	public static void main(String[] args) {
		
		// Instantiate Scanner Object
		Scanner input = new Scanner(System.in);
		
		
		// Declare and initialize Variables
		double totalRainfall = 0;
		double averageRainfall;
		double quarterRainfall;
		double maxRainfall = Integer.MIN_VALUE; // maximum rainfall possible assigned to smallest possible value
		double minRainfall = Integer.MAX_VALUE; // minimum rainfall possible assigned to highest possible value
		
		
		// Variables that store the number of the quarters and year(s) with most and least rain
		int maxRainfallQuarter = 0;
		int leastRainfallQuarter = 0;
		int maxRainfallYear = 0;
		int leastRainfallYear = 0;
		
		
		System.out.println("How many years of rainfall shoud be computed?");
		int yearsComputed = input.nextInt();
		
		for(int y = 1; y <= yearsComputed; y++) {
			
			for (int i = 1; i < 5; i++) {
				
				// Store input into quarterRainfall variable
				System.out.println("Enter rainfall for Quarter #" + i + " year #" + y + ", in inches.");
				quarterRainfall = input.nextDouble();
				
				// add each quarter together with each iteration
				totalRainfall += quarterRainfall;
				
				
				// check for max and min rain fall
				if (quarterRainfall >= maxRainfall) 
				{
					
					maxRainfall = quarterRainfall;
					
					//store Quarter's ID number, with Highest Rainfall
					maxRainfallQuarter = i;
					
				} 
				
				 if (quarterRainfall <= minRainfall) 
				 {
					
					minRainfall = quarterRainfall;
					
					leastRainfallQuarter = i;

				}
				
				
				
			} // end inner for loop
			
			
			//TODO Must compare totalRainfalls to ascertain which year is the wettest/driest
			
			
			// output driest quarter
			System.out.println("The quarter with the least rain is Quarter " + leastRainfallQuarter + " with " + minRainfall + " inches of rain.");
			

			// output wettest quarter
			System.out.println("The quarter with the most rain is Quarter " + maxRainfallQuarter + " with " + maxRainfall + " inches of rain.");
			
			// Output sum total
			System.out.println("It rained " + totalRainfall + " inches in total this year");
			
			// Output average
			averageRainfall = totalRainfall / 4;
			System.out.println("There was an average annual rainfall of " + averageRainfall + " inches.");
			
			
		} // end outer for loop
	
		
		

		
		
		
		

	}

}
