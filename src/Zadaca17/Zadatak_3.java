package Zadaca17;
/*
 * Zadaca 17
 * 
 * Zadatak 2 - Napisati metodu koja vraca najmanju vrijednost u nizu od 10 unesenih brojeva.
 * 
 * @author Dino Spreco
 * @date 25.11.2017.
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.print("Unesite 10 brojeva: ");
		
		for (int i = 0 ; i < array.length  ; i++)
		{
			array[i] = input.nextDouble();
		}
		
		input.close();
		
		System.out.println("Najmanja vrijednost u unijetom nizu je: " + min(array));
	}
	
	public static double min(double[] niz)
	{
		double min = niz[0];
		for (int i = 1 ; i < niz.length ; i++)
		{
			if (min > niz[i])
			{
				min = niz[i];
			}
		}
		return min;
	}

}
