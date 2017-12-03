package Zadaca18;
/*
 * Zadaca 18
 * 
 * Zadatak 2 - Napisati metodu koja provjerava da li niz sadrzi 4 ista broja uzastopno
 * 
 * @author Dino Spreco
 * @date 26.11.2017.	
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		int brojElemenataNiza;
		int[] nizBrojeva;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		brojElemenataNiza = input.nextInt();
		System.out.print("Unesite " + brojElemenataNiza + " brojeva: ");
		nizBrojeva = new int[brojElemenataNiza];
		
		for (int i = 0 ; i < brojElemenataNiza ; i++)
		{
			nizBrojeva[i] = input.nextInt();
		}
		
		input.close();
		
		if (daLiSadrziCetriUzastopnaElementa(nizBrojeva))
		{
			System.out.println("Ovaj niz sadrzi 4 ista broja uzastopno!");
		}
		else 
		{
			System.out.println("Ovaj niz NE sadrzi 4 ista broja uzastopno!");
		}

	}
	
	public static boolean daLiSadrziCetriUzastopnaElementa(int[] niz)
	{
		for (int i = 0 ; i < niz.length-3 ; i++)
		{
			if (((niz[i] == niz[i+1]) && (niz[i] == niz[i+2])) && ((niz[i] == niz[i+3])))
			{
				return true;
			}
		}
		
		return false;
	}
	
	

}
