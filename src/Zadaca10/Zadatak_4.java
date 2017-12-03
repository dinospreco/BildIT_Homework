package Zadaca10;
/*
 * Zadaca 10
 * 
 * Zadatak 4 - Program pita korisnika da unese ASCII kod (cijeli broj on 0 do 127) i ispisuje karakter koji mu odgovara.
 * 
 * @author Dino Spreco
 * @date 15.11.2017.
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		int asciiCode;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite ASCII code (izmedju 0 i 127): ");
		asciiCode = input.nextInt();
		input.close();

		System.out.println("Karakter za ASCII code " + asciiCode + " je: " + (char)asciiCode);
		

	}

}
