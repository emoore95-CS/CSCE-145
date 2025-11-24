//Name: Elizabeth Moore

import java.util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		System.out.println("Welcome to the below average program!! :)");
		Scanner k = new Scanner(System.in);
		int day = 1;
		double[] numTemps = new double[10];

		for(int i = 0; i < numTemps.length; i++) 
		{
			System.out.println("Enter a the tempeture for Day " + day + ": ");
			numTemps[i] = k.nextDouble(); //Will allow a new int to be inputed by the user
			day ++; //Icreases the day so that it would just say "Day 1" every time
		}
		double avgNum = 0.0;
		int count = 0;
		for(int i = 0; i < numTemps.length; i++)//Calculates the avg of the nums and uses the count varible to see how many nums there are to divide it by the avg later
		{
			avgNum += numTemps[i];
			count++;
		}

		avgNum/=count;

		System.out.println("The average of these tempetures is: " + avgNum);
		System.out.println("Here are the days that had a tempeture that was below that average: ");

		day = 1; //Resets day to 1 so that it can print out the correect day with the correct temp that was below average

		for(int i = 0; i < numTemps.length; i++) //Goes back through the array and checks if the index is less that the avg and if so it will rpint both the day and the temp
		{
			if(avgNum > numTemps[i])
			{
				System.out.println("Day " + day + " with " + numTemps[i]);
			}
			day ++;
		}

	}

}
