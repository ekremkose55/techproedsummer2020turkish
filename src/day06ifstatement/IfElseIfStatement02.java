package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		// kullanici sinav notunu girsin negatif girerse yanlis girsin tam sayi isteyin
		// 0 dan buyuk 50 den kucukse kaldiniz yaz 
		//50 den buyuk 80 den azsa gectiniz yaz 80 den buyuk 100 den kucukse tebrikler yaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sinav notunuzu tamsayi oalarak giriniz");
		double sinav = scan.nextDouble();
		
		if (sinav < 0) {
			System.out.println("Negatif deger giremezsiniz");
			
		}else if(sinav < 50) {
			System.out.println("Kaldiniz");
		}else if (sinav < 80) {
			System.out.println("Gectiniz");
			
		}else if (sinav <= 100) {
			System.out.println("Tebrikler");
		}else {
			System.out.println("Yuzden buyuk bir not giremezsiniz");
		}
			
scan.close();
	}

}
