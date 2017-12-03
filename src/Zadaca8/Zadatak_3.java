package Zadaca8;
/*
 * Zadaca 8.
 * 
 * Zadatak 3 - Program ispisuje sve brojeve od 1 do 1000 koji su djeljivi sa 4 ali ne i sa 5
 * 
 * @author Dino Spreco
 * @date 13.11.2017.
 * 
 */

public class Zadatak_3 {

	public static void main(String[] args) {
		
		int ispis = 0;
		
		for (int i = 1; i<=1000; i++)
		{
			if (i%4 == 0 && i%5!=0)
			{
				if (ispis % 10 == 0 && ispis != 0)
				{
					System.out.println();
				}
				System.out.printf("%-4d" , i);
				ispis++;
			}
		}
	}
}
