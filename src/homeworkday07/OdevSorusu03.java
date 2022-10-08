package homeworkday07;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");		
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bir tamsayi daha giriniz");		
		int num2 = scan.nextInt();
		
		if ((num1>0 && num2>0) || (num1<0 && num2<0)) {
			System.out.println("Ayni isaretli");
		}else {
			System.out.println("Farkli isaretli");
		}
scan.close();
	}

}
