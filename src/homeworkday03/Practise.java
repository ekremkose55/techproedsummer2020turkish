package homeworkday03;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		//
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
//		String name = scan.nextLine();
//		
//		System.out.println(name);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lutfen adinizi giriniz");
//		String firstName = scan.nextLine();
//		System.out.println("Lutfen soyisminizi girin");
//		String lastName = scan.nextLine();
//		
//		System.out.println(firstName);
//		System.out.println(lastName);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ad ve soyadinizi giriniz");
		String name = scan.nextLine();
		System.out.println("Lutfen adresinizi giriniz");
		String adresse = scan.nextLine();
		System.out.println("lutfen yasinizi giriniz");
		int age = scan.nextInt();
		System.out.println("Turkiye'de yasiyorum: true veya false");
		boolean place = scan.nextBoolean();
		
		System.out.println("Adi Soyadi: " + name);
		System.out.println("Adres: " + adresse);
		System.out.println("Yas: " + age);
		System.out.println("Turkiye'de mi yasiyorsun: " + place);
		
scan.close();	
		

	}

}
