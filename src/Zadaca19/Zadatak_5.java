package Zadaca19;
/*
 * Zadaca 19
 * 
 * Zadatak 5 - Program provjera da li dva stringa imaju zajednicki prefiks.
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		String str1, str2, prefiks;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite prvi string: ");
		str1 = input.nextLine();
		System.out.print("Unesite drugi string: ");
		str2 = input.nextLine();
		input.close();
		
		prefiks = zajednickiPrefiks(str1, str2);
		
		if (prefiks == "")
		{
			System.out.println("Stringovi \"" + str1 + "\"" + " i " + "\"" + str2 + "\" nemaju zajednicki prefiks");
		}
		else 
		{
			System.out.println("Zajednicki prefiks za dva stringa je: \"" + prefiks + "\"");
		}
		

	}
	
	public static String zajednickiPrefiks(String str1 , String str2)
	{
		String prefiks = "";
		for (int i = 1 ; str1.substring(0, i).equals(str2.substring(0, i)) ; i++)
		{
			prefiks = str1.substring(0, i);
		}
		return prefiks;
	}

}
