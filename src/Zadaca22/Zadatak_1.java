package Zadaca22;
/*
 * Zadaca 22
 * 
 * Zadatak 1 - Napisati metodu koja implementira Bubble sort alrgoritam.
 * 			   Napisati program koji pita korisnika da unese 10 double brojeva, poziva metodu te ispisuje korisniku sortirani niz.
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		double[] niz = new double[10];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite 10 brojeva:");
		
		for(int i = 0 ; i < 10 ; i++)
		{
			niz[i] = input.nextDouble();
		}
		
		input.close();
		
		bubbleSort(niz);
		System.out.println();
		
		for (double e : niz)
		{
			System.out.print(e + " ");
		}
	}
	
	public static void bubbleSort(double[] niz)
	{
		double tmp;
		boolean sortirano;
		
		for(int i = 0 ; i < niz.length ; i++)
		{
			sortirano = true;
			for (int j = 1 ; j < niz.length-i ; j++)
			{
				if (niz[j-1] > niz[j])
				{
					tmp = niz[j-1];
					niz[j-1] = niz[j];
					niz[j] = tmp;
					sortirano = false;
				}
			}
			if(sortirano)
			{
				break;
			}
		}
	}
}
