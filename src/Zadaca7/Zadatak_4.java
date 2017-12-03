package Zadaca7;
/*
 * Zadaca 7
 * 
 * Zadatak 4 - Napisati program koji trazi od korisnika da unese imena tri grada te ih ispise po abecednom redu.
 * 
 *@author - Dino Spreco
 *@date 4.11.2017.
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		String city1, city2, city3;
		String tmpstr = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Grad: ");
		city1 = input.nextLine();
		System.out.print("2. Grad: ");
		city2 = input.nextLine();
		System.out.print("3. Grad: ");
		city3 = input.nextLine();
		
		input.close();
		
		if (city1.compareTo(city2) > 0)
		{
			tmpstr = city2;
			city2 = city1;
			city1 = tmpstr;
		}
		
		if (city1.compareTo(city3) > 0)
		{
			tmpstr = city3;
			city3 = city1;
			city1 = tmpstr;
		}
		
		if (city2.compareTo(city3) > 0)
		{
			tmpstr = city3;
			city3 = city2;
			city2 = tmpstr;
		}
		
		System.out.println(city1 + ", " + city2 + ", " + city3);

	}

}
