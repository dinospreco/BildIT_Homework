package Zadaca14;
 /*
 * Zadaca 14
 * 
 * Zadatak 2 - Napisati metodu koja ima sledeci header: public static String ukloniKarakter(String str, char ch) 
 * 			   Metoda prima string i karakter i vraca novi string koji predstavlja originalni string sa izuzetkom proslijedjenog karaktera.  
 * 			   Napisati program koji pita korisnika da unese string i karakter, a zatim ispisuje string iz koga je obrisan uneseni karakter. 

			   Sample run

			   Unesi string:  stepenice Medicinske skole 
			   Unesi karakter:  s 

			   Rezultat: tepenice Medicinke kole
 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		String sentence;
		char karakter;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesi string: ");
		sentence = input.nextLine();
		System.out.print("Unesi karakter: ");
		karakter = input.nextLine().charAt(0);
		input.close();
		
		System.out.println("Rezultat: " + ukloniKarakter(sentence, karakter));
		

	}
	
	public static String ukloniKarakter(String str, char ch)
	{
		String formatedString = "";
		for (int i = 0 ; i <= str.length()-1 ; i++)
		{
			if (str.charAt(i)==ch)
			{
				continue;
			}
			else 
			{
				formatedString += str.charAt(i);
			}
		}
		
		return formatedString;
	}

}
