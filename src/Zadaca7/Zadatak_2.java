package Zadaca7;
/*
 * Zadaca 7
 * 
 * Zadatak 2 - Napisati program koji pita korisnika da unese SSN (Social Security Number) u formatu DDD-DD-DDDD gdje D predstavlja broj.
 * 			   Program treba da provjeri da li je uneseni broj u ispravnom formatu. 
 * 			   Ukoliko nije, program pita da korisnik ponovo unese SSN, a ukoliko jeste program zavrsava sa radom.
 * 
 *@author - Dino Spreco
 *@date 4.11.2017.
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		Boolean foundLetter;
		String socialSecurityNumber;
		
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			foundLetter = false;
			
			System.out.print("Unesite SSN (DDD-DD-DDDD) :");
			socialSecurityNumber = input.nextLine();
			
			if (socialSecurityNumber.length() != 11)
			{
				System.out.println("Pogresan unos, pokusajte ponovo.");
				continue;
			}
			
			if (socialSecurityNumber.charAt(3) != '-' || socialSecurityNumber.charAt(6) != '-')
			{
				System.out.println("Pogresan unos, pokusajte ponovo.");
				continue;
			}
			
			for (int i = 0 ; i<socialSecurityNumber.length() ; i++)
			{
				if (socialSecurityNumber.charAt(i) == '-')
				{
					continue;
				}
				else if (Character.isLetter(socialSecurityNumber.charAt(i)))
				{
					foundLetter = true;
					break;
				}
			}
			
			if (foundLetter)
			{
				System.out.println("Pogresan unos, pokusajte ponovo.");
				continue;
			}
			else 
			{
				break;
			}
			
		}
		
		input.close();
		
	}

}
