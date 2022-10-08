package homeworkday08;

import java.util.Scanner;

public class TernaryOperator006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num = scan.nextInt();
		String result = num%2==0  ? (num%10==0 ? "Woow 10" : "Yazik 10") : (num%5==0 ? "Woow 5" : "Yazik 5");
		System.out.println(result);
scan.close();
	} 

}
