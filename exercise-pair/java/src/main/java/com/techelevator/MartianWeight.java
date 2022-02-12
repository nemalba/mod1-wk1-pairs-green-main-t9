package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a series of earth weights (space separated): ");
		String weightsOnEarth = userInput.nextLine();
		//System.out.println(weightsOnEarth);
		String[] earthWeights = weightsOnEarth.split(" ");

		for (int i=0; i< earthWeights.length; i++){
			Double marsWeight = Double.parseDouble(earthWeights[i]) * 0.378;
			System.out.printf("%s lbs. on Earth, is %.0f lbs. on Mars.\n",earthWeights[i],marsWeight);
			//98 lbs. on Earth, is 37 lbs. on Mars. Wm = We * 0.378
			//double price = Double.parseDouble(pricesArray[i]);
		}

		}
/*
        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String priceString = scanner.nextLine();
        System.out.println(priceString);
        String [] pricesArray = priceString.split(" ");
        for (int i=0; i< pricesArray.length; i++){
            System.out.println(pricesArray[i]);
            double price = Double.parseDouble(pricesArray[i]);
            double amountOff = price * discountAmount;
            double salePrice = price * amountOff;
            System.out.println("Original price: " + price + " Discount Amount"  + amountOff + " Sales Price: " + salePrice);
*/



	}


