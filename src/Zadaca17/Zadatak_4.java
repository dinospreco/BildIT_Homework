package Zadaca17;
/*
 * Zadaca 17
 * 
 * Zadatak 4 - Napisati metodu koja vraca indeks najmanjeg broja u nizu.
 * 
 * @author Dino Spreco
 * @date 26.11.2017.
 */

import java.util.Scanner;

public class Zadatak_4 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			double[] array = new double[10];
			System.out.print("Unesite 10 brojeva: ");
			
			for (int i = 0 ; i < array.length  ; i++)
			{
				array[i] = input.nextDouble();
			}
			
			input.close();
			
			System.out.println("Indeks najmanje vrijednost u unijetom nizu je: " + indexOfMin(array));
		}
		
		public static int indexOfMin(double[] niz)
		{
			double min = niz[0];
			int index = 0;
			for (int i = 1 ; i < niz.length ; i++)
			{
				if (min > niz[i])
				{
					min = niz[i];
					index = i;
				}
			}
			return index;
		}

	}
