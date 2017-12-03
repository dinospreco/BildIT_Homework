package Zadaca11;
/*
 * Zadaca 11
 * 
 * Zadatak 4 - Napisati metodu koja vraca broj ponavljanja odredjenog karaktera u stringu.
 * 			   Metoda ima sljedeci header: public static int brojacKaraktera(String s, char ch) 
 * 			    
 * 
 * @author Dino Spreco
 * @date 16.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		String sentence;
		char letterToCount;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		sentence = input.nextLine();
		System.out.print("Unesite karakter koji zelite brojati (case sensitive): ");
		letterToCount = input.next().charAt(0);
		input.close();
		
		System.out.println("U vasem stringu karakter \'" + letterToCount + "\' se ponavlja " + brojacKaraktera(sentence, letterToCount) + " puta:");

	}
	
	public static int brojacKaraktera(String s, char ch)
	{
		int counter = 0;
		for (int i = 0 ; i < s.length() ; i++)
		{
			if (s.charAt(i) == ch)
				counter++;
		}
		return counter;
	}

}
