package homeworkday04;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
// kullanicidan 3 basamakli bir tamsayi alin, bu sayinin rakamlari toplamini bulun+
		//123 = 6
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		
		int num = scan.nextInt();
		int sonRakam = num % 10;
		int ilkRakam = num / 100;
		int ortaRakam1 = num / 10;
		int ortaRakam2 = ortaRakam1 % 10;
		System.out.println(ilkRakam + ortaRakam2 + sonRakam);
	
		scan.close();
	}

}
