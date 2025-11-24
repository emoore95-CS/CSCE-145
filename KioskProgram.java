import java.util.Scanner;
public class KioskProgram 
{
	//Creates Prices array
	public static int[] determinePrices(int[] array) //new the int array with the ages in it :)
	{
		int[] prices = new int[array.length];
		for(int i = 0; i < array.length; i ++)
		{
			if(array[i] < 13)
			{
				prices[i] = 8;
			}
			else if(array[i] < 65)
			{
				prices[i] = 12;
			}
			else
			{
				prices[i] = 10;
			}
		}
		return prices;
	}
	
	public static void printDailyRev (int[] array)
	{
		int total = 0;
		for(int i = 0; i < array.length; i++)
		{
			total = array[i] + total;
		}
		System.out.println("Total Tickets Sold: " + array.length);
		System.out.println("Total Reveune Gained: " + total);
	}
	
	
	
	public static void main(String[] args) 
	{
		//create a kiosk program for a movie theater
		//ticket prices 
		//for age < 13 == $8
		//age >= 13 and age < 65 = $12
		//age >= 65 = $10
		
		int[] ages = new int[8];
		Scanner k = new Scanner(System.in);
		
		for(int i = 0; i < ages.length; i++)
		{
			System.out.println("Give me the age of the guest " + (i +1) + ":");
			ages[i] = k .nextInt();
		}
		  int[] prices = determinePrices(ages);
		  printDailyRev(prices);
		

	}

}
