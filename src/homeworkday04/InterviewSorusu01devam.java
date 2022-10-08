package homeworkday04;

import java.util.Scanner;

public class InterviewSorusu01devam {

	public static void main(String[] args) {
		// iki tane variable nin degerlerini yer degistiriniz
				// sayi1 = 12 sayi2 =30 yani sayi1 = 30 sayi2 = 12 olacak buna swap denir
				
				Scanner scan = new Scanner(System.in);
				// 2. yol
				System.out.println("Yerlerini degistirmek icin iki sayi giriniz");
				
				double sayi1 = scan.nextDouble();//12
				double sayi2 = scan.nextDouble();//30
				
				sayi1 = sayi1  + sayi2;
				sayi2 = sayi1 - sayi2;
				sayi1 = sayi1 - sayi2;
											
				System.out.println("Yerlerini degistirdikten sonra");				
				System.out.println(sayi1);
				System.out.println(sayi2);
				
scan.close();
	}

}
