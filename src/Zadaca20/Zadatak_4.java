package Zadaca20;
/*
 * Zadaca 20
 * 
 * Zadatak 4 - Napisati metodu koja kao argument prima neki niz te uklanja sve duplikate iz proslijedjenog niza.
 * 			   Header: public static int[] ukloniDuplikate(int[] niz)
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		int[] niz;
		int brojElemenata;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite duzinu niza: ");
		brojElemenata = input.nextInt();
		niz = new int[brojElemenata];
		
		System.out.print("Unesite " + brojElemenata + " elemenata: ");
		for (int i = 0 ; i < niz.length ; i++)
		{
			niz[i] = input.nextInt();
		}
		
		input.close();
		
		System.out.print("Bez duplikata: ");
		for(int e : ukloniDuplikate(niz))
		{
			System.out.print(e + " ");
		}
		
		
		
		
		

	}
	
	public static int[] ukloniDuplikate(int[] niz)
	{
		boolean unique;
		int[] tmp = new int[niz.length];
		int brojacUniqueElemnata = 0;
		
		for (int i = 0 ; i < niz.length ; i++)
		{
			unique = true;
			for (int j = i-1 ; j >= 0 ; j--)
			{
				if(niz[i] == niz[j])
				{
					unique = false;
					break;
				}
			}
			if (unique)
			{
				tmp[brojacUniqueElemnata] = niz[i];
				brojacUniqueElemnata++;
			}
		}
		return Arrays.copyOf(tmp, brojacUniqueElemnata);
	}

}
