import java.time.*;
import java.util.Scanner;

public class HowOldTenkDays
{
	public static void main(String[] args)
	{
		String name;
		int month;
		int day;
		int year;
		final int FUTURE = 10000;
		//stores todays date
		LocalDate tday = LocalDate.now();
		
		Scanner input = new Scanner(System.in);
		
		//prompts user for birthday
		System.out.println("");
		System.out.print("Enter your name: ");
		name = input.nextLine();
		System.out.print("Enter the number month you were born(MM): ");
		month = input.nextInt();
		System.out.print("Enter the number day you were born(DD): ");
		day = input.nextInt();
		System.out.print("Enter the full number year you were born(YYYY): ");
		year = input.nextInt();
		
		//stores birthday input
		LocalDate birthday = LocalDate.of(year, month, day);
		
		//prints users birthday
		System.out.println("");
		System.out.println("Date format: YYYY-MM-DD");
		System.out.println(name + ", your Birthday is on: " + birthday);
		
		//prints todays date
		System.out.println("Today is: " + tday);
		
		//stores the value of the difference between this year and the year you will be 10k years old 
		int diff = (tday.compareTo(birthday.plusDays(FUTURE)));
		// prints differnce if needed -- System.out.println(diff);
		System.out.println("");
		//prints out when you will be 10k years old 1.10.2018 - 8.25 .1990
		if (diff > 0){
			System.out.println(name + ", you were " + FUTURE + " days old on: " + birthday.plusDays(FUTURE));
		}else if(diff < 0){
			System.out.println(name + ", you will be " + FUTURE + " days old on: " + birthday.plusDays(FUTURE));
		}else{ 
			System.out.println(name + ", you are 10000 days old on: " + birthday.plusDays(FUTURE) + "\nOH SNAP THAT'S TODAY, GO CELEBRATE!!!!! " );
		}
	}
}