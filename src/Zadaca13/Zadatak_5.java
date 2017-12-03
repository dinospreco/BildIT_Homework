package Zadaca13;
 /*
 * Zadaca 13
 * 
 * Zadatak 5 - Palindrome prime je prosti broj koji je takoder i palindrom. Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * 			   Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. Koristiti metode za rjesenja zadatka. 
 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

 
public class Zadatak_5 {

	public static void main(String[] args) {
		
		System.out.println("U zadatku pise da se ispise prvih 100 brojeva koji su Palindrome Prime.");
		System.out.println("U prvih 100, Palindrome Prime su jednocifreni samo pa ima i drugi dio zadatak koji ispisuje prvih 10000");
		System.out.println();
		System.out.println("Prvih 100:");
		
		int brojac = 0;
		for (int i = 1 ; i <= 100 ; i++)
		{
			
			if (isPrime(i) && isPalindrom(i)) 
			{
				if (brojac % 10 == 0 & brojac != 0)
				{
					System.out.println();
				}
				System.out.printf("%-3d",i);
				brojac++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Prvih 10000:");
		
		brojac = 0;
		for (int i = 1 ; i <= 10000 ; i++)
		{
			
			if (isPrime(i) && isPalindrom(i)) 
			{
				if (brojac % 10 == 0 & brojac != 0)
				{
					System.out.println();
				}
				System.out.printf("%-5d",i);
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
	
	public static boolean isPalindrom(int n)
	{
		String str = Integer.toString(n);
		for (int i = 0 ; i<str.length()/2 ;i++)
		{
			if (str.charAt(i) != str.charAt(str.length()-1-i))
				return false;
		}
		
		return true;
		
	}

}
