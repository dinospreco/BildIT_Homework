package Zadaca4;
/*
 * Zadaca 4
 * 
 * Zadatak 4 - Program racuna minimalnu duzinu avionske piste ako nam je data brzina pri uzlijetanju i ubrzanje aviona
 * 			   koristeci se formulom duzina = v^2/(2*a)
 * 
 *  @author - Dino Spreco
 *  @date - 31. 10. 2017.
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		double speed, acceleration;
		double lenght;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite brzinu i ubrzanje: ");
		speed = input.nextDouble();
		acceleration = input.nextDouble();
		input.close();
		
		lenght = speed*speed / (2*acceleration);
		
		System.out.println("Minimalna duzina piste za ovaj avion iznosi: " + lenght + " m");

	}

}
