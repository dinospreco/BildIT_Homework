package Zadaca5;
/*
 * Zadaca 5
 * 
 * Zadatak 3 - Program koji pita korisnika da unese duzinu ivice kocke i na racuna obim i provrsinu kocke.
 * 			   O = 12*a, P=6*a^2
 * 
 * @author Dino Spreco
 * @date 1. 11. 2017
 * 
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		double edgeLenght;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite duzinu ivice kocke u cm: ");
		edgeLenght = input.nextDouble();
		input.close();
		
		System.out.println("Obim kocke cija je ivica " + edgeLenght + " cm iznosi: " + (12*edgeLenght) + " cm");
		System.out.println("Povrsina kocke cija je ivica " + edgeLenght + " cm iznosi: " + (6*edgeLenght*edgeLenght) + " cm^2" );

	}

}
