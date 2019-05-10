import java.util.Scanner;
public class Rainfall {
	
	public static void main(String[] Rainfall)
	{	
		//setup scanner//
		Scanner scan = new Scanner(System.in);
		//prompt user for the number of years and declare variables//
		int numYears;
		int totalMonths = 0;
		final int months = 12;
		double rainPerMonth, averageRain;
		double totalRain = 0;
			
		System.out.println("How many years do you want to track?");
		numYears = scan.nextInt();
		
		//prompt for rainfall per month and for-loop for individual years//
		System.out.println("Enter the amount of rain for each month.");
		for(int a = 0; a < numYears; a++) {
			for(int b = 1; b < months+1; b++) {
				switch(b) {
				case 1: System.out.println("January");
				break;
				
				case 2: System.out.println("February");
				break;
				
				case 3: System.out.println("March");
				break;
				
				case 4: System.out.println("April");
				break;
				
				case 5: System.out.println("May");
				break;
				
				case 6: System.out.println("June");
				break;
				
				case 7: System.out.println("July");
				break;
				
				case 8: System.out.println("August");
				break;
				
				case 9: System.out.println("September");
				break;
				
				case 10: System.out.println("October");
				break;
				
				case 11: System.out.println("November");
				break;
				
				case 12: System.out.println("December");
				break;
				
				default: System.out.println("");
				}
				rainPerMonth = scan.nextDouble();
				totalRain += rainPerMonth;
		
			}
			totalMonths += months;
		}
	averageRain = totalRain / totalMonths;
	System.out.println("The total number of months is " + totalMonths + ".");
	System.out.println("The total inches of rainfall is " + totalRain + ".");
	System.out.println("The average inches of rainfall is " + averageRain + ".");
	}
}
