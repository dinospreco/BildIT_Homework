package Zadaca5;
/*
 * Zadaca 5
 * 
 * Zadatak 2 - Program koji pita korisnika da unese daljinu u kilometrima koju zeli preci,
 * 			   potrosnju auta (koliko kilometara moze preci sa litrom goriva), 
 * 			   te cijenu litre goriva. Ispisati konacnu cijenu putovanja
 * 
 * @author Dino Spreco
 * @date 1. 11. 2017
 * 
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		double distance, fuelConspution, fuelPrice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite duzinu puta u kilometrima: ");
		distance = input.nextDouble();
		System.out.print("Unesite potrosnju auta (koliko kilometara moze preci sa litrom goriva: ");
		fuelConspution = input.nextDouble();
		System.out.print("Unesite cijenu litre goriva u KM: ");
		fuelPrice = input.nextDouble();
		input.close();
		
		System.out.println("Ukupna cijena putovanja iznosi: " + (distance*fuelPrice/fuelConspution) + " KM");
		
	
	}

}
