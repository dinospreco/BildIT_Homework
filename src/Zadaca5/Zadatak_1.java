package Zadaca5;
/*
 * Zadaca 5
 * 
 * Zadatak 1 - Program koji pita korisnika da unese svoju masu (kg) i visinu (m) te mu ispise njegov BMI
 * 			   BMI = tezina/visina^2
 * 
 * @author Dino Spreco
 * @date 1. 11. 2017
 * 
 */

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		double height, weight;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite svoju tezinu u kg: ");
		weight = input.nextDouble();
		System.out.print("Unesite svoju visinu u m: ");
		height = input.nextDouble();
		input.close();
		
		System.out.println("Vas BMI iznosi: " + ( weight/(height*height) ));

	}

}
