package Zadaca17;
/*
 * Zadaca 17
 * 
 * Zadatak 2 - Napisati dvije preopterecene (overloaded) metode koje vracaju prosjek svih brojeva u nekom nizu. Metode trebaju imati sljedece headere:
 * 			   
 * 			   public static int prosjekNiza(int[] niz)
 * 			   public static double prosjekNiza(double[] niz)
 * 			   
 * 			   Napisati program koji testira ove dvije metode. Duzina niza neka bude 10. Takoder, mozete pustiti korisnika da odredi dužinu niza
 * 
 * @author Dino Spreco
 * @date 25.11.2017.
 */

public class Zadatak_2 {

	public static void main(String[] args) {
		
		int[] nizInt = new int[10];
		double[] nizDouble = new double[10];
		
		System.out.println("Niz random cijelih brojva:");
		for (int i = 0 ; i < nizInt.length ; i++)
		{
			nizInt[i]= (int)(Math.random()*100);
			System.out.print(nizInt[i] + "  ");
		}
		
		System.out.printf("\nProsjek niza cijelih brojeva: %d\n\n", prosjekNiza(nizInt));
		
		System.out.println("Niz random realnih brojeva: ");
		for (int i = 0 ; i < nizDouble.length ; i++)
		{
			nizDouble[i] = (Math.random()*100);
			System.out.printf("%.2f  ", nizDouble[i]);
		}
		
		System.out.printf("\nProsjek niza realnih brojeva: %.2f",prosjekNiza(nizDouble));
		

	}
	
	public static int prosjekNiza(int[] niz)
	{
		double sum = 0;

		for (int i = 0 ; i < niz.length ; i++)
		{
			sum += niz[i];
		}
		
		return ((int)(sum/niz.length));
	}
	
	public static double prosjekNiza(double[] niz)
	{
		double sum = 0;

		for (int i = 0 ; i < niz.length ; i++)
		{
			sum += niz[i];
		}
		
		return (sum/niz.length);
	}

}
