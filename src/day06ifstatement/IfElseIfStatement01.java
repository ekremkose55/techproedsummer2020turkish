package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		//kullanicidan yasini alin yas 13 den azsa ekrana calisamaz yazdir
		// yas 13 / 65 yas arasi ise calisabilir yaz
		// 65 den buyukse emekli yaz negatif girerse yas negatif olamaz yaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
		}else if (yas>13) {
			System.out.println("Calisamaz");
		}else if(yas <=65) {
			System.out.println("Calisabilir");
		}else {
			System.out.println("Emekli");
		}
			
scan.close();
	}

}
