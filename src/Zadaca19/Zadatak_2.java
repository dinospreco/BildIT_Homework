package Zadaca19;
/*
 * Zadaca 19
 * 
 * Zadatak 2 - Program pita korisnika da unese slovo, ispisuje odgovarajuci broj za unijeto slovo po medjunarodnom standardu za mapiranje slova na brojeve.
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_2 {

	public static void main(String[] args) {
		char chr;
		int broj;
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite karakter: ");
		chr = input.nextLine().charAt(0);
		input.close();
		broj = brojNaKojemJeSlovo(chr);
		
		if(broj == 0)
		{
			System.out.println(chr + " predstavlja pogresan unos");
		}
		else 
		{
			System.out.println("Odgovarajuci broj je " + broj);
		}

	}
	
	public static int brojNaKojemJeSlovo(char chr)
	{
		String[] letterMap = {"", "" , "abcABC" , "defDEF", "ghiGHI" , "jklJKL" , "mnoMNO" , "pqrsPQRS" , "tuvTUV" , "wxyzWXYZ"};
		for (int i = 2 ; i < 10 ; i++)
		{
			if (letterMap[i].contains(Character.toString(chr)))
			{
				return i;
			}
		}
		return 0;
	}

}
