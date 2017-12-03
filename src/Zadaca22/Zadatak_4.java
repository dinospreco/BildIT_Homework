package Zadaca22;
/*
 * Zadaca 22
 * 
 * Zadatak 4 - Napisati program koji nasumicno popunjava matricu 4x4 sa 0 i 1, ispisuje korisnuku tu matricu
 * 			   te pronalazi prvi red i kolonu sa najvise 1-ca.
 * 
 * @author Dino Spreco
 * @date 30.11.2017.
 */

public class Zadatak_4 {

	public static void main(String[] args) {
		int[][] matrica = nasumicnaMatrica();
		ispisiMatricu(matrica);
		
		System.out.println("Red sa najvise jedinica: " + prviRedSNajviseJedinicia(matrica));
		System.out.println("Kolona sa najvise jedinica: " + prvaKolonaSNajviseJedinicia(matrica));

	}
	
	public static int[][] nasumicnaMatrica()
	{
		int[][] matrica = new int[4][4];
		
		for (int i = 0 ; i < 4 ; i++)
		{
			for (int j = 0 ; j < 4 ; j++)
			{
				matrica[i][j] = (int)(Math.random()+0.5);
			}
		}
		
		return matrica;
	}
	
	public static void ispisiMatricu(int[][] matrica)
	{
		for (int i = 0 ; i < matrica.length ; i++)
		{
			for (int j = 0 ; j < matrica[0].length ; j++)
			{
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int prviRedSNajviseJedinicia(int[][] matrica)
	{
		int maxJedinica = 0;
		int jedinica;
		int redSaNjaviseJedinica = 0;
		for (int i = 0 ; i < matrica.length ; i++)
		{
			jedinica = 0;
			for (int j = 0 ; j < matrica[0].length ; j++)
			{
				if (matrica[i][j] == 1)
				{
					jedinica++;
				}
			}
			if (maxJedinica < jedinica)
			{
				maxJedinica = jedinica;
				redSaNjaviseJedinica = i;
			}
		}
		
		return redSaNjaviseJedinica;
		
	}
	
	public static int prvaKolonaSNajviseJedinicia(int[][] matrica)
	{
		int maxJedinica = 0;
		int jedinica;
		int redSaNjaviseJedinica = 0;
		for (int i = 0 ; i < matrica.length ; i++)
		{
			jedinica = 0;
			for (int j = 0 ; j < matrica[0].length ; j++)
			{
				if (matrica[j][i] == 1)
				{
					jedinica++;
				}
			}
			if (maxJedinica < jedinica)
			{
				maxJedinica = jedinica;
				redSaNjaviseJedinica = i;
			}
		}
		
		return redSaNjaviseJedinica;
		
	}

}
