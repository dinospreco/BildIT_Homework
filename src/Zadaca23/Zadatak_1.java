package Zadaca23;
/*
 * Zadaca 23
 * 
 * Zadatak 1 - Napisati metodu koja kao argument prima niz te vraca true ili false u zavisnosti da li je niz sortiran uzlazno.
 * 			   Header: public static boolean isSortiran(int[] niz)
 * 
 * 			   Napisati program koji pita korisnika da unese duzinu niza, niz i ispise mu da li je sortiran ili nije
 * 
 * @author Dino Spreco
 * @date 3.12.2017.
 */

import java.util.*;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] niz;
		int duzinaNiza;
		
		System.out.print("Unesite duzinu niza: ");
		duzinaNiza = input.nextInt();
		
		System.out.print("Unesite " + duzinaNiza + " elemenata: ");
		niz = new int[duzinaNiza];
		
		for (int i = 0 ; i < duzinaNiza ; i++)
		{
			niz[i] = input.nextInt();
		}
		
		input.close();
		
		if (isSortiran(niz))
		{
			System.out.println("Uneseni niz je sortiran");
		}
		else
		{
			System.out.println("Uneseni niz nije sortiran");
		}

	}
	
	public static boolean isSortiran(int[] niz)
	{
		for (int i = 0 ; i < niz.length - 1 ; i++)
		{
			if (niz[i] > niz[i+1])
			{
				return false;
			}
		}
		
		return true;
	}
	
}
