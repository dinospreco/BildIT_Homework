package Zadaca16;
/*
 * Zadaca 16
 * 
 * Zadatak 1 - Napisati program koji ucitava broj osvojenih bodova svih studenata, pronalazi najveci ostvareni broj bodova te dodjeljuje ocjene 
 * 			   ostalim studentima na osnovu sljedecih kriterija:
 * 
 *			   Ocjena je A ako je ostvareni broj bodova >= najveci ostvareni broj bodova - 10
 *			   Ocjena je B ako je ostvareni broj bodova >= najveci ostvareni broj bodova - 20
 *   		   Ocjena je C ako je ostvareni broj bodova >= najveci ostvareni broj bodova - 30
 *			   Ocjena je D ako je ostvareni broj bodova >= najveci ostvareni broj bodova - 40
 *			   Ocjena F ako je ostvareni broj bodova manji od gore navedenih
 *
 *			   Program pita korisnika da unese ukupan broj studenata, zatim trazi od korisnika da unese njihove ocjene a 
 *			   onda prikazuje koju je ocjejenu dobio svaki student.
 *
 *			   Sample run:
 *
 *			   Unesite broj studenata: 4
 *			   Unesite 4 ocjene : 40 55 70 58
 *
 *			   Student 0 je dobio 40 bodova i dobio ocjenu C
 *			   Student 1 je dobio 55 bodova i dobio ocjenu B
 *			   Student 2 je dobio 70 bodova i dobio ocjenu A
 *			   Student 3 je dobio 58 bodova i dobio ocjenu B
 *			   
 *@author Dino Spreco
 *@date 25.11.2017.
 */

import java.util.Scanner;
public class Zadatak_1 {

	public static void main(String[] args) {
		
		int[] studentskiBodovi;
		int maxBrojBodova = 0;
		int brojStudenta;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj studenata: ");
		brojStudenta = input.nextInt();
		
	    System.out.print("Unesite " + brojStudenta + " ");
		
	    switch(brojStudenta)
		{
	    case 1: 
	    	System.out.print("ocjenu:");
	    	break;
	    case 2: 
	    	System.out.print("ocjene:");
	    	break;
	    case 3: 
	    	System.out.print("ocjene:");
	    	break;
	    case 4: 
	    	System.out.print("ocjene:");
	    	break;
	    default:
	    	System.out.print("ocjena:");
		}
	    
	    studentskiBodovi = new int[brojStudenta];
	    
	    for (int i = 0 ; i < brojStudenta ; i++)
	    {
	    	studentskiBodovi[i] = input.nextInt();
	    	
	    	if (studentskiBodovi[i] > maxBrojBodova)
	    	{
	    		maxBrojBodova = studentskiBodovi[i];
	    	}
	    }
	    
	    input.close();
	    
	    for (int i = 0 ; i < brojStudenta ; i++)
	    {
	    	System.out.print("Student " + (i+1) + " je dobio " + studentskiBodovi[i] + " bodova i dobio ocjenu ");
	    	if (studentskiBodovi[i] >= maxBrojBodova - 10)
	    	{
	    		System.out.print("A\n");
	    		continue;
	    	}
	    	if (studentskiBodovi[i] >= maxBrojBodova - 20)
	    	{
	    		System.out.print("B\n");
	    		continue;
	    	}
	    	if (studentskiBodovi[i] >= maxBrojBodova - 30)
	    	{
	    		System.out.print("C\n");
	    		continue;
	    	}
	    	if (studentskiBodovi[i] >= maxBrojBodova - 40)
	    	{
	    		System.out.print("D\n");
	    		continue;
	    	}
	    	if (studentskiBodovi[i] < maxBrojBodova - 40)
	    	{
	    		System.out.print("F\n");
	    		continue;
	    	}
	    }

	}

}
