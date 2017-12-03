package Zadaca21;
/*
 * Zadaca 21
 * 
 * Zadatak 3 - Napisati metodu koja vraca sumu svih elemenata u navedenoj koloni matrice koristeci se sljedecim headerom:
 * 			   public static double sumirajKolonu(double[][] niz, int kolona)
 * 			   Napisati program koji pita korisnika da unese 3x4 matricu te ispisuje sumu svih kolona.
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

import java.util.*;

public class Zadatak_3 {

	public static void main(String[] args) {
		double[][] matrica = new double[3][4];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite matricu 3x4 red po red: ");
		for(int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 4 ; j++)
			{
				matrica[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		
		for (int i = 0 ; i < 3 ; i++)
		{
			System.out.println("Zbir " + (i+1) + " kolone: " + sumirajKolonu(matrica, i));
		}

	}
	
	public static double sumirajKolonu(double[][] niz, int kolona)
	{
		double sum = 0;
		for (int i = 0 ; i < niz[kolona].length ; i++)
		{
			sum += niz[kolona][i];
		}
		return sum;
	}

}
