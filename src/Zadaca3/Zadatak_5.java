package Zadaca3;
/*
 * Zadaca 3
 * 
 * Zadatak 5 - Napisati program koji pita korisnika da unese cijeli broj za danasnji dan u sedmici (0 za ponedjeljak, 1 za utorak) 
 * 			   i da unese broj dana nakon danasnjeg dana te mu ispise koji je to dan u buducnosti. 
 * 			   (Primjer: ako korisnik unese 1 kao danasnji dan a 3 kao dan u buducnosti program mu ispisuje da je danas 
 * 			   utorak a dan u buducnosti je petak.) 
 * 
 * @autor - Dino Spreco
 * @date 30. 10. 2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		int danasnjiDan;
		int brojDanaUBuducnosti;
		String dan;
		String danBuducnosti;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Danasnji dan: ");
		danasnjiDan = unos.nextInt();
		System.out.print("Broj dana u buducnosti: ");
		brojDanaUBuducnosti = unos.nextInt();
		
		unos.close();
		
		if (danasnjiDan == 0)
			dan = "Ponedjeljak";
		else if (danasnjiDan == 1)
			dan = "Utorak";
		else if (danasnjiDan == 2)
			dan = "Srijeda";
		else if (danasnjiDan == 3)
			dan = "Cetvrtak";
		else if (danasnjiDan == 4)
			dan = "Petak";
		else if (danasnjiDan == 5)
			dan = "Subota";
		else if (danasnjiDan == 6)
			dan = "Nedjelja";
		else
		{
			System.out.println("Pogresan unos!");
			return;
		}
		
		if ( (danasnjiDan+brojDanaUBuducnosti) % 7 == 0)
			danBuducnosti = "Ponedjeljak";
		else if ( (danasnjiDan+brojDanaUBuducnosti) % 7  == 1)
			danBuducnosti = "Utorak";
		else if ( (danasnjiDan+brojDanaUBuducnosti) % 7  == 2)
			danBuducnosti = "Srijeda";
		else if ( (danasnjiDan+brojDanaUBuducnosti) % 7  == 3)
			danBuducnosti = "Cetvrtak";
		else if ( (danasnjiDan+brojDanaUBuducnosti) % 7  == 4)
			danBuducnosti = "Petak";
		else if ( (danasnjiDan+brojDanaUBuducnosti) % 7  == 5)
			danBuducnosti = "Subota";
		else if ( (danasnjiDan+brojDanaUBuducnosti) % 7  == 6)
			danBuducnosti = "Nedjelja";
		else
		{
			System.out.println("Pogresan unos!");
			return;
		}
		
		System.out.println("Danasnji dan je " + dan + " a nakon " + brojDanaUBuducnosti + " dana ce biti " + danBuducnosti);

		
	}

}
