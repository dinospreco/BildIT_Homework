package Zadaca23;
/*
 * Zadaca 23
 * 
 * Zadatak 4 - Napisati metodu koja prima kao argument 2D niz, te vraca lokaciju najveceg elementa u nizu kao 1D niz.
 * 			   Header: public static int[] najveciElement(double[][] niz)
 * 
 * 			   Napisati program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveceg elementa u proslijedjenom nizu.
 * 
 * @author Dino Spreco
 * @date 3.12.2017.
 */

import java.util.*;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj elemenata matrice (NxN): ");
		int brojElemenata = input.nextInt();
		double[][] elementi = new double[brojElemenata][brojElemenata];
		int[] najveciElement = new int[2];
		
		System.out.println("Unesite matricu (" + brojElemenata + " x " + brojElemenata + ")");
		for (int i = 0 ; i < brojElemenata ; i++)
		{
			for (int j = 0 ; j < brojElemenata ; j++)
			{
				elementi[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		
		najveciElement = najveciElement(elementi);
		
		System.out.println("Najveci element se nalazi na lokaciji (" + najveciElement[0] + "," + najveciElement[1] + ")");

	}
	
	public static int[] najveciElement(double[][] niz)
	{
		int[] najveciElement = new int[2];
		
		for (int i = 0 ; i < niz.length ; i++)
		{
			for (int j = 0 ; j < niz[i].length ; j++)
			{
				if (niz[najveciElement[0]][najveciElement[0]] < niz[i][j])
				{
					najveciElement[0] = i;
					najveciElement[1] = j;
				}
			}
		}
		return najveciElement;
	}

}
