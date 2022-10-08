package javapractise02;

import java.util.Scanner;

public class Practise04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		String ad = scan.nextLine();
		String soyad = scan.nextLine();
		
		System.out.println(ad);
		System.out.println(soyad);
		
		System.out.println("Lutfen dogum yilinizi ve simdiki yili giriniz");
		int dogum = scan.nextInt();
		int yil = scan.nextInt();
		
		System.out.println(dogum);
		System.out.println(yil);
		System.out.println("Adiniz, " + ad + ", Soyadiniz " + soyad + ", Yasiniz " + dogum );

		
		scan.close();
	}

}
