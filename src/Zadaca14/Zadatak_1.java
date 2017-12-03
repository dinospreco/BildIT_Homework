package Zadaca14;
 /*
 * Zadaca 14
 * 
 * Zadatak 1 - Napisati metodu sa sljedecim headerom: public static String format(int number, int width) koja vraca string broja sa prefiksom od jedne ili vise nula. 
 * 			   Velicina stringa je width argument. Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraca 0034, ukoliko pozovemo format(34, 5) metoda vraca 00034. 
 * 			   Ukoliko je uneseni broj veci nego width argument, metoda vraca samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraca 34.
 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

import java.util.Scanner;
 
public class Zadatak_1 {

	public static void main(String[] args) {
		
		int number, width;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		number = input.nextInt();
		System.out.print("Unesite velicinu stringa: ");
		width = input.nextInt();
		input.close();
		
		System.out.println(format(number, width));

	}
	
	public static String format(int number, int width)
	{
		String numberStr = Integer.toString(number);
		String formatedString = "";
		
		for (int i = 0; i < width - numberStr.length(); i++)
		{
			formatedString += '0';
		}
		
		return formatedString += numberStr;
		
		
	}

}
