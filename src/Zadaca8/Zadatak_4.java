package Zadaca8;
/*
 * Zadaca 8.
 * 
 * Zadatak 4 - Napisati program koji pita korisnika da unese cijeli broj, a zatim ispisuje taj cijeli broj naopako. 
 * 			   Program treba da radi za sve pozitivne cijele brojeve koji se mogu smjestiti u promjenljivu int tipa. 
 * 
 * @author Dino Spreco
 * @date 13.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int integerNumber;
		
		System.out.print("Insert one integer:");
		integerNumber = input.nextInt();
		
		input.close();
		
		if(integerNumber < 0)
		{
			System.out.print("-");
			integerNumber *= -1;
		}
		
		while (integerNumber > 0)
		{
			System.out.print(integerNumber%10);
			integerNumber /= 10;
		}

	}

}
