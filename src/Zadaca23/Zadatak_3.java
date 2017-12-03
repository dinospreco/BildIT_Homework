package Zadaca23;
/*
 * Zadaca 23
 * 
 * Zadatak 3 - Zamislimo kompaniju u kojoj su svi radni sati uposlenika spremljeni u 2D niz / matricu. 
 * 			   Svaki red matrice predstavlja 7 radnih dana zaposlenika, gdje svaka kolona predstavlja jedan radni dan. 
 * 			   Uposlenik 0 se nalazi u prvom redu, Uposlenik 1 u drugom redu, itd.  Kao primjer, uzmimo sljedecu 7 x 7 matricu:
 * 			   
 * 			   2 4 3 4 5 8 8 
 * 			   7 3 4 3 3 4 4
 * 			   3 3 4 3 3 2 2 
 * 			   9 3 4 7 3 4 1 
 * 			   3 5 4 3 6 3 8
 * 			   3 4 4 6 3 4 4
 * 			   3 7 4 8 3 8 4
 * 			
 * 			   Napisati program koji prolazi kroz ovu matricu te ispisuje uposlenike i njihov ukupan broj odradenih sati u silaznom redosljedu. 
 * 			   (uposlenik sa najvise sati na vrhu, sa najmanje na dnu.)
 * 
 * @author Dino Spreco
 * @date 3.12.2017.
 */

import java.util.*;

public class Zadatak_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj radnika: ");
		int brojRadnika = input.nextInt();
		int[][] sati = new int[brojRadnika][7];
		int[][] ukupanBrojSati = new int[brojRadnika][2];
		
		for (int i = 0 ; i < sati.length ; i++)
		{
			System.out.print("Sati radnika broj " + (i+1) + " (7 dna): ");
			for (int j = 0 ; j < 7 ; j++)
			{
				sati[i][j] = input.nextInt();
			}
		}
		
		input.close();
		
		izracunajSate(sati, ukupanBrojSati);
		sortirajRadnike(ukupanBrojSati);
		ispisiMatricuRadika(ukupanBrojSati);

	}

	public static void izracunajSate(int[][] sati, int[][] ukupanBrojSati)
	{		
		for (int i = 0 ; i < sati.length ; i++)
		{
			ukupanBrojSati[i][1] = i + 1;
			for (int j = 0 ; j < 7 ; j++)
			{
				ukupanBrojSati[i][0] += sati[i][j];
			}
		}
	}
	
	public static void sortirajRadnike(int[][] radnici)
	{
		int[] tmpReferenca;
		
		for (int i = 0 ; i < radnici.length ; i++)
		{
			for (int j = i ; j < radnici.length ; j++)
			{
				if (radnici[i][0] < radnici[j][0])
				{
					tmpReferenca = radnici[i];
					radnici[i] = radnici[j];
					radnici[j] = tmpReferenca;
				}
			}
		}
	}
	
	public static void ispisiMatricuRadika(int[][] matrica)
	{
		for (int i = 0 ; i < matrica.length ; i++)
		{
			System.out.println("Radnik broj: " + matrica[i][1] + "    Broj sati: " + matrica[i][0]);
		}
	}

}
