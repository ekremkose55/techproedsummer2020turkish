package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// kullanicidan alacagi urun miktarini ve fiyatini soralim
		// eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		//Eger kullanici 1000 veya daha az urun alirsa indirim yapmayin
		//ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// para konularinda double kullanin
		// ornek 60 tl ye %20 indirim 60*80/100
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen urun miktarini giriniz");		
		double urun = scan.nextDouble();		
        System.out.println("Lutfen fiyati giriniz");		
		double fiyat = scan.nextDouble();
		
		if (urun>1000) {
			System.out.println((fiyat*80/100) * urun);
			
		}else {
			System.out.println(fiyat*urun);
		}
			
scan.close();
	}

}
