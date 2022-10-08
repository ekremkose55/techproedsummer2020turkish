package homeworkday02;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		// kullanicidan alinan bir sayinin kupu hesapla
		// cup a*a*a*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir Sayi Giriniz");
		
		int sayi1 = scan.nextInt();
		System.out.println();
		System.out.println(sayi1*sayi1*sayi1);
		
		scan.close();
	}

}
