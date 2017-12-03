package Zadaca19;
/*
 * Zadaca 19
 * 
 * Zadatak 1 - Napisati metodu koja prima kao argument jedan karakter te odreduje da li je primljeni karakter samoglasnik, suglasnik ili nesto drugo.
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		char chr;
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite karakter: ");
		chr = input.nextLine().charAt(0);
		input.close();
		
		System.out.println(chr + " je " + daLiJeSuglasnik(chr));

	}
	
	public static String daLiJeSuglasnik (char chr)
	{
		char ch = Character.toLowerCase(chr);
		if (Character.isLetter(ch))
		{
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				return "samoglasnik";
			}
			else 
			{
				return "suglasnik";
			}
				
		}
		else if (Character.isDigit(ch))
		{
			return "cifra";
		}
		else
		{
			return "pogresan unos";
		}
	}

}
