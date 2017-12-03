package Zadaca19;
/*
 * Zadaca 19
 * 
 * Zadatak 4 - Piramida...
 * 
 * @author Dino Spreco
 * @date 29.11.2017.
 */

import java.util.*;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("*** Piramida V1 ***");
		System.out.print("Unesi broj redova: ");
		ispisiPiramidu(input.nextInt());
		
		System.out.println();
		System.out.println("*** Piramida V2 ***");
		System.out.print("Unesi pocetni i krajnji red: ");
		ispisiPiramiduSaOpsegom(input.nextInt(), input.nextInt());
		
		System.out.println();
		System.out.println("*** Piramida V3 ***");
		System.out.print("Unesi pocetni i krajnji broj: ");
		ispisiPiramiduSaOpsegomV2(input.nextInt(), input.nextInt());
		
		input.close();
		

	}
	
	public static void ispisiRed(int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.printf("%-4d" , i);
		}
		for (int i = n-1 ; i >= 1 ; i--)
		{
			System.out.printf("%-4d" , i);
		}
		
	}
	
	public static void ispisiRazmake(int n)
	{
		for (int i = 0 ; i < n ; i++)
		{
			System.out.printf("    ");
		}
	}
	
	public static void ispisiPiramidu(int n)
	{
		System.out.println();
		System.out.println("Piramida v1:");
		for (int i = 1 ; i <= n ; i++)
		{
			ispisiRazmake(n-i);
			ispisiRed(i);
			System.out.println();
		}
	}
	
	public static void ispisiPiramiduSaOpsegom(int pocetak, int kraj)
	{
		System.out.println();
		System.out.println("Piramida v2:");
		for (int i = pocetak ; i <= kraj ; i++)
		{
			ispisiRazmake(kraj-i);
			ispisiRed(i);
			System.out.println();
		}
	}
	
	public static void ispisiRedV2(int pocetak, int kraj)
	{
		for (int i = pocetak ; i <= kraj ; i++)
		{
			System.out.printf("%-4d" , i);
		}
		for (int i = kraj-1 ; i >= pocetak ; i--)
		{
			System.out.printf("%-4d" , i);
		}
		
	}
	
	public static void ispisiPiramiduSaOpsegomV2(int pocetak, int kraj)
	{
		System.out.println();
		System.out.println("Piramida v3:");
		for (int i = 0 ; i < kraj-pocetak + 1 ; i++)
		{
			ispisiRazmake(kraj-pocetak-i);
			ispisiRedV2(pocetak,pocetak+i);
			System.out.println();
		}
	}

}
