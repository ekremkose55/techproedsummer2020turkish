package homeworkday03;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// kullanicidan ad soyad alin ekrana yazdirin string ile
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ad ve soyadinizi giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		
scan.close();
	}

}
