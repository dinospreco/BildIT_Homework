package Zadaca3;
/*
 * Zadaca 3
 * 
 * Zadatak 3 - Pretpostavimo da uplatimo $100 svaki mjesec na stedni racun koji ima godisnju interesnu stopu od 5%. 
 * 			   Mjesecna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na racunu postaje 
 * 			   100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na racunu postaje 
 * 			   (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treceg mjeseca, vrijednost na racunu postaje 
 * 			   (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * 			   
 * 			   Napisati program koji pita korisnika da unese mjesecni iznos stednje te broj mjeseci nakon 
 * 			   kojeg bi zelio znati stanje racuna. 
 * 
 * @autor - Dino Spreco
 * @date 30. 10. 2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {

		double iznosMjesecneUplate;
		int brojMjeseciStednje;
		
		double GODISNJA_INTERESNA_STOPA = 0.05;
		double mjesecnaInteresnaStopa = GODISNJA_INTERESNA_STOPA/12;
		
		double konacnoStanje = 0;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite mjesecni iznos stednje: ");
		iznosMjesecneUplate = unos.nextDouble();
		System.out.print("Broj mjeseci stednje: ");
		brojMjeseciStednje = unos.nextInt();
		
		unos.close();
		
		for (int i = 0 ; i < brojMjeseciStednje ; i++)
		{
			konacnoStanje = (konacnoStanje + iznosMjesecneUplate)*(1+mjesecnaInteresnaStopa);
		}
			
		System.out.println("Ukupan iznos nakon " + brojMjeseciStednje + " mjeseci ce iznositi: " + konacnoStanje);
	}

}
