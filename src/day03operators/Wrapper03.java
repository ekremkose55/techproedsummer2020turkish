package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		// kullanicidan ilk ismini alin ekrana yazdirin
		// soyismini alin ekrana ilk isminin altina yazdirin
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ilk adinizi yazin");
		String ilkAdi = scan.nextLine();
		
		System.out.println("Lutfen ilk soy adinizi yazin");
		String soyAdi = scan.nextLine();
		
		System.out.println(ilkAdi);
		System.out.println(soyAdi);
		
		
		scan.close();
	}

}
