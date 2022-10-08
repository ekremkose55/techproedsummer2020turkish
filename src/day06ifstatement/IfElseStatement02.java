package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// kullanicidan bir tam sayi isteyin ve o tam sayinin mutlak degerini ekrana yazdirin
		// mutlak deger bir sayinin kendi isareti ile carpilmasidir
		// ornek -3 un mutlak degeri : -3*-1 = 3
		// ornek +5 in mutlak degeri : +5 *+1 = 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num = scan.nextInt();
		if (num > 0 ) {
			System.out.println(num * +1);
			
		}else {
			System.out.println(num*-1);
		}
scan.close();
	}

}
