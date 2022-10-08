package homeworkday08;

import java.util.Scanner;

public class Calisma02 {

	public static void main(String[] args) {
//		1. soru
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lutfen bir tamsayi giriniz");
//		int num = scan.nextInt();
//		String result = num%2==0 ? "Cift" : "Tek";
//		System.out.println(result);

		//      2. soru
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lutfen iki tam sayi giriniz");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int result = num1>num2 ? num1 : num2;
//		System.out.println(result);
		
//		3.soru
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lutfen bir tamsayi giriniz");
//		int num = scan.nextInt();
//		int result = num>=0 ? num*+1 : num*-1;
//		System.out.println(result);
		
//       4. soru
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lutfen seklin enini giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Lutfen seklin boyunu giriniz");
//		int num2 = scan.nextInt();
//		String result = num1==num2 ? "Bu bir karedir" : "Bu bir dikdortgendir";
//		System.out.println(result);
		
//		5. soru
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lutfen bir tam sayi giriniz");
//		int num = scan.nextInt();
		
//		String result = num>99 && num<1000 ? "3 Basamakli" : 
//			(num%2==0 ? "3 Basamakli olmayan cift " : "3 Basamakli olmayan tek ");
//		System.out.println(result + " bir sayidir");
		
//		6. soru
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int yil = scan.nextInt();
		
		String result = yil%100==0 ? (yil%400==0 ? "Artik yil" : "Artik yil degil"):
			(yil%4==0 ? "Artik yil" : "Artik yil degil");
		System.out.println(result);
		
		scan.close();	
		
	}

}
