package Zadaca11;
/*
 * Zadaca 11
 * 
 * Zadatak 2 - Napisati metodu sa sljedeci headerom: 
 * 			   
 * 			   public static boolean isProstiBroj(int broj)
 * 
 *  		   koja provjerava da li je broj prost/prime.
 *  		   Napisati test program koji poziva ovu metodu i ispisuje sve proste brojeve od 0 do 100 000.
 * 			   
 * 
 * @author Dino Spreco
 * @date 16.11.2017.
 * 
 */


public class Zadatak_2 {

	public static void main(String[] args) {
		
		int ispis = 0;
		for (int i = 2 ; i <= 100000 ; i++)
		{
			if (isProstiBroj(i))
			{
				if (ispis %10 == 0 && ispis!=0)
				{
					System.out.println();
				}
				System.out.printf("%-6d  ", i);
				ispis++;
			}
		}

	}
	
	public static boolean isProstiBroj(int broj)
	{
		for (int i = 2 ; i <= broj/2 ; i++)
		{
			if (broj%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
