package Zadaca9;
/*
 * Zadaca 9 
 * 
 * Zadatak 1 - Program izracunava procenta pojavljivanja velikih i malih slova u stringu
 * 
 * @author Dino Spreco
 * @date 14.11.2017.
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		String sentence;
		int lowerCaseLetters = 0;
		int upperCaseLetters = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite recenicu: ");
		sentence = input.nextLine();
		input.close();
		
		for (int i = 0; i < sentence.length(); i++) 
		{
			if (Character.isUpperCase(sentence.charAt(i)) && Character.isLetter(sentence.charAt(i)))
			{
				upperCaseLetters++;
			}
			if (Character.isLowerCase(sentence.charAt(i)) && Character.isLetter(sentence.charAt(i)))
			{
				lowerCaseLetters++;
			}
		}
		
		System.out.printf("Velikih slova: %2.2f%%\n" , (((double)upperCaseLetters/(upperCaseLetters+lowerCaseLetters))*100) );
		System.out.printf("Malih slova: %2.2f%%\n" , (((double)lowerCaseLetters/(upperCaseLetters+lowerCaseLetters))*100) );

	}

}
