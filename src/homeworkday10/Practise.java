package homeworkday10;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		String name = scan.nextLine();
		System.out.println(name);
		int length = name.length();
		System.out.println("Adinizin son harfi " + name.charAt(length -1) + "' dir");		
		
		scan.close();
	}

}
