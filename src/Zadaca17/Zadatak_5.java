package Zadaca17;
/*
 * Zadaca 17
 * 
 * Zadatak 5 - Napisati metodu koja vraca nasumican broj u rasponu od 1 do 54 ne ukljucujuci brojeve koje proslijedimo metodi kao argumente.
 * 			   Metoda treba da ima sljedeci header: public static int vratiNasumicanBroj(int... brojevi)
 * 
 * @author Dino Spreco
 * @date 26.11.2017.
 */

public class Zadatak_5 {

	public static void main(String[] args) {
		
		System.out.println(vratiNasumicanBroj(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));

	}
	
	public static int vratiNasumicanBroj(int... brojevi)
	{
		int random;
		boolean nijeNaso;
		
		while(true)
		{
			nijeNaso = true;
			random = 1 + (int)(Math.random()*54);
			for (int i = 0 ; i < brojevi.length ; i ++)
			{
				if (random == brojevi[i])
				{
					nijeNaso = false;
				}
			}
			
			if (nijeNaso) return random;
		}
	}

}
