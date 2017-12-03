package Zadaca22;
/*
 * Zadaca 22
 * 
 * Zadatak 2 - Napisati metodu koja vraca zbir dvije matrice.
 * 			   Header public static double[][] saberiMatrice(double[][] a, double[][] b)
 * 			   Napisati program koji pita korisnika da unese dvije 3x3 matrice te ih sabere.
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] suma = {};
		
		System.out.println("Unesite matricu A (3x3) red po red: ");
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 3 ; j++)
			{
				a[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Unesite matricu B (3x3) red po red: ");
		for (int i = 0 ; i < 3 ; i++)
		{
			for (int j = 0 ; j < 3 ; j++)
			{
				b[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		
		
		
		if ((suma = saberiMatrice(a, b)).length == 0)
		{
			System.out.println("Matrice se ne mogu sabrati.");
		}
		else
		{
			System.out.println("Zbir matrica A i B je: ");
			
			for (int i = 0 ; i < suma.length ; i++)
			{
				for (int j = 0 ; j < suma[i].length ; j++)
				{
					System.out.print(suma[i][j] + " ");
				}
				System.out.println();
			}
		}

	}
	
	public static double[][] saberiMatrice(double[][] a, double[][] b)
	{
		double[][] c = {};
		
		if ((a.length != b.length) || (a[0].length != b[0].length))  // Provjera dimenzija matrica za sabiranje
		{
			return c;
		}
		
		c = new double[a.length][a[0].length];
		
		for (int i = 0 ; i < a.length ; i++)
		{
			for (int j = 0 ; j < a[i].length ; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}

}
