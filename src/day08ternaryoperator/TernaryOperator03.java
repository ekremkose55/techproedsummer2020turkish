package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// double sonuc = num1==num2 ? num1+num2 : num1*num2;
		// kullanicidan iki sayi alin kucugunu ekrana yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
        
		int sonuc = num1<=num2 ? num1 : num2;
		
		System.out.println(sonuc);
		
		scan.close();	
	}

}
