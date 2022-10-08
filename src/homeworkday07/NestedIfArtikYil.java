package homeworkday07;

import java.util.Scanner;

public class NestedIfArtikYil {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int year = scan.nextInt();
		
		if (year%100==0) {
			if (year%400==0) {
				System.out.println("Artik yil");
			}else {
				System.out.println("Artik yil degil");
			}
		}else if (year%100!=0) {
			if (year%4==0) {
				System.out.println("Artik yil");
			}else {
				System.out.println("Artik yil degil");
	}
	}
		
		
		scan.close();	
	}
}
