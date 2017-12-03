package Zadaca13;
/*
 * Zadaca 13
 * 
 * Zadatak 4 - Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer, brojevi 3 i 5 su twin primes, 
 * 			   brojevi 5 i 7 i 11 i 13 su takoder twin primes. Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 
 * 			   10 parova po liniji. Koristiti metode za rješenja zadatka. 
 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

public class Zadatak_4 {

	public static void main(String[] args) {
		
		int brojac = 0;
		for (int i = 1 ; i <= 10000 ; i++)
		{
			
			if (isPrime(i) && isPrime(i+2)) 
			{
				if (brojac % 10 == 0 & brojac != 0)
				{
					System.out.println();
				}
				System.out.printf("%5d %-5d ",i,i+2);
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

}
