package Zadaca18;
/*
 * Zadaca 18
 * 
 * Zadatak 4 - Napisati metodu koja provjerava da li su dva niza striktno identicna. public static boolean striktnoIdenticniNizovi(int[] niz1, in[] niz2)
 * 
 * @author Dino Spreco
 * @date 26.11.2017.	
 * 
 */

import java.util.*;

public class Zadatak_4 {

	public static void main(String[] args) {
		int[] niz1;
		int[] niz2;
		int duzinaNizova;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite duzinu nizova: ");
		
		duzinaNizova = input.nextInt();
		
		niz1 = new int[duzinaNizova];
		niz2 = new int[duzinaNizova];
		
		System.out.print("Unesite prvi niz: ");
		
		for (int i = 0 ; i < duzinaNizova ; i++)
		{
			niz1[i] = input.nextInt();
		}
		
		System.out.print("Unesite drugi niz:");
		
		for (int i = 0 ; i < duzinaNizova ; i++)
		{
			niz2[i] = input.nextInt();
		}
		
		input.close();
		
		if (striktnoIdenticniNizovi(niz1, niz2))
		{
			System.out.println("Dva niza su striktno identicna");
		}
		else 
		{
			System.out.println("Dva niza nisu striktno identicna");
		}

	}
	
	public static boolean striktnoIdenticniNizovi(int[] niz1, int[] niz2)
	{
		return Arrays.equals(niz1, niz2);
	}

}
