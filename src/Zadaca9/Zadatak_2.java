package Zadaca9;
/*
 * Zadaca 9 
 * 
 * Zadatak 2 - Program pronalazi i ispisuje najveci prosti palindrom manji od 1000
 * 
 * @author Dino Spreco
 * @date 14.11.2017.
 */

public class Zadatak_2 {

	public static void main(String[] args) {
		
		for (int i = 1000 ; i > 1 ; i--)
		{
			if (isPrime(i) && isPalindrome(i))
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isPrime(int number)
	{
		for(int i = 2 ; i <= number/2 ; i++)
		{
			if (number%i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPalindrome(int number)
	{
		String tmp = number + "";
		for (int i = 0 ; i < tmp.length()/2 ; i++)
		{
			if (tmp.charAt(i) != tmp.charAt(tmp.length()-i-1))
			{
				return false;
			}
		}
		
		return true;
	}

}
