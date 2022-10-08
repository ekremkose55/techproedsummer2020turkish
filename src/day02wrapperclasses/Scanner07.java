package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		// dairenin alani ve cevresini bulunuz float kullaniniz
		//pi sayisi 3.14159
		//alan: 3.14159 * radius*radius (yaricap)
		// cevre: 2*3.14159*radius
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yaricapi giriniz");
		
		double yaricap = scan.nextDouble();//data tipi int ise next int kullan
		 //data tipi double ise next double kullan vs
						
		System.out.println(3.14159 * yaricap * yaricap);
		System.out.println(2*(3.14159 * yaricap));
	
		scan.close();
	}

}
