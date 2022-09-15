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
		
		int winAmount = 0;

		boolean keepGoing = ((winAmount <= winLimit) && (startAmount >= 0));
		for (int i = 0; i < totalSimulations; i++)
		{	
			
			while (keepGoing)
			{
			keepGoing = ((winAmount <= winLimit) && (startAmount >= 0));
			double win = Math.random();
			boolean winYes = win >= (1 - winChance);
			if (winYes)
			{
				startAmount ++;
				winAmount ++;
				System.out.println(startAmount);
			}
			else
			{	
				startAmount --;
				System.out.println(startAmount);
			}
			}

		}
	}

}
