package Zadaca16;
/*
 * Zadaca 16
 * 
 * Zadatak 2 - Napisati program koji od korisnika trazi da unese 10 cijelih brojeva te mu ispisuje u obrnutom redoslijedu
 *			   
 *@author Dino Spreco
 *@date 25.11.2017.
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		int[] brojevi = new int[10];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite 10 cijelih brojeva: ");
		for (int i = 0 ; i < 10 ; i++)
		{
			brojevi[i] = input.nextInt();
		}
		
		input.close();
		
		for (int i = 9 ; i >= 0 ; i--)
		{
			System.out.print(brojevi[i] + " ");
		}
		

	}

}
