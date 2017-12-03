package Zadaca20;
/*
 * Zadaca 20
 * 
 * Zadatak 5 - Napisati metodu koja kao argument prima niz cijelih brojeva neodredjene duzine te vraca najveci zajednicki djelilac.
 * 			   Header: public static int nzd(int... brojevi);
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

import java.util.*;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		int duzinaNiza;
		int[] niz;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite duzinu niza: ");
		duzinaNiza = input.nextInt();
		niz = new int[duzinaNiza];
		
		System.out.print("Unesite " + duzinaNiza + " brojeva: ");
		for (int i = 0 ; i < duzinaNiza ; i++ )
		{
			niz[i] = input.nextInt();
		}
		input.close();
		
		System.out.println("Najveci zajednicki djelilac unesenih brojeva je: " + nzd(niz));

	}
	
	public static int nzd(int... brojevi)
	{
		Arrays.parallelSort(brojevi);
		boolean jestDjeljiv;
		int nzd = 0;
				
		for (int i = 1 ; i <= brojevi[0] ; i++)
		{
			jestDjeljiv = true;
			for (int j = 0 ; j < brojevi.length ; j++)
			{
				if (brojevi[j] % i != 0)
				{
					jestDjeljiv = false;
					break;
				}
			}
			
			if(jestDjeljiv)
			{
				nzd = i;
			}
		}
		return nzd;
	}

}
