package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin en ve boyunu alin
		// esitse ekrana bu bir karedir yazdirin
		// degilse bu bir dikdortgendir yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen en ve boy giriniz");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
//		if (num1 == num2) {
//			System.out.println("Bu bir karedir");
//		}
//		if (num1 != num2) {
//			System.out.println("Bu bir Dikdortgendir");									
//		}
		
		if (num1 == num2) {
			System.out.println("Bu bir karedir");
		}else {		// else kelimesi ilk ihtimalin disindaki tum ihtimalleri ifade eder
			System.out.println("Bu bir Dikdortgendir");									
		}
 scan.close();	
	}	
}
		
