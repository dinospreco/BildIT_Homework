package Zadaca11;
/*
 * Zadaca 11
 * 
 * Zadatak 1 - Napisati metodu sa sljedecim headerom koji ispisuje tri broja u rastucem redoslijedu: 
 * 			   ispisiSortiraneBrojeve(double broj1, double broj2, double broj3)
 * 			   Napisati program koji pita korisnika da unese tri broja te ispise ta tri broja u rastucem redoslijedu.
 * 
 * @author Dino Spreco
 * @date 16.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		double broj1, broj2, broj3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite tri broja: ");
		broj1 = input.nextDouble();
		broj2 = input.nextDouble();
		broj3 = input.nextDouble();
		input.close();
		
		System.out.println("Poredani po rastucem redoslijedu: ");
		ispisiSortiraneBrojeve(broj1, broj2, broj3);
		

	}
	
	public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3)
	{
		double tmp;
		if (broj1 > broj2)
		{
			tmp = broj1;
			broj1 = broj2;
			broj2 = tmp;
		}
		if (broj1 > broj3)
		{
			tmp = broj1;
			broj1 = broj3;
			broj3 = tmp;
		}
		if (broj2 > broj3)
		{
			tmp = broj2;
			broj2 = broj3;
			broj3 = tmp;
		}
		System.out.println(broj1 + " " + broj2 + " " + broj3);
	}

}
