package Assignment;

import java.time.*;


//Write a program to add some days in date which has taken from command line 
//arguments.
//Input – date : 20-05-2022 and days : 5
//Output – 25-05-202
public class Quastion_6 {

	public static void main(String[] args)
	{
		//
		LocalDate date = LocalDate.of(2022,05,20);
		LocalDate dd=date.plusDays(5);
		
		int d=dd.getDayOfMonth();
		int mm =date.getMonthValue();
		int yyyy =date.getYear();
		
		System.out.printf("%d-%d-%d",d,mm,yyyy);
		
	}

}
