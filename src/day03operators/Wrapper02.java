package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		//kullanicidan ad soyad alalim ekrana yazdiralim
		// adres alalim ekrana yazdiralim yesilirmak mah 10 sok no 19
		// yasini alip ekrana yazdir
		// kullanidan turkiyede yasiyorum dogru yanlis diye sorup ekrana yazdir 
		// true veya false olarak
      
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen adinizi ve soyadinizi giriniz");
		String adiSoyadi = scan.nextLine();
		System.out.println(adiSoyadi);
		
		System.out.println("lutfen adresinizi giriniz");
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Turkiyede yasiyorum true/false");
		boolean blTr = scan.nextBoolean();
		System.out.println(blTr);
		
		scan.close();	
	}

}
