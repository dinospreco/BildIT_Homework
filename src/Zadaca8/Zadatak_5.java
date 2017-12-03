package Zadaca8;
/*
 * Zadaca 8.
 * 
 * Zadatak 5 - Napisati program koji ispisuje sljedeca 4 patterna. BONUS: Pitati korisnika da unese broj redova.
 * 			   Pattert A      Pattern B       Pattern C      Pattern D
 * 			   1              1 2 3 4 5 6     1              1 2 3 4 5 6
 * 			   1 2            1 2 3 4 5       2 1              1 2 3 4 5
 *             1 2 3          1 2 3 4         3 2 1              1 2 3 4
 *             1 2 3 4        1 2 3           4 3 2 1              1 2 3
 *             1 2 3 4 5      1 2             5 4 3 2 1              1 2 
 *             1 2 3 4 5 6    1               6 5 4 3 2 1              1
 *             
 * @author Dino Spreco  
 * @date 13.11.2017.
 * 
 */

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numberOfRows;
		
		System.out.print("Insert number of rows: ");
		numberOfRows = input.nextInt();
		input.close();
		
		System.out.println("Pattern A: ");
		patternA(numberOfRows);
		System.out.println();
		
		System.out.println("Pattern B: ");
		patternB(numberOfRows);
		System.out.println();
		
		System.out.println("Pattern C: ");
		patternC(numberOfRows);
		System.out.println();
		
		System.out.println("Pattern D: ");
		patternD(numberOfRows);
		System.out.println();

	}
	
	public static void patternA(int nubmerOfRows)
	{
		for (int i = 1 ; i <= nubmerOfRows ; i++)
		{
			printRowWithinRange(1, i);
		}
	}
	
	public static void patternB(int numberOfRows)
	{
		for (int i = numberOfRows ; i >= 1 ; i--)
		{
			printRowWithinRange(1, i);
		}
	}
	
	public static void patternC(int numberOfRows)
	{
		for (int i = 1 ; i <= numberOfRows ; i++)
		{
			printRowWithinRange(i, 1);
		}
	}
	
	public static void patternD(int numberOfRows)
	{
		for (int i = numberOfRows ; i >= 1 ; i--)
		{
			printRowWithinRange(1, i);
			for (int j = i ; j <= numberOfRows ; j++)
			{
				System.out.print("   ");
			}
		}
	}
	
	public static void printRowWithinRange(int first, int last)
	{
		if (first < last) 
		{
			for (int i = first; i <= last; i++) {
				System.out.printf("%-3d" , i);
			} 
		}
		
		else if (first > last) 
		{
			for (int i = first; i >= last; i--) {
				System.out.printf("%-3d" , i);
			} 
		}
		
		else 
		{
			System.out.printf("%-3d" , first);
		}
		System.out.println();
	}

}
