package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount?");
		int startAmount = in.nextInt();
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("How many simulations? ");
		int totalSimulations = in.nextInt();
		
		int winCount = 0;
		int lossCount = 0;

		boolean keepGoing = ((winCount <= winLimit) && (startAmount >= 0));
		for (int i = 0; i < totalSimulations; i++)
		{	
			String result = "";
			while (keepGoing)
			{
			keepGoing = ((winCount <= winLimit) && (startAmount >= 0));
			double win = Math.random();
			boolean winYes = win >= (1 - winChance);
			if (winYes)
			{
				startAmount ++;
				winCount ++;

				
				System.out.println(startAmount);
			}
			else
			{	
				startAmount --;
				lossCount ++;
				System.out.println(startAmount);
			}
			}
			
			
			if (winCount == winLimit) {
				result = "WIN"; 
				System.out.println("Simulation " + i + ": " + (winCount + lossCount) + "");
			}
			else if (startAmount == 0) {
				result = "LOSE";
			}

		}
	}

}
