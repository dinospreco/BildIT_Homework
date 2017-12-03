package Zadaca7;
/*
 * Zadaca 7
 * 
 * Zadatak 3 - Program trazi unos dva strina (s1 i s2) te provjerava da li je drugi string (s2) substring prvog stringa (s1)
 * 
 *@author - Dino Spreco
 *@date 4.11.2017.
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		String str1, str2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite prvi string: ");
		str1 = input.nextLine();
		System.out.print("Unesite drugi string: ");
		str2 = input.nextLine();
		
		input.close();
		
		if (str1.contains(str2))
		{
			System.out.println("String \"" + str2 + "\" je substring stringa \"" + str1);
		}
		else
		{
			System.out.println("String \"" + str2 + "\" nije substring stringa \"" + str1);
		}

	}

}
