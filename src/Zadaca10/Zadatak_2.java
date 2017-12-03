package Zadaca10;
/*
 * Zadaca 10
 * 
 * Zadatak 2 - Program ispisuje sve faktore unesenog broja
 * 
 * @author Dino Spreco
 * @date 15.11.2017.
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		number = input.nextInt();
		input.close();
		
		System.out.print("Faktori broja " + number + " su: ");
		
		for (int i = 1 ; i <= number ; i++)
		{
			if (number%i == 0) System.out.print(i + " ");
		}

	}

}
