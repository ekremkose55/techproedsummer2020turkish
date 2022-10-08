package homeworkday04;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		// iki tane variable nin degerlerini yer degistiriniz
		// sayi1 = 12 sayi2 =30 yani sayi1 = 30 sayi2 = 12 olacak buna swap denir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yerlerini degistirmek icin iki sayi giriniz");
		
		double sayi1 = scan.nextDouble();//12
		double sayi2 = scan.nextDouble();//30
		 
		// 1. yol
		System.out.println("yer degistirmeden once");
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		System.out.println("yer degistirmeden sonra");
		double gecici = 0.0;
		gecici = sayi1;
		sayi1  = sayi2;
		sayi2  = gecici;
		
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		// 2. yol
		
		
		
		scan.close();
	}

}
