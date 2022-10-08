package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		// Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve 
	    // cevresini hesaplayıp ekrana yazdıran bir program yazınız. 
	    // Not: Alan: Boy x En
	   //Not: Çevre: 2x (Boy + En)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen diktortgenin en ve boyunu giriniz");
		int sayiBoy = scan.nextInt();
		int sayiEn  = scan.nextInt();
		System.out.println(sayiBoy * sayiEn);
		System.out.println(2 * (sayiBoy + sayiEn));
		
	
	scan.close();
	}
}


