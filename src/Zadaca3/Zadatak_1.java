package Zadaca3;
/*
 * Zadaca 3
 * 
 * Zadatak 1 - Porgram koji ucitava ukupan iznos racuna koji treba  uplatit kao i procenat tog racuna
 * 			   kojeg zelimo platiti kao napojnicu te izracunava ukupan racun i napojnicu
 * 
 * @autor - Dino Spreco
 * @date 30. 10. 2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		double iznosRacuna;
		double procenatNapojnice;
		double ukupanIznosRacuna;
		double iznosNapojnice;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite iznos racuna: ");
		iznosRacuna = unos.nextDouble();
		System.out.print("Unesite procenat racuna kojeg dajete kao napojnicu: ");
		procenatNapojnice = unos.nextDouble();
		
		unos.close();
		
		iznosNapojnice = (iznosRacuna/100)*procenatNapojnice;
		ukupanIznosRacuna = iznosRacuna + iznosNapojnice;
		
		System.out.println("Ukupan iznos za platiti: " + ukupanIznosRacuna + " KM");
		System.out.println("Napojnica:  " + iznosNapojnice + " KM");

	}

}
