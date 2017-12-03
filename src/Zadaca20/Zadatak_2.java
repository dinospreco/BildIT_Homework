package Zadaca20;
/*
 * Zadaca 20
 * 
 * Zadatak 2 - Napisati metodu koja kao argument prima dva niza te vraca jedan kombinovani niz.
 * 			   Npr ukoliko unesemo dva niza [1,2,3] i [10,11,12] metoda treba da vrati [1,10,2,11,3,12]
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int duzinaNizova;
		
		System.out.print("Unesite duzinu nizova: ");
		duzinaNizova = input.nextInt();
		int[] niz1 = new int[duzinaNizova];
		int[] niz2 = new int[duzinaNizova];
		
		
		System.out.print("Unesite " + duzinaNizova + " za prvi niz: ");
		for (int i = 0 ; i < duzinaNizova ; i++)
		{
			niz1[i] = input.nextInt();
		}

		System.out.print("Unesite " + duzinaNizova + " za drugi niz: ");
		for (int i = 0 ; i < duzinaNizova ; i++)
		{
			niz2[i] = input.nextInt();
		}

		input.close();
	
		ispisiNiz(kombinacijaNizova(niz1, niz2));	
		
	

	}
	
	public static void ispisiNiz(int[] niz)
	{
		for (int i = 0 ; i < niz.length ; i++)
		{
			System.out.print(niz[i]);
			{
				if (i < niz.length-1)
				{
					System.out.print(", ");
				}
			}
		}
	}
	
	public static int[] kombinacijaNizova(int[] niz1, int[] niz2)
	{
		int[] kombinacija = new int[niz1.length+niz2.length];
		for (int i = 0, j = 0 ; i < niz1.length ; i++ , j+=2)
		{
			kombinacija[j] = niz1[i];
			kombinacija[j+1] = niz2[i];
		}
		return kombinacija;
	}

}
