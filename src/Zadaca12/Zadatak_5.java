package Zadaca12;
/*
 * Zadaca 12
 * 
 * Zadatak 5 - Napisati metodu koja pretvara milisekunde u sate minute i sekunde. (header: public static String pretvoriMilisekunde(long millis)
 * 			   Metoda treba da vraca vrijeme kao string u formatu sati:minuti:sekunde.
 * 			    
 * @author Dino Spreco
 * @date 17.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		long milisekunde;
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj milisekundi: ");
		milisekunde = input.nextLong();
		input.close();
		
		System.out.println(pretvoriMilisekunde(milisekunde));
	}
	
	public static String pretvoriMilisekunde(long millis)
	{
		// Ova formula radi al ja se nisam usudio ljepse je napisat hhh xD
		return (millis/60/60/1000 + ":" + (millis - millis/60/60/1000*60*60*1000)/1000/60 + ":" + (millis - millis/60/60/1000*60*60*1000 - (millis - (millis/60/60/1000)*60*60*1000)/1000/60*1000*60)/1000);
	}
}
