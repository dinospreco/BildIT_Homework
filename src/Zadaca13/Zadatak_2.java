package Zadaca13;
/*
 * Zadaca 13
 * 
 * Zadatak 2 - Napisati metodu sa sljedecim headerom: public static boolean isPrime(int n) koja provjerava da li je broj prost/prime. 
 * 			   Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

public class Zadatak_2 {

	public static void main(String[] args) {
		
		int brojac = 0;
		for (int i = 1 ; i <= 100000 ; i++)
		{
			
			if (isPrime(i)) 
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

}
