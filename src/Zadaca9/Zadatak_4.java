package Zadaca9;
/*
 * Zadaca 9 
 * 
 * Zadatak 4 - Korisnik unese string a progam mu ispise koliko je velikih slova u stringu
 * 
 * @author Dino Spreco
 * @date 14.11.2017.
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		String sentence;
		int upperCaseLetters = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		sentence = input.nextLine();
		input.close();
		
		for (int i = 0; i < sentence.length(); i++) 
		{
			if (Character.isUpperCase(sentence.charAt(i)))
			{
				upperCaseLetters++;
			}
		}
		
		if (upperCaseLetters==1)
			System.out.println("String ima " + upperCaseLetters + " veliko slova");
		else if (upperCaseLetters == 2)
			System.out.println("String ima " + upperCaseLetters + " velika slova");
		else 
			System.out.println("String ima " + upperCaseLetters + " velikih slova");

	}

}
