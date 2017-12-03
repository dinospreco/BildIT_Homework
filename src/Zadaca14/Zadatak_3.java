package Zadaca14;
/*
 * Zadaca 14
 * 
 * Zadatak 3 - Napisati metodu koja prima jedan argument, broj pitanja, te generise toliko nasumicnih, jednostavnih pitanja oduzimanja tipa : 
 * 			   „Koliko je 5 - 2 ?“. Metoda treba da broji broj tacnih i netacnih odgovora te ih ispiše korisniku. 

 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj pitanja: ");
		pitanjaOduzimanja(input.nextInt());
		input.close();

	}
	
	public static void pitanjaOduzimanja (int brojPitanja)
	{
		Scanner input = new Scanner(System.in);
		int brojTacnihOdgovora = 0;
		int brojNetacnihOdgovora = 0;
		int a,b;
		int rezultat;
		
		for (int i = 0 ; i < brojPitanja ; i++)
		{
			a = (int)(Math.random()*10+1);
			b = (int)(Math.random()*10+1);
			
			if (a > b) System.out.print("Koliko je " + a + " - " + b + " ? ");
			else System.out.print("Koliko je " + b + " - " + a + " ? ");
			rezultat = input.nextInt();
			
			if (Math.abs(a-b) == rezultat)
			{
				brojTacnihOdgovora++;
			}
			else
			{
				brojNetacnihOdgovora++;
			}
			
		}
		input.close();
		System.out.println("Broj tacnih odgovora: " + brojTacnihOdgovora);
		System.out.println("Broj netacnih odgovora: " + brojNetacnihOdgovora);
	}

}
