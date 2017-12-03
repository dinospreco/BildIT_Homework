package Zadaca10;
/*
 * Zadaca 10
 * 
 * Zadatak 1 - Program ispisuje sve Armstrongove brojeve izmedju 0 i 1000
 * 			   Armstrongov broj je broj ciji je zbir kubova svih cifri jedan samom broju.
 * 
 * @author Dino Spreco
 * @date 15.11.2017.
 */

public class Zadatak_1 {

	public static void main(String[] args) {
		
		for (int i = 0 ; i <= 10000 ; i++)
		{
			int suma = 0;
			int tmp = i;
			
			while(tmp>0)
			{
				suma += Math.pow(tmp%10, 3);
				tmp = tmp/10;
			}
			
			if (suma == i)
				System.out.println(i);
		}
	}

}
