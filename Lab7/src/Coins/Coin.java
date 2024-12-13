package Coins;

public class Coin {
double ten, five, one, quarter, dime, nickel, penny;
	
	public Coin(double number)
	{
		
		while (number >= 0)
			if (number >= 1000)
			{
				ten = number / 1000;
				number = number - (ten * 1000);
			}
				else 
					
					if (number >= 500)
					{
						five = number / 500;
						number = number - (five * 500);
					}
					else 
						
						if (number >= 100)
						{
							one = number / 100;
							number = number - (one * 100);
						}
						else 
							if (number >= 25)
							{
								quarter = number / 25;
								number = number - (quarter * 25);
							}
							else 
								if (number >= 10)
								{
									dime = number / 10;
									number = number - (dime * 10);
								}
								else 
									if (number >= 5)
									{
										nickel = number / 5;
										number = number - (nickel *5);
									}
									else
										penny = number / 1;

		}
		
	
		public String toString()
		{
			String result = ten + "ten dollar bills";
			result += five + "\n five dollar bills";
			result += one + "\n one dollar bills";
			result += quarter + "\n quarters";
			result += dime + "\n dimes";
			result += nickel + "\n nickels";
			result += penny + "\n pennies";
			return result;
			
		}

}
