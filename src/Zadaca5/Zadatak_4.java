package Zadaca5;
/*
 * Zadaca 5
 * 
 * Zadatak 4 - Program izracunava energiju potrebnu za zagrijavanje vode od pocetne do zeljene temperature. 
 * 			   Program pita korisnika da unese vode u kilogramima, pocetnu i zeljenu temperaturu.
 * 			   Q = M * (zeljenaTemperatura - pocetnaTemperatura) * 4184
 * 			   Q - Energija u joulima
 * 			   M - Masa
 * 
 * @author Dino Spreco
 * @date 1. 11. 2017
 * 
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		double massOfWatter, initialTemperature, wantedTemperature;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite tezinu vode u kg: ");
		massOfWatter = input.nextDouble();
		System.out.print("Unesite pocetnu temperaturu: ");
		initialTemperature = input.nextDouble();
		System.out.println("Unesite zeljenu temperaturu: ");
		wantedTemperature = input.nextDouble();
		input.close();
		
		System.out.print("Energije potrebno za zagrijavanje vode: " + (massOfWatter*4184*(wantedTemperature-initialTemperature)) + " joula");

	}

}
