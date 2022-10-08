package homeworkday02;

import java.util.Scanner;

public class Scanner04Orneksoru {

	public static void main(String[] args) {
		//dikdortgenin alan ve cevresi
		// cevre a+b * 2     alani  a*b
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Dikdortgenin iki uzunlugunu giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(2 * (num1 + num2));
		System.out.println(num1 * num2);
	
		scan.close();	

	}

}
