package Zadaca3;
/*
 * Zadaca 3
 * 
 * Zadatak 2 - Program pita korisnika da unese broj minuta (npr 1 milijadru) te ispise koliko je to u godinama i danima.
 * 			   Pretpostaviti da godina ima 365 dana.
 * 
 * @autor - Dino Spreco
 * @date 30. 10. 2017.
 * 
 */

import java.util.Scanner; 

public class Zadatak_2 {
	
	public static void main(String[] args) {
		
		int brojMinuta;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj minuta: ");
		brojMinuta = input.nextInt();
		
		input.close();
		
		System.out.println(brojMinuta + " minuta je otprilike " + (brojMinuta / (365*24*60)) 
				+ " godina i " + ((brojMinuta % (365*24*60) ) / (24*60) ) + " dana");

	}

}
