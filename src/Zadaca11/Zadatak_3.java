package Zadaca11;
/*
 * Zadaca 11
 * 
 * Zadatak 3 - Napisati metodu koja broji slova u stringu sa sljedecim headerom:  public static int probrojiSlova(String s)
 * 			   Napisati program koji pita korisnika da unese neki string te mu vrati broj slova.
 * 
 * @author Dino Spreco
 * @date 16.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		String sentence;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		sentence = input.nextLine();
		input.close();
		System.out.println("Broj slova u stringu je: " + prebrojiSlova(sentence));

	}
	
	public static int prebrojiSlova(String s)
	{
		int counter = 0;
		for (int i = 0 ; i < s.length() ; i++)
		{
			if(Character.isLetter(s.charAt(i)))
				counter++;
		}
		return counter;
	}

}
