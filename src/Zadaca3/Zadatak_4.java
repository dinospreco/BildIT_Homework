package Zadaca3;
/*
 * Zadaca 3
 * 
 * Zadatak 4 - Program ucitava iznos investicije, godisnju interesnu stopu i broj godina te
 * 			   vraca buducu vrijednost investicije koristeci se formulom:
 * 			   buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa) ^ brojGodina*12
 * 
 * @autor - Dino Spreco
 * @date 30. 10. 2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		double buducaVrijednostInvesticije;
		double iznosInvesticije;
		double godisnjaInteresnaStopa;
		int brojGodina;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite iznos investicije: ");
		iznosInvesticije = unos.nextDouble();
		
		System.out.print("Godisnja interesna stopa: ");
		godisnjaInteresnaStopa = unos.nextDouble();
		
		System.out.print("Broj godina: ");
		brojGodina = unos.nextInt();
		
		unos.close();
		
		buducaVrijednostInvesticije = iznosInvesticije * Math.pow( (1+ ((godisnjaInteresnaStopa/100)/12) ), brojGodina*12);
		
		System.out.println("Buduca vrijednost investicije iznosi: " + buducaVrijednostInvesticije);

	}

}
