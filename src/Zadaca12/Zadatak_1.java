package Zadaca12;
/*
 * Zadaca 12
 * 
 * Zadatak 1 - Napisati metodu koja printa 100 nasumicni uppercase karaktera i 100 nasumicni brojeva, 10 po liniji.
 * 			    
 * @author Dino Spreco
 * @date 17.11.2017.
 * 
 */

public class Zadatak_1 {

	public static void main(String[] args) {
		
		print100RandomCharactersAndNumbers();

	}
	
	public static int randomIntegerWithinRange(int min, int max)
	{
		return (min + (int)(Math.random()*(max-min + 1)));
	}
	
	public static char randomUppercaseCharacter()
	{
		return (char)randomIntegerWithinRange('A', 'Z');
	}
	
	public static void print100RandomCharactersAndNumbers()
	{
		for (int i = 0 ; i < 100 ; i++)
		{
			if (i%10 == 0 && i != 0) System.out.println();
			System.out.printf("%-4c " ,randomUppercaseCharacter());
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0 ; i < 100 ; i++)
		{
			if (i%10 == 0 && i != 0) System.out.println();
			System.out.printf("%-4d " , randomIntegerWithinRange(0,100));
		}
	}
}
