package Zadaca12;
/*
 * Zadaca 12
 * 
 * Zadatak 3 - Napisati metodu koja ispisuje n x n matricu koristeci se headerom: public static void printMatrix(int n).
 * 			   Svaki element u matrici je 0 ili 1 nasumicno generisan. Napisati test program koji pita korisnika da unese broj n
 * 			   te mu ispise n x n matricu u konzoli
 * 			    
 * @author Dino Spreco
 * @date 17.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		int dimension;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite n: ");
		dimension = input.nextInt();
		input.close();
		
		printMatrix(dimension);
		

	}
	
	public static int randomIntegerWithinRange(int min, int max)
	{
		return (min + (int)(Math.random()*(max-min + 1)));
	}
	
	public static void printMatrix(int n)
	{
		int[][] matrix = new int[n][n];

		
		for (int i = 0 ; i < n ; i++)
		{
			for (int j = 0 ; j < n ; j++)
			{
				matrix[i][j] = randomIntegerWithinRange(0, 1);
			}
		}
		
		for (int i = 0 ; i < n ; i++)
		{
			for (int j = 0 ; j < n ; j++)
			{
				System.out.printf("%-2d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
