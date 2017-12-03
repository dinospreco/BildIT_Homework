package Zadaca18;
/*
 * Zadaca 18
 * 
 * Zadatak 5 - Napisati metodu koja provjerava da li su dva niza identicna. public static boolean identicniNizovi(int[] niz1, in[] niz2)
 * 
 * @author Dino Spreco
 * @date 26.11.2017.	
 * 
 */

import java.util.*;

public class Zadatak_5 {

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
		
		if (identicniNizovi(niz1, niz2))
		{
			System.out.println("Dva niza su identicna");
		}
		else 
		{
			System.out.println("Dva niza nisu identicna");
		}
		
	}
	
	public static boolean identicniNizovi(int[] niz1, int[] niz2)
	{
		int[] copyOfNiz1 = Arrays.copyOf(niz1, niz1.length);
		int[] copyOfNiz2 = Arrays.copyOf(niz2, niz2.length);
		Arrays.sort(copyOfNiz1);
		Arrays.sort(copyOfNiz2);
		return Arrays.equals(copyOfNiz1, copyOfNiz2);
	}

}
