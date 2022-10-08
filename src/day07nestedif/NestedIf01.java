package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// kull bir sayi al
		// pozitif ise 9 dan buyuk mu diye kontrol edin buyukse ekrana sayi yazdiz
		// pozitif ise 9 dan buyuk mu diye kontrol edin kucuk esit ise ekrana rakam yazdiz
		// bu sayi negatif ise ekrana sayi yazdir
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		int num = scan.nextInt();
		
		if (num>=0) {
			if (num>9) {
				System.out.println("Sayi");
			}else if (num<=9 && num>=0) {
				System.out.println("Rakam");				
			}			
		}else if (num<0) {
			System.out.println("Sayi");
			
		}
		
scan.close(); // Scanner class'ini kullandiktan sonra 
              // en altta main method un icinde Scanner class ini kapatiniz
              //Scanner class ini kapatmak icin scan.close(); yazmak yeterlidir. 
	}

}
