package Zadaca8;
/*
 * Zadaca 8.
 * 
 * Zadatak 2 - Program ucitava neodredjen broj cijelih brojeva, odredjuje koliko je uneseno pozitivnih, koliko negativnih, te 
 * 			   izracunava ukupnu sumu i izracunava prosjek svih unesenih brojeva. (Nula za prekid unosa)
 * 
 * @author Dino Spreco
 * @date 13.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sumOfAllNumbers = 0;
		int negativeNumbersCount = 0;
		int positiveNumbersCount = 0;
		int number;

		System.out.print("Insert sequence of integers (0 for end): ");
		
		while(true)
		{
			number = input.nextInt();

			if (number < 0)
			{
				negativeNumbersCount++;
				sumOfAllNumbers += number;
			}
			else if (number > 0)
			{
				positiveNumbersCount++;
				sumOfAllNumbers += number;
			}
			else 
			{
				break;
			}
		}
		
		input.close();
		
		System.out.println("Total negative numbers: " + negativeNumbersCount);
		System.out.println("Total positive numbers: " + positiveNumbersCount);
		System.out.println("Sum of all numbers: " + sumOfAllNumbers);
		
		if (negativeNumbersCount + positiveNumbersCount == 0) 
		{
			negativeNumbersCount++;
		}
		
		System.out.printf("Average: %.2f" , ((double)sumOfAllNumbers/ (positiveNumbersCount+negativeNumbersCount)) );
	}

}

