package Zadaca10;
/*
 * Zadaca 10
 * 
 * Zadatak 3 - Program ispisuje uneseni string naopako.
 * 
 * @author Dino Spreco
 * @date 15.11.2017.
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		String sentence;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		sentence = input.nextLine();
		input.close();
		
		for (int i = sentence.length()-1 ; i >= 0 ; i--)
		{
			System.out.print(sentence.charAt(i));
		}

	}

}
