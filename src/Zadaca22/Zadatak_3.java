package Zadaca22;
/*
 * Zadaca 22
 * 
 * Zadatak 3 - Napisati metodu koja vraca proizvod dvije matrice.
 * 			   Header public static double[][] pomnoziMatrice(double[][] a, double[][] b)
 * 			   Napisati program koji pita korisnika da unese dvije 3x3 matrice te ih pomnozi.
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

import java.util.Scanner;

public class Zadatak_3 {

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
		
		if ((suma = pomnoziMatrice(a, b)).length == 0)
		{
			System.out.println("Matrice se ne mogu pomnoziti.");
		}
		else
		{
			System.out.println("Proizvod matrica A i B je: ");
			
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
	
	public static double[][] pomnoziMatrice(double[][] a, double[][] b)
	{
		double[][] c = {};
		
		 // Provjera dimenzije matrica za mnozenje
		if (a[0].length != b.length) 
		{
			return c;
		}

		c = new double[a.length][b[0].length];
		
		for (int i = 0 ; i < a.length ; i++)
		{
			for (int j = 0 ; j < b[0].length ; j++)
			{
				for (int m = 0 ; m < a[0].length ; m++)
				{
					c[i][j] += (a[i][m]*b[m][j]);
				}
			}
		}
		
		return c;
	}

}
