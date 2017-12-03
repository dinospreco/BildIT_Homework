package Zadaca4;
/*
 * Zadaca 4
 * 
 * Zadatak 3 - Program pita korisnika da unese radius (r) i visinu (H) cilindra te racuna povrsinu i zapreminu.
 * 			   P = 2*r^2*Pi + H*2*r*Pi
 * 		       V = r^2*Pi*H
 * 
 *  @author - Dino Spreco
 *  @date - 31. 10. 2017.
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		double PI = 3.14159;
		
		double radius;
		double height;
		
		double area, volume;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite radius i visinu cilinda: ");
		radius = input.nextDouble();
		height = input.nextDouble();
		
		input.close();
		
		area = radius*radius*PI*2 + height*2*radius*PI;
		volume = radius*radius*PI*height;
		
		System.out.println("Area of cylinder is: " + area);
		System.out.println("Volume of cylinder is: " + volume);

	}

}
