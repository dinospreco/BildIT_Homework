package Zadaca17;
/*
 * Zadaca 17
 * 
 * Zadatak 1 - Program generise 100 nasumicnih brojeva u rasponu od 0 do 9 te ispisuje koliko puta se koji broj ponovio.
 * 
 * @author Dino Spreco
 * @date 25.11.2017.
 */

public class Zadatak_1 {

	public static void main(String[] args) {
		
		int[] brojevi = new int[10];
		int tmp;
		
		for (int i = 0 ; i < 100 ; i++)
		{
			tmp = (int)(Math.random()*10);
			brojevi[tmp]++;
		}
		
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println("Broj " + i + " se ponavlja " + brojevi[i] + " puta.");
		}
	}

}
