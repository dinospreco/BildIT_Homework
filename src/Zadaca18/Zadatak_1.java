package Zadaca18;
/*
 * Zadaca 18
 * 
 * Zadatak 1 - Napisati metodu koja vraca sortiran string sa sljecim headerom
 * 			   
 * 			   public static String sortirajString(String s)
 * 
 * @author Dino Spreco
 * @date 26.11.2017.	
 */

import java.util.*;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite string za sortiranje: ");
		System.out.println("Sortiran string: " + sortirajString(input.nextLine()));
		input.close();

	}
	
	public static String sortirajString(String s)
	{
		char[] stringArray = s.toCharArray();	
		Arrays.sort(stringArray);		
		return new String(stringArray);
	}

}
