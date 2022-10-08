package homeworkday06;

import java.util.Scanner;

public class IfStatement005 {

	public static void main(String[] args) {
		       // kullanicidan dikdortgenin en ve boyunu alin
				// esitse ekrana bu bir karedir yazdirin
				// degilse bu bir dikdortgendir yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen en ve boy giriniz");
		
		double en = scan.nextDouble();
		double boy = scan.nextDouble();
		if (en==boy) {
			System.out.println("Bu bir karedir");			
		}
		if (en != boy) {
			System.out.println("Bu bir dikdortgendir");			
		}
		scan.close();
	}

}
