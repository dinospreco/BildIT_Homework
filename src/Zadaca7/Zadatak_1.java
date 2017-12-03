package Zadaca7;
/*
 * Zadaca 7
 * 
 * Zadatak 1 - Napisati program koji pita korisnika da unese neki string te mu ispisuje duzinu tog stringa i prvo slovo
 * 
 *@author - Dino Spreco
 *@date 4.11.2017.
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		String sentence;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite recenicu: ");
		sentence = input.nextLine();
		input.close();
		
		System.out.println("Recenica \"" + sentence + "\" ima " + sentence.length() + " znakova i prvo slovo je: \'" + sentence.charAt(0) + "\'");

	}

}
