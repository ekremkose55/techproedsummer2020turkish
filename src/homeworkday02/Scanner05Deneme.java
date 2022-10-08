package homeworkday02;

import java.util.Scanner;

public class Scanner05Deneme {

	public static void main(String[] args) {
		// dairenin alani ve cevresi float kullaniniz
		// alani pi*r2   pi 3.14159
		// cevre 2 * pr
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yaricapi giriniz");
		
		double yaricap = scan.nextDouble();
		double pi = 3.14159;
		
		System.out.println(pi * (yaricap * yaricap));
		System.out.println(2 * (pi * yaricap));
		
		scan.close();
	}

}
