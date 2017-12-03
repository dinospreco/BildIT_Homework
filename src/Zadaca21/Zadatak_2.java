package Zadaca21;
/*
 * Zadaca 21
 * 
 * Zadatak 2 - Napisati program koji pita korisnika da unese broj studenata, imena studenata kao i njihove ocjene 
 * 			   te ispisuje imena studenata na osnovu njihovih ocjena, od najvece ka najmanjoj. 
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_2 {

	public static void main(String[] args) {
		int brojStudenata;
		String[] imenaStudenata;
		int[] ocjene;
		
		int ocjenaTmp;
		String imeTmp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj studenata:");
		brojStudenata = input.nextInt();
		
		imenaStudenata = new String[brojStudenata];
		ocjene = new int[brojStudenata];
				
		System.out.println("Unesite imena studenata: ");
		for(int i = 0 ; i < brojStudenata ; i++)
		{
			System.out.printf("Ime i prezime  %d. studenta: ", (i+1));
			imenaStudenata[i] = input.next();
			imenaStudenata[i] += " ";
			imenaStudenata[i] += input.next();
			System.out.print(imenaStudenata[i] + " je ocjenjen sa: ");
			ocjene[i] = input.nextInt();
		}
		
		input.close();
		
		for (int i = 0 ; i < brojStudenata ; i++)
		{
			for (int j = i ; j < brojStudenata ; j++)
			{
				if (ocjene[i] < ocjene[j])
				{
					ocjenaTmp = ocjene[i];
					ocjene[i] = ocjene[j];
					ocjene[j] = ocjenaTmp;
					imeTmp = imenaStudenata[i];
					imenaStudenata[i] = imenaStudenata[j];
					imenaStudenata[j] = imeTmp;
				}
			}
		}
		
		for (int i = 0 ; i < brojStudenata ; i++)
		{
			System.out.println("Ime: " + imenaStudenata[i] + ";  Ocjena: " + ocjene[i]);
		}
 
	}

}
