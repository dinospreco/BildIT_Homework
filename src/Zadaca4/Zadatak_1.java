package Zadaca4;
/*
 * Zadaca 4
 * 
 * Zadatak 1 - ISBN-10 (International Standard Book Number) se sadrzi od 10 brojeva: 
 * 			   d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, sluzi kao checksum i 
 * 			   njega izracunavamo iz prvih devet brojeva koristeci se sljedecom formulom: 
 * 			   (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 * 
 * 			   Ukoliko je checksum 10, zadnji broj oznacavamo sa X u skladu sa ISBN-10 konvencijom. 
 * 			   Napisati program koji pita korisnika da unese prvih 9 brojeva te ispise desetocifreni ISBN-10 broj.
 * 
 *  @author - Dino Spreco
 *  @date - 31. 10. 2017.
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
				
		String isbn;
		
		int lastDigitISBN;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type first 9 numbers of ISBN-10:");
		isbn = input.nextLine();
		
		input.close();
		
		lastDigitISBN = (
				Character.getNumericValue( isbn.charAt(0)) * 1 +
				Character.getNumericValue( isbn.charAt(1)) * 2 +
				Character.getNumericValue( isbn.charAt(2)) * 3 +
				Character.getNumericValue( isbn.charAt(3)) * 4 +
				Character.getNumericValue( isbn.charAt(4)) * 5 +
				Character.getNumericValue( isbn.charAt(5)) * 6 +
				Character.getNumericValue( isbn.charAt(6)) * 7 +
				Character.getNumericValue( isbn.charAt(7)) * 8 +
				Character.getNumericValue( isbn.charAt(8)) * 9  ) % 11;
		
		if (lastDigitISBN == 10)    isbn = isbn + "X";
		else 						isbn = isbn + lastDigitISBN; 
		
		System.out.println(isbn);
		

	}

}
