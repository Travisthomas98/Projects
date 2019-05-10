import java.util.Scanner;
class discountcode {
	//Setting up utilities needed for this project
	
	
	public static void main(String discountCode[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables
		int quant,discountOne,discountTwo,discountThree,discountFour;
		double price;
		double finalPrice = 0;
		
		discountOne = 20;
		discountTwo = 30;
		discountThree = 40;
		discountFour = 50;
		//Telling user about discount and what the discount prices are.
		System.out.println("eMech is offering discounts on the Starer Kit. The Starter Kit includes a computer and needed software to perform basic daily functions. The Starter Kit sells for $95.00. Discounts are given below.");
		System.out.println("10 - 19 gives a 20% discount");
		System.out.println("20 - 49 gives a 30% discount");
		System.out.println("50 - 99 gives a 40% discount");
		System.out.println("100 or more gives a 50% discount");
		
		//Asking user how many they would like to purchase and prompting them for answer.
		System.out.println("How many would you like to purchase?");
		
		price = 95.00;
		quant = sc.nextInt();
		
		if (quant <= 9)
		{ 
			finalPrice = 95;
		}
		
		else if (quant >= 10 && quant <= 19)
		{
			finalPrice = price - (price * discountOne)/100;
		}
		
		else if (quant >= 20 && quant <= 49)
		{
			finalPrice = price - (price * discountTwo)/100;
		}
		
		else if (quant >= 50  && quant <= 99)
		{
			finalPrice = price - (price * discountThree)/100;
		}
		
		else if (quant >= 100)
		{
			finalPrice = price - (price * discountFour)/100;
		}
		//calculate finalPrice
		
		
		System.out.print("You purchased " + quant + " packages. Your total is $" + finalPrice +".");
		
	}
}
