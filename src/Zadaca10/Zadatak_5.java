package Zadaca10;
/*
 * Zadaca 10
 * 
 * Zadatak 5 - Program ispisuje prvo slovo u stringu koje se ne ponavlja
 * 
 * @author Dino Spreco
 * @date 15.11.2017.
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		String sentence;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite recenicu: ");
		sentence = input.nextLine();
		input.close();
		
		for (int i = 0; i < sentence.length(); i++)
		{
			if (numberOfCharRepeats(sentence.charAt(i), sentence) == 1)
			{
				System.out.print(sentence.charAt(i));
				break;
			}
		}

	}
	
	public static int numberOfCharRepeats(char chr, String str)
	{
		int number = 0;
		for (int i = 0 ; i < str.length() ; i++)
		{
			if (chr == str.charAt(i))
			{
				number++;
			}
		}
		return number;
	}

}
