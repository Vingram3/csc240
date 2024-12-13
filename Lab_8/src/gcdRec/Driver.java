package gcdRec;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter positive integer as numerator: ");
		num1 = scan.nextInt();
		System.out.println("Enter positive integer a denominator: ");
		num2 = scan.nextInt();
		
		RationalNumber number = new RationalNumber(num1, num2);
		RationalNumber.solve();
		
	}
	

}
