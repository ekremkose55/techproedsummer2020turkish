package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// kullanici adi ve soyadini alip ekrana yazdiran bir program yaziniz
		// string kullaniniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		 
		String isim = scan.nextLine();//String'leri kullanicidan almak icin 
                                      //next() veya nexLine() kullaniriz ancakkk
		                     //next de sadece tek kelime nextLine de tum yazilzni alir
		
		System.out.println(isim);
		
		scan.close();
	}

}
