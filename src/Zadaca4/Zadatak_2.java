package Zadaca4;
/*
 * Zadaca 4
 * 
 * Zadatak 2 - Program koji simnulira nasumicno izvlacenje karte iz spila od 52 karte.
 * 			   Program treba ispisati koja karta je izvucena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
 * 			   te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka)
 * 
 *  @author - Dino Spreco
 *  @date - 31. 10. 2017.
 */



public class Zadatak_2 {

	public static void main(String[] args) {
		
		int randomCardNumber;
		int randomCardSymbol;
		String cardNumber = "";
		String cardSymbol = "";
		
		randomCardNumber = (int)(Math.random() * 13) + 1;
		randomCardSymbol = (int)(Math.random() * 4) + 1;
		
		if (randomCardNumber == 1)
			cardNumber = cardNumber + "A";
		else if (randomCardNumber == 11)
			cardNumber = cardNumber + "J";
		else if (randomCardNumber == 12)
			cardNumber = cardNumber + "Q";
		else if (randomCardNumber == 13)
			cardNumber = cardNumber + "K";
		else 
			cardNumber = cardNumber + randomCardNumber;
		
		if (randomCardSymbol == 1)
			cardSymbol = cardSymbol + "Srca";
		else if (randomCardSymbol == 2) 
			cardSymbol = cardSymbol + "Pika";
		else if (randomCardSymbol == 3) 
			cardSymbol = cardSymbol + "Djeteline";
		else 
			cardSymbol = cardSymbol + "Kocke";
		
		System.out.println("Karta koju ste izvukli je " + cardNumber + " u znaku " + cardSymbol);

	}

}
