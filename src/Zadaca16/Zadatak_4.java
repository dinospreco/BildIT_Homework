package Zadaca16;
/*
 * Zadaca 16
 * 
 * Zadatak 4 - Program ucitava neodredjen broj nekih brojcanih rezultata te ispisuje koliko je bilo iznad ili jednako izracunatog prosjeka
 * 			   svih unesenih rezultata, te koliko uneseni rezultata je bilo ispod izracunatog prosjeka. Negativan broj prekida unos.
 * 			   Pretpostavimo da je maksimalan broj unesenih rezultata koje mozemo unijeti 100.
 *			   
 *@author Dino Spreco
 *@date 25.11.2017.
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		double[] rezultati = new double[100];
		double average;
		int brojRezultata = 0;
		int ispodProsjeka = 0;
		int iznadProsjeka = 0;
		double sumaRezultata = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi rezultate: (negativan broj za prekid unosa)");
		
		for (int i = 0 ; i < 100 ; i++)
		{
			rezultati[i] = input.nextInt();
			
			if (rezultati[i] < 0)
			{
				break;
			}
			
			brojRezultata++;
			sumaRezultata+=rezultati[i];
		}
		
		input.close();
		
		average = sumaRezultata/brojRezultata;
		
		for (int i = 0 ; i < 100 ; i++)
		{
			if (rezultati[i] < 0)
			{
				break;
			}
			else if (rezultati[i] >= average)
			{
				iznadProsjeka++;
			}
			else
			{
				ispodProsjeka++;
			}
		}
		
		System.out.println(iznadProsjeka + " rezultata je iznad ili jednako prosjeku " + average);
		System.out.println(ispodProsjeka + " rezultata je ispod prosjeka " + average);

	}

}
