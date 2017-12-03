package Zadaca8;
/*
 * Zadaca 8.
 * 
 * Zadatak 1 - Pretpostavimo da uplatimo $100 svaki mjesec na stedni racun koji ima godisnju kamatnu stopu od 5%.
 * 			   Mjesecna kamatna stopa je 0.05/12 = 0.00417. Nakon prvog mjeseca vrijednost na racunu postaje 100*(1+0.00417) = 100.417
 * 			   Nakon drugog mjeseca vrijednost na racunu postaje (100 + 100.417) * (1+0.00417) = 201.252 itd.
 * 			   Napisati program koji od korisnika trazi da unese mjesecni iznos stednje te broj mjeseci nakon kojeg bi zelio znati stanje
 * 			   racuna nakon tog broja mjeseci.
 * 
 * @author Dino Spreco
 * @date 13.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		double YEARLY_RATE = 5; // 5%
		double montlyRate = YEARLY_RATE/100/12;
		
		double mountlyPayment;
		double totalSavings = 0;
		int numberOfMonths;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert montly payment: ");
		mountlyPayment = input.nextDouble();
		System.out.print("Insert number of months: ");
		numberOfMonths = input.nextInt();
		
		input.close();
		
		for (int i = 0 ; i < numberOfMonths ; i++)
		{
			totalSavings = (totalSavings + mountlyPayment) * (1 + montlyRate);
		}
		
		System.out.printf("After %d months you will have $%.2f.",numberOfMonths,totalSavings);
		
	}

}
