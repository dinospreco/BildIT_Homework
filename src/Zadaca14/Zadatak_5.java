package Zadaca14;
/*
 * Zadaca 14
 * 
 * Zadatak 5 - Napisati metode koje izracunavaju obim i povrsinu kvadrata. Metode trebaju imati sledece headere: 

			   public static double obim(double stranica) 
			   public static double povrsina(double stranica)

			   Napisati test program koji pita korisnika da unese duzinu stranice kvadrata i ispisuje mu obim i površinu tog kvadrata.

 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		double stranica;
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite duzinu stranice: ");
		stranica = input.nextDouble();
		input.close();
		
		System.out.printf("Obim kvadrata stranice %.2f je %.2f\n", stranica, obim(stranica));
		System.out.printf("Povrsina kvadrata stranice %.2f je %.2f\n", stranica, povrsina(stranica));

	}
	
	public static double obim(double stranica) 
	{
		return (stranica*4);
	}
	
	public static double povrsina(double stranica)
	{
		return (stranica*stranica);
	}

}
