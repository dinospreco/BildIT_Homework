package Zadaca9;
/*
 * Zadaca 9 
 * 
 * Zadatak 3 - Dati su nam novcici od 1, 3 i 5 KM. Korisnik unese iznos koji treba isplatiti a program racuna i ispisuje 
 * 			   najmanji broj novcica koji nam je potreban da isplatimo iznos
 * 
 * @author Dino Spreco
 * @date 14.11.2017.
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		int amount;
		int numberOfCoins = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite iznos: ");
		amount = input.nextInt();
		input.close();
		
		
		numberOfCoins += amount/5;
		amount = amount%5;
		
		numberOfCoins += amount/3;
		amount = amount%3;
		
		numberOfCoins += amount;
				
		System.out.println("Broj potrebnih novcica: " + numberOfCoins);
		

	}

}
