package homeworkday08;

import java.util.Scanner;

public class TernaryOperator003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
      
		double result = num1>=num2 ? num2 : num1;
		System.out.println(result);
		
		
		scan.close();		
	}

}
