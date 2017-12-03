package Zadaca13;
/*
 * Zadaca 13
 * 
 * Zadatak 1 - Napisati metodu sa sljedecim headerom: public static void ispisiSortiraneBrojeve(double num1, double num2 double num3),
 * 			   koja ispisuje 3 broja u rastucem redoslijedu. Napisati program koji pita korisnika da unese 3 broja i ispise mu ih u rastucem redoslijedu.
 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 3 broja");
		
		ispisiSortiraneBrojeve(input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		input.close();

	}
	
	public static void ispisiSortiraneBrojeve(double num1, double num2, double num3)
	{
		double tmp;
		if (num1 > num2)
		{
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if (num1 > num3)
		{
			tmp = num1;
			num1 = num3;
			num3 = tmp;
		}
		if (num2 > num3)
		{
			tmp = num2;
			num2 = num3;
			num3 = tmp;
		}
		
		System.out.println(num1 + ", " + num2 + ", " + num3);
	}

}
