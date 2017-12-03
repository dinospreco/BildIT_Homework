package Zadaca13;
/*
 * Zadaca 13
 * 
 * Zadatak 3 - Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i kada ispisemo naopako. 
 * 			   Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. 
 * 			   Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. Koristiti metode za rješenja zadatka. 
 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

public class Zadatak_3 {

	public static void main(String[] args) {
		
		int brojac = 0;
		for (int i = 1 ; i <= 100 ; i++)
		{
			
			if (isPrime(i) && isPrime(reverseNumber(i))) 
			{
				if (brojac % 10 == 0 & brojac != 0)
				{
					System.out.println();
				}
				System.out.printf("%-6d",i);
				brojac++;
			}
			
		}

	}
	
	public static boolean isPrime(int n)
	{
		for (int i = 2 ; i < n/2 + 1 ; i++)
		{
			if (n%i == 0) return false;
		}
		return true;
	}
	
	public static int reverseNumber(int n)
	{
		int reversedNumber = 0;
		while (n > 0)
		{
			reversedNumber += n%10;
			reversedNumber *= 10;
			n = n/10;
		}
		
		return reversedNumber/10;
	}

}
