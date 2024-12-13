package Coins;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		String yn = "yes";
	
		while (yn != "quit")
		{
		
		
			Scanner scan = new Scanner(System.in);	

				System.out.println("Enter amount: ");
		try {
				double number = scan.nextDouble();
				
				number = number * 100;
				
				Coin c1 = new Coin(number);
		
				System.out.print(c1);
		} catch (Exception e) {}
		finally {
				
				System.out.print("Continue? ");
				
				 yn = scan.next();
		}
				 
		}
				
	}

}
