package Zadaca18;
/*
 * Zadaca 18
 * 
 * Zadatak 3 - Program pita korisnika da unese 10 brojeva, te mu ispisuje sve moguce kombinacije parova tih 10 unesenih brojeva. 
 * 			   BONUS - ispisati ukupan broj mogucih kombinacija 
 * 
 * @author Dino Spreco
 * @date 26.11.2017.	
 * 
 */

import java.util.*;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		int[] niz = new int[10];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite 10 razlictih brojeva: ");
		
		for (int i = 0 ; i < 10 ; i++)
		{
			niz[i] = input.nextInt();
		}
		
		input.close();
		
//		System.out.println("Sve moguce kombinacije (ukupno " + ispisiKombinacije(niz,false) + ")");
//		ispisiKombinacije(niz, true);
		
		System.out.println("Sve moguce kombinacije bez ponavljanja (ukupno " + ispisiKombinacijeBezPonavljanja(niz,false) + ")");
		ispisiKombinacijeBezPonavljanja(niz, true);
		
		
	}
	
	public static int ispisiKombinacije(int[] niz, boolean ispisi)
	{
		int brojKombinacija = 0;
		for (int i = 0 ; i < niz.length ; i++)
		{
			for (int j = 0; j < niz.length ; j++)
			{
				if (ispisi)
				{
					System.out.println("( " + niz[i] + " , " + niz[j] + " )");
				}
				brojKombinacija++;
			}
		}
		return brojKombinacija;
	}
	
	public static int ispisiKombinacijeBezPonavljanja(int[] niz, boolean ispisi)
	{
		int brojKombinacija = 0;
		for (int i = 0 ; i < niz.length ; i++)
		{
			for (int j = i + 1 ; j < niz.length ; j++)
			{
				if (ispisi)
				{
					System.out.println("( " + niz[i] + " , " + niz[j] + " )");
				}
				brojKombinacija++;
			}
		}
		return brojKombinacija;
	}

}
