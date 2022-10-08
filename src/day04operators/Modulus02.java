package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// kullanicin girdigi 4 basamakli sayisinin ilk ve son rakaminin toplamini veren 
        // bir code yazin
		// bir tam sayinin birler basamagini bulmak icin sayi 10 a bolunur
		// bir tam sayisi kac basamakli ise ona bolun ilk rakami alirsiniz 
		// 1234 / 1000 = 1 (bolum de kalan rakam)
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakli bir tam sayi giriniz");
		
		int s = scan.nextInt();
		int sonRakam = s % 10;
		int ilkRakam = s / 1000;
		
		System.out.println(sonRakam + ilkRakam);// 1+4=5
		
		scan.close();
	}

}
