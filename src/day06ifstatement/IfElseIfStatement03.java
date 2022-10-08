package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		// kullanicidan 6 basamakli bir sayi isteyin 0 ile de baslayabilir
		//kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir jackpot oyun prg yazin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("6 basamakli bir sayi giriniz (0 ile baslsysbilir)");
		int num = scan.nextInt();
		
		if (num<200000) {
			System.out.println("Kazandiniz");		
		}else if(num<500000){
			System.out.println("Amorti");			
		}else {
			System.out.println("Kaybettiniz");
		}
scan.close();
	}

}
