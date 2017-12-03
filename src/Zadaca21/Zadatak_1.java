package Zadaca21;
/*
 * Zadaca 21
 * 
 * Zadatak 1 - Napisati program koji nasumicno generise 100.000 brojeva. Nakon sto je program generiso brojeve,
 * 			   program pita korisnika da unese vrijednost koju zeli pronaci u nizu.
 * 			   Izmjeriti vrijeme potrebno za pronalazenje vrijednosti koristeci linearni i binarni algoritam.
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_1 {

	public static void main(String[] args) {
		long pocetnoVrijeme;
		long krajnjeVrijeme;
		int key;
		int pozicija;
		int niz[] = generisiNasumicniNiz(100000);
		niz[4684] = 101;
		
		Arrays.sort(niz);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite vrijednost za pretrazivanje: ");
		key = input.nextInt();
		
		input.close();
		
		System.out.println("\n*** LINEARNO PRETRAZIVANJE ***");
		pocetnoVrijeme = System.currentTimeMillis();
		pozicija = linearnoPretrazivanje(niz, key);
		krajnjeVrijeme = System.currentTimeMillis();
		
		if(pozicija >= 0)
		{
			System.out.println("Vrijednost pronadjena na " + pozicija + " poziciji. Pretraga zavrsena za " + (krajnjeVrijeme-pocetnoVrijeme) + " ms");
		}
		else 
		{
			System.out.println("Vrijednost NIJE pronadjena. Pretraga zavrsena za " + (krajnjeVrijeme-pocetnoVrijeme) + " ms");
		}
		
		System.out.println("\n*** BINARNO PRETRAZIVANJE ***");
		pocetnoVrijeme = System.currentTimeMillis();
		pozicija = Arrays.binarySearch(niz, key);
		krajnjeVrijeme = System.currentTimeMillis();
		
		if(pozicija >= 0)
		{
			System.out.println("Vrijednost pronadjena na " + pozicija + " poziciji. Pretraga zavrsena za " + (krajnjeVrijeme-pocetnoVrijeme) + " ms");
		}
		else 
		{
			System.out.println("Vrijednost NIJE pronadjena. Pretraga zavrsena za " + (krajnjeVrijeme-pocetnoVrijeme) + " ms");
		}

	}
	
	public static int linearnoPretrazivanje(int[] niz, int key)
	{
		for (int i = 0 ; i < niz.length ; i++)
		{
			if (niz[i] == key)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static int[] generisiNasumicniNiz(int brojElemenata)
	{
		int[] niz = new int[brojElemenata];
		for (int i = 0 ; i < brojElemenata ; i++)
		{
			niz[i] = (int)(Math.random()*100);
		}
		return niz;
	}

}
