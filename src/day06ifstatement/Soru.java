package day06ifstatement;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		// Kullanicidan dogum tarihini girmesini isteyin(4 haneli olarak)
		// bu yili yasa ceviren ve 
		// eger yasi 13 den kucukse "Child %50 discount"
		// 13 /17 arasi ise "Teenager %25 discount"
		// 17 /65 arasi ise "Adult not discount"
		// 65 ve uzeri  ise "Free" yazdiran eger  4 haneliden farkli ya da 
		// 2020 uzerinde bir tarih girerse "Tekrar deneyiniz"yazdiran bir program yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dogum tarihinizi yil olarak 4 haneli giriniz");
		int year = scan.nextInt();
		int yas = 2020 - year;
		
		if (yas<13 && yas>-1)  {
			System.out.println("Child %50 discount");
		}else if(yas<=17) {
			System.out.println("Teenager %25 discount");
		}else if(yas<64) {
			System.out.println("Adult not discount");
		}else if (yas>=65 && yas<1021) {
			System.out.println("Free");
		}else {
			System.out.println("Tekrar deneyiniz");
		}
	scan.close();	

	}

}
 