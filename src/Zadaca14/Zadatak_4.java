package Zadaca14;
/*
 * Zadaca 14
 * 
 * Zadatak 4 - Napisati metodu koja prima jedan argument te simulira bacanje novcica toliko puta. 
 * 			   Nakon sto se simulacija zavrsi, program ispisuje koliko puta je novcic pokazao glavu a koliko puta pismo. 

 * 
 * @author Dino spreco
 * @date 19.11.2017. 
 */

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi broj bacanja: ");
		coinToss(input.nextInt());
		input.close();
		
	}
	
	public static void coinToss(int tossNumber)
	{
		int headsCounter = 0;
		int tailsCounter = 0;
		for (int i = 0; i < tossNumber ; i++)
		{
			if ((int)(Math.random()*10)+1 <= 5)
			{
				headsCounter++;
			}
			else
			{
				tailsCounter++;
			}
		}
		
		System.out.println("Glava: " + headsCounter);
		System.out.println("Pismo: " + tailsCounter);
	}

}
