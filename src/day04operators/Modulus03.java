package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		// kullanicidan 3 basamakli bir tamsayi alin, bu sayinin rakamlari toplamini bulun+
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("uc basamakli bir tamsayi giriniz");
		
		int s = scan.nextInt();
		
		int sonRakam = s % 10;
		
		int v = s / 10;   // orta rakam icin once 10 a bol sonra 
		                  // sonra cikan bolum yine 10 a bolunur 
		                  // bunun modulus'u orta rakamdir
		int ortaRakam = v % 10;
		
		int ilkRakam = s / 100; // ilk sayisi bulmak icin basamak sayisina bolunur
		                         // orn 123/100=1
		                         // orn 12345/10000=1
		
		System.out.println(ilkRakam + ortaRakam + sonRakam );
		
		
		scan.close();	
		
	}

}
