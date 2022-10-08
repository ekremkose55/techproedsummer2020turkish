package homeworkday08;

import java.util.Scanner;

public class TernaryOperator004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int num = scan.nextInt();
		
		String result = num>=0 ? (num<10 ? "Rakam" : "Pozitif sayi") : "Negatif sayi";
		System.out.println(num + " " + result + "dir");	
		
scan.close();
	}

}
