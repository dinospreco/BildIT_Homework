package Zadaca9;
/*
 * Zadaca 9 
 * 
 * Zadatak 5 - Napisati program koji provjerava da li je unijeti string validan kao password.
 * 			   Password je validan ako:
 *				1. Ima vise ili jednako od 8 karaktera
 *				2. Sadrzi samo slova i brojeve
 *				3. Sadrzi najmanje dva broja
 * 
 * @author Dino Spreco
 * @date 14.11.2017.
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		String password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite password: ");
		password = input.nextLine();
		input.close();
		
		//Linija ispod je samo ako gledamo obe varijante
		//System.out.println("*Varijanta da se sastoji samo od slova i brojeva:");
		if (passwordCheck(password))
		{
			System.out.println("Password je validan");
		}
		else System.out.println("Password nije validan");
		
		
		
		//Kod za varijantu da se password sastoji i od slova i od brojeva
		/*
		System.out.println("\n\n*Varijanta da se sastoji i od slova i od brojeva:");
		if (passwordCheck_v2(password))
		{
			System.out.println("Password je validan");
		}
		else System.out.println("Password nije validan");
		*/

	}
	
	public static boolean passwordCheck(String str)
	{
		int digitCount = 0;
		if (str.length()<8)
		{
			return false;
		}
		for (int i = 0 ; i<str.length() ; i++)
		{
			if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
			{
				return false;
			}
			
			if(Character.isDigit(str.charAt(i)))
			{
				digitCount++;
			}
		}
		if (digitCount<2)
		{
			return false;
		}
		
		return true;
	}
	
	// Za varijantu da se sastio i od slova i od brojeva
	/* 
	public static boolean passwordCheck_v2(String str)
	{
		int digitCount = 0;
		if (str.length()<8)
		{
			return false;
		}
		for (int i = 0 ; i<str.length() ; i++)
		{
			if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
			{
				return false;
			}
			
			if(Character.isDigit(str.charAt(i)))
			{
				digitCount++;
			}
		}
		if (digitCount<2 || digitCount == str.length())
		{
			return false;
		}
		
		return true;
	}
	
	*/
}
