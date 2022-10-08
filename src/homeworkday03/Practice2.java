package homeworkday03;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
//		byte by = 101;
//		int num = by;
//		System.out.println(num);
//		
//		int num1 = 123456;
//		double db = num1;
//		System.out.println(db);
//		
//		int num3 = 45;
//		byte by1 = (byte) num3;
//		System.out.println(by1);
//		
//		double num4 = 23.9;
//		int num5 = (int) num4;
//		System.out.println(num5);
//		
//		float num6 = -23.9f;
//		short num7 = (short)num6;
//		System.out.println(num7);
//		
//		double num8 = 4.8;
//		double num9 = 1.4;
//		
//		double result = num8 / num9;
//		System.out.println(result);
//		
//		int result2 = (int) (num8 / num9);
//		System.out.println(result2);
		
//		int num1 = 5;
//		int num2 = 3;
//		int result = num1/ num2;
//		System.out.println(result);
//		
//		
//		int num3 = 255;
//		byte by =  (byte) num3;
//		System.out.println(by);
		
//		int num1 = 12;
//		int num2 = 13;
//		int num3 = 14;
//		int num4 = 15;
//		
//		System.out.println(num1+num2*num3);
//		System.out.println(num1*num2+num3*num4);
//		System.out.println((num1+num2)/num4);
//		System.out.println(num4*(num2+num1/3));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
//		double num3 = num1;
//		num1 = num2;
//		num2 = num3;
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
			
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		
scan.close();

	}

}
