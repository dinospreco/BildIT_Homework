package Zadaca12;
/*
 * Zadaca 12
 * 
 * Zadatak 2 - Napisati metodu koja sabira sve cifre u cijelom broju - public static int saberiCifre(long n). 
 * 			    
 * @author Dino Spreco
 * @date 17.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		long number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		number = input.nextLong();
		input.close();
		
		System.out.println("Zbir cifara broja " + number + " je " + saberiCifre(number));
		
	}
	
	public static int saberiCifre(long n)
	{
		int sum = 0;
		
		while (n>0)
		{
			sum += n%10;
			n = n / 10;
		}
		
		return sum;
	}

}
