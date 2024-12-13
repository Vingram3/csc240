package gcdRec;

public class RationalNumber {
	
	private int numerator, denominator;
	
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		
	}
	public static void solve() {
		gcd(numerator, denominator);
		
	}
	private void gcd(int num1, int den2) {
		int remainder = 0;
		
		if (num1 == 0) {
			System.out.println("Greatest common denominator of " + numerator + "/" + denominator 
					+ " is " + remainder);
		}
			else 
				if (num1 > den2) {
				remainder = num1 % den2;
				gcd(num1-remainder, den2);
			}
				else 
					remainder = den2 % num1;
		gcd(num1, den2-remainder);
			
		}

}
