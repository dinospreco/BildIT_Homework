package Zadaca11;
/*
 * Zadaca 11
 * 
 * Zadatak 5 - Napisati metodu koja pretvara stope u metre - public static double stopeUMetre(double stope).
 * 			    
 * @author Dino Spreco
 * @date 16.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		double stope;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Stope u metre.");
		System.out.print("Unesite broj stopa: ");
		stope = input.nextDouble();
		input.close();
		System.out.println(stope + " stopa = " + stopeUMetre(stope) + " m.");

	}
	
	public static double stopeUMetre(double stope)
	{
		return stope*0.305;
	}

}
