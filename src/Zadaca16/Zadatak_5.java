package Zadaca16;
/*
 * Zadaca 16
 * 
 * Zadatak 5 - Program ucitava 10 brojava te ispisuje sve jedinstvene brojeve koji su unijeti kao i broj jedinstveni brojeva.
 *			   
 *@author Dino Spreco
 *@date 25.11.2017.
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		int[][] brojevi = new int[10][2];
		int jedinstvenihBrojeva = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi 10 brojeva:");
		
		for (int i = 0 ; i < 10 ; i++)
		{
			brojevi[i][0] = input.nextInt();
			brojevi[i][1] = 1;
			for (int j = 0 ; j < i ; j++)
			{
				if (brojevi[j][0] == brojevi[i][0])
				{
					brojevi[i][1] = 0;
					break;
				}
			}

		}
		
		input.close();
		
		for (int i = 0 ; i < 10 ; i++)
		{
			if (brojevi[i][1] > 0)
			{
				jedinstvenihBrojeva++;
			}
		}
		
		System.out.println("Broj jedinstvenih brojeva je " + jedinstvenihBrojeva);
		System.out.print("Jedinstveni brojevi su: ");
		
		for (int i = 0 ; i < 10 ; i++)
		{
			if (brojevi[i][1] > 0)
				System.out.print(brojevi[i][0] + " ");
		}

	}

}

