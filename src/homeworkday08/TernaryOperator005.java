package homeworkday08;

import java.util.Scanner;

public class TernaryOperator005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");
		char ch = scan.next().charAt(0);
		
		String result = ch<=122 && ch>=97 || (ch<=90 && ch>=65) ? 
				ch<=122 && ch>=97 ? "Kucuk harf" : "Buyuk harf" : "Harf degil";
				System.out.println(result);
scan.close();
	}

}
