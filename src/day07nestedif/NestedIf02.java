package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanicidan bir password girmesini isteyin
		// password 4 rakamli bir sayi ise cift olup olmadigini kontrol edin
		// cift sayi ise Pasword tamam yazdirin. Tek sayi ise Tekrar deneyin yazdirin
		// password 4 basamakli degil ise tekrar deneyin yazdirin
		// 4 basamakli sayi 999 buyuk 10000 den kucuk demektir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dort basamakli tamsayi giriniz");
		
		int password = scan.nextInt();
		if (password>999 && password<10000) {
			if (password%2==0) {
				System.out.println("Password Tamam");						
			}else if(password%2!=0) {
				System.out.println("Tekrar deneyin ilk");				
			}
			
		    }else {
				System.out.println("Tekrar deneyin son");
			}
	scan.close();					
		}
		
	}

