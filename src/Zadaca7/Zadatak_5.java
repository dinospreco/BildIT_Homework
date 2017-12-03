package Zadaca7;
/*
 * Zadaca 7
 * 
 * Zadatak 5 - Pretpostaviti da se registarska tablica za auto sastoji od 3 Uppercase karaktera i 4 broja (AAA-1234).
 * 			   Napisati program koji nasumicno generise tablicu.
 * 
 *@author - Dino Spreco
 *@date 4.11.2017.
 */

public class Zadatak_5 {

	public static void main(String[] args) {

		String plate = "";

		for (int i = 0; i<3;i++)
		{
			//formula za random broj sa granicama "min" i "max" je: min + (int)Math.random() * ((max-min)+1)
			plate += (char)( 65 + (int)(Math.random() * ( (90-65)+1) ) );
		}
		
		plate += "-";
		
		for (int i = 0; i<4;i++)
		{
			//formula za random broj sa granicama "min" i "max" je: min + (int)Math.random() * ((max-min)+1)
			plate += ( 1 + (int)(Math.random() * ( (9-1)+1) ) );
		}
		
		System.out.println(plate);

	}

}
