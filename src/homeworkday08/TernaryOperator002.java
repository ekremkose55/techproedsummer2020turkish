package homeworkday08;

import java.util.Scanner;

public class TernaryOperator002 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num1 = scan.nextInt();
		
		System.out.println("Lutfen bir sayi giriniz");
		int num2 = scan.nextInt();
		
//		if (num1==num2) {
//			System.out.println(num1 + num2);
//		}else {
//			System.out.println(num1 * num2);
//		}
      int result = num1==num2 ? (num1 + num2) : (num1 * num2);
      System.out.println(result);
      scan.close();
	}

}
