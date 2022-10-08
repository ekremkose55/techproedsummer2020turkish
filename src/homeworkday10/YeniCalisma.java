package homeworkday10;

import java.util.Scanner;

public class YeniCalisma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen adinizi giriniz");
		String name = scan.next();
		System.out.println("Adiniz " + name + "'dir");
		System.out.println(name.charAt(0) + " harfi ile baslar");			
		System.out.println(name.length() + " harflidir");				
		System.out.println("Bastan 3. harfi " + "'" + name.charAt(2) + "'" + "' dir");
		int length = name.length();
		System.out.println("Adinizin son harfi " + name.charAt(length-1) + "' dir");
		System.out.println("YAAA NABERRRR!");
	
scan.close();
	}

}
