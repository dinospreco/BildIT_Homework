package Zadaca23;
/*
 * Zadaca 23
 * 
 * Zadatak 2 - Zamislimo skolu koja ima 100 ucenika i 100 ormarica. Prvog dana skole, svi ormarici su zatvoreni. 
 * 			   Ucenici krecu sa ulaskom u skolu. Prvi ucenik koji ulazi u skolu, U1, otvara svaki ormaric. 
 * 			   Drugi ucenik koji ulazi u skolu, U2, pocinje sa drugim ormaricem te zatvara redom svaki drugi ormaric. 
 * 			   Ucenik U3, ulazi u skolu i, pocevsi od treceg ormarica, mjenja stanje svakog treceg ormarica. 
 * 			   (zatvara ormaric ukoliko je otvoren, otvara ukoliko je isti zatvoren). 
 * 			   Ucenik U4 ulazi u skolu i, pocevsi od cetvrtog ormarica, mjenja stanje svakog cetvrtog ormarica. 
 * 			   Ucenik U5 ulazi u skolu i, pocevsi od petog ormarica, mjenja stanje svakog petog ormarica i tako dalje 
 * 			   sve dok ucenik U100 ne promijeni stanje zadnjeg ormarica. 
 * 
 * 			   Nakon cto su svi ucenici procli kroz skolu i promijenili stanja ormarica, 
 * 			   koji ormarici su ostali otvoreni? 
 * 
 * 			   Napisati program koji pronalazi odgovor na ovo pitanje te ispisuje na konzoli brojeve svih otvorenih ormarica
 * 
 * @author Dino Spreco
 * @date 3.12.2017.
 */

public class Zadatak_2 {

	public static void main(String[] args) {
		boolean[] ormarici = new boolean[101];
		
		for (int i = 1 ; i <= 100 ; i++)
		{
			for (int j = i ; j <= 100 ; j=j+i)
			{
				ormarici[j] = !ormarici[j];
			}
		}
		
		for (int i = 1 ; i <= 100 ; i++)
		{
			if (ormarici[i])
			{
				System.out.println("Ormaric br " + i);
			}
		}

	}

}
