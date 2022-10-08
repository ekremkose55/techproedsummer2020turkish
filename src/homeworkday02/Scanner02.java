package homeworkday02;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		//karenin bir kenar uzunlugunu giriniz
				// karenin cevresini ve alanini ekrana yazdiralim
				// karenin cevresi   a+a+a+a
				// karenin alani     a*a
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
		
		int kenarUzunlugu = scan.nextInt();
		
		System.out.println(kenarUzunlugu+kenarUzunlugu+kenarUzunlugu+kenarUzunlugu);//40
		System.out.println(kenarUzunlugu*kenarUzunlugu);//100
		
		
		scan.close();	
	}

}
