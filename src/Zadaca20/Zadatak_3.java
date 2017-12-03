package Zadaca20;
/*
 * Zadaca 20
 * 
 * Zadatak 3 - Napisati metodu koja vraca kao niz prvih 100 Fibonnaci brojeva
 *
 * EDIT: Umjesto BigInteger je bilo "double".
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

import java.math.BigInteger;

public class Zadatak_3 {

	public static void main(String[] args) {
		for (BigInteger e : fibonnaci())
		{
			System.out.println(e);
		}
	}
	
	public static BigInteger[] fibonnaci()
	{
		BigInteger[] fib = new BigInteger[100];
		
		fib[0] = BigInteger.valueOf(0);
		fib[1] = BigInteger.valueOf(1);
		
		for (int i = 2 ; i < 100 ; i++)
		{
			fib[i] = fib[i-1].add(fib[i-2]);
		}
		
		return fib;
	}

}
