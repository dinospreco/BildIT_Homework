package Zadaca4;
/*
 * Zadaca 4
 * 
 * Zadatak 5 - Program racuna iznos popusta za gotovinsko placanje robe
 * 			   i cijenu robe sa popustom.
 * 			   Korisnik treba da unese vrijednost robe u KM i popust u procentima.
 * 
 *  @author - Dino Spreco
 *  @date - 31. 10. 2017.
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {

		double price, discountRate;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite vrijednost robe u KM: ");
		price = input.nextDouble();
		System.out.print("Unesite popust na gotovinsko placanje u procentima: ");
		discountRate = input.nextDouble();
		
		input.close();
		
		System.out.println("Vrijednost popusta je: " + (price*(discountRate/100)) + " KM");
		System.out.println("Vrijednost robe sa popustom je: " + (price - (price*(discountRate/100))) + " KM");

	}

}
