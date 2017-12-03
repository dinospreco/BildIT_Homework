package Zadaca21;
/*
 * Zadaca 21
 * 
 * Zadatak 4 - Napisati metodu koja sabira sve elemente duz silazne dijagonale nxn matrice koristeci se sljedecim headerom.
 * 			   public static double sumirajSilaznuDijagonalu(double[][] niz).
 * 			   Napisati program koji pita korisnika da unese matricu 4x4 double vrijednosti te ispisuje sumu svih elemenata duz silazne dijagonale.
 * 			   BONUS - Napisati metodu koja sabira sve elemente duz uzlazne dijagonale.
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		double[][] matrica = new double[4][4];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite matricu 4x4 red po red: ");
		for(int i = 0 ; i < 4 ; i++)
		{
			for (int j = 0 ; j < 4 ; j++)
			{
				matrica[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		
		System.out.println("Suma silazne dijagonale: " + sumirajSilaznuDijagonalu(matrica));
		System.out.println("Suma uzlazne dijagonale: " + sumirajUzlaznuDijagonalu(matrica));

	}
	
	public static double sumirajSilaznuDijagonalu(double[][] niz)
	{
		double sum = 0;
		for (int i = 0 ; i < niz.length ; i++)
		{
			sum += niz[i][i];
		}
		return sum;
	}
	
	public static double sumirajUzlaznuDijagonalu(double[][] niz)
	{
		double sum = 0;
		for (int i = niz.length-1 ; i >= 0 ; i--)
		{
			sum += niz[niz.length-1-i][i];
		}
		return sum;
	}
	
	

}
