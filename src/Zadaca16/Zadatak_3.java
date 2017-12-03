package Zadaca16;
/*
 * Zadaca 16
 * 
 * Zadatak 3 - Program ucitava brojeve u rasponu od 1 do 100 te broji ponavljanje svakog broja. 0 za prekid unosa.
 *			   
 *@author Dino Spreco
 *@date 25.11.2017.
 */

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		int[] brojevi = new int[101];
		int tmp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi cijele pozitivne brojeve. (0 za prekid unosa):");
		
		while(true)
		{
			tmp = input.nextInt();
			if (tmp < 0 || tmp > 100)
			{
				System.out.println("Pogresan unos!");
				continue;
			}
			
			if (tmp == 0)
			{
				break;
			}
			brojevi[tmp]++;
		}
		
		input.close();
		
		for (int i = 1 ; i < 101 ; i++)
		{
			if (brojevi[i] == 1)
				System.out.println(i + " se pjavljuje " + brojevi[i] + " put");
			else if (brojevi[i] != 0)
				System.out.println(i + " se pjavljuje " + brojevi[i] + " puta");
		}

	}

}
