package homeworkday09;

import java.util.Scanner;

public class TernaryOdevSorusu01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int num = scan.nextInt();
		
		String result = (num>99 && num<1000) ? "Uc basamakli sayi" : 
			(num%2==0 ? "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek sayi");
		System.out.println(result);
scan.close();
	}

}
