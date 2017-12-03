package Zadaca20;
/*
 * Zadaca 20
 * 
 * Zadatak 1 - Napisati metodu koja prima niz brojeva te vraca, kao novi niz, sve elemente na neparnim pozicijama.
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int duzinaNiza;
		int[] nizElemnata;
		int[] neparnePozicije;
		
		System.out.print("Unesite duzinu niza: ");
		duzinaNiza = input.nextInt();
		
		System.out.print("Unesite " + duzinaNiza + " elemenata: ");
		nizElemnata = new int[duzinaNiza];
		for (int i = 0 ; i < duzinaNiza ; i++)
		{
			nizElemnata[i] = input.nextInt();
		}
		
		input.close();
		
		neparnePozicije = samoElementiNaNeparnimPozicijama(nizElemnata);
		
		System.out.println("Elementi sa neparnih pozicija su: ");
		
		for (int i = 0 ; i < neparnePozicije.length ; i++)
		{
			System.out.print(neparnePozicije[i] + " ");
		}

	}
	
	public static int[] samoElementiNaNeparnimPozicijama(int[] niz)
	{
		int[] elementi = new int[niz.length/2];
		for (int i = 0, j = 1 ; i < niz.length/2 ; i++ , j+=2)
		{
			elementi[i] = niz[j];
		}
		
		return elementi;
	}

}
