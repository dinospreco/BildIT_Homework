package Zadaca12;
/*
 * Zadaca 12
 * 
 * Zadatak 4 - Napisati metodu koja vraca datum i trenutacno vrijeme.
 * 			    
 * @author Dino Spreco
 * @date 17.11.2017.
 * 
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		currentDateAndTime();
	}
	
	public static void currentDateAndTime()
	{
		/*
		 * Source code:
		 * https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
		 */
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy. - HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
	}

}
