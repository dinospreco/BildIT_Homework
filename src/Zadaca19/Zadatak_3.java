package Zadaca19;
/*
 * Zadaca 19
 * 
 * Zadatak 3 - Cijeli pozitivni broj nazivamo savrsenim brojem ukoliko je jednak zbiru svih svojih pozitivnih djelilaca ne ukljucujuci samoga sebe. 
 * 			   Na primjer, 6 je prvi savrseni broj jer 6 = 3 + 2 + 1. Sljedeci savrceni broj je 28 = 14 + 7 + 4 + 2 + 1. 
 * 			   U rasponu od 0 do 10.000 postoje 4 savrsena broja. 
 * 			   Napisati program koji pronalazi ova 4 broja. BONUS: Napisati metodu koja rjesava ovaj problem.
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

public class Zadatak_3 {

	public static void main(String[] args) {
		for (int i = 1 ; i <= 10000 ; i++)
		{
			if (isSavrsenBroj(i))
			{
				System.out.println(i + " je savrsen broj");
			}
		}

	}
	
	public static boolean isSavrsenBroj (int n)
	{
		int sum = 0;
		for (int i = 1 ; i <= n/2 ; i++)
		{
			if (n%i == 0)
			{
				sum += i;
			}
		}
		
		if (sum == n)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
