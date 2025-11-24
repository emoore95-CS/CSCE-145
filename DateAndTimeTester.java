//Name: Elizabeth Moore 
import java.util.Scanner;
public class DateAndTimeTester
{
	public void run () // Handles user input loop and calls the logic.
	{
		Scanner k = new Scanner(System.in);
		boolean play = true;
	while(play)
	{ 
		System.out.println("Hello! Enter a date and time '(MM/DD hh:mm)' "
			+ "and I will determine if it is vaild!");
		String input = k.nextLine();
						
		if(isValid(input) == true)
		{
			System.out.println("The date and time you entered is valid!!");
		}
		else
		{
			System.out.println("The date and time you entered is NOT valid!!");
		}
		System.out.println("Would you like to leave? Type 'quit' to exit or press [ENTER] to continue: ");
		String answer =k.nextLine();
		if(answer.equals("quit"))
		{
			System.out.println("Goodbye!! :)");
			System.exit(0);
			play = false;
		}
	}
	}

	public boolean isValid(String input)
	{
		boolean valid = false;
		int space = input.indexOf(" ");
		 if (space <= 0 || space == input.length() - 1) // Ensures the input string has a space and it's not at the start or end.
		 {
	           return valid; // returns false
	     }
		   String datePart = input.substring(0, space);
	       String timePart = input.substring(space + 1);
	       
	      return isValidDate(datePart) && isValidTime(timePart); // Date and Time must both be valid for the entire string to be valid.
	}

	public boolean isValidDate(String datePart) 
	{

		boolean valid = false;
		int month = getMonth(datePart);
		int day = getDay(datePart);

		if(month >= 1 && month <= 12) // First check for valid month range
		{
			if(month == 4 || month == 6 || month == 9 || month == 11)
			{
				if(day < 1 || day > 30) // returns false for days outside 1-30
				{
					return valid;
				}
				else
				{
					valid = true;
				}
			}
			else if(month == 2)
			{
				if(day < 1 || day > 28) // returns false for days outside 1-28
				{
					return valid;
				}
				else
				{
					valid = true;
				}
			}
			else if(day < 1 || day > 31 ) // For the 31-day months
			{
				return valid;
			}
			else 
			{
				valid = true;
			}	

		}
		return valid;
	}

	public boolean isValidTime(String timePart)
	{
		boolean valid = false;
		int hour = getHour(timePart);
		int min = getMinute(timePart);

		if(hour >= 1 && hour <= 12) // Check for valid hours (1 to 12)
		{
			if(min >= 0 && min <= 59) // Check for valid mintues (00 to 59)
			{
				valid = true;
			}
		}
		return valid;
	}

	public int getMonth(String input)
	{
		// Finds the '/'  to seprate the month and date 
		int slashIndex = input.indexOf("/");
		String month = input.substring(0,slashIndex);
		return Integer.valueOf(month);
	}

	public int getDay(String input)
	{
		int slashIndex = input.indexOf("/");
		String day = input.substring(slashIndex + 1);
		return Integer.valueOf(day);
	}

	public int getHour(String input)
	{
	// Finds the ':'  to seprate the hour and mintues 
		int colonIndex = input.indexOf(":");
		String hour = input.substring(0,colonIndex);
		return Integer.valueOf(hour);
	}

	public int getMinute(String m)
	{
		int colonIndex = m.indexOf(":");
		String minute = m.substring(colonIndex + 1);
		return Integer.valueOf(minute);
	}


}

