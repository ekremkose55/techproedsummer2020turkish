package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		// Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan 
		// bir program yazınız. (float kullanınız)
		// Not 1: pi sayısı: 3.14159
		// Not 2: Alan: 3.14159 x radius x radius
		// Not 3: Cevre: 2 x 3.14159 x radius 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen yaricapi giriniz");
		
		double yaricap = scan.nextDouble();
		//data tipi  neyse next de o kullanilir	
		
		double pi=3.14159;
				
		System.out.println(pi*yaricap*yaricap);
		
		System.out.println(2*pi*yaricap);
	
		scan.close();	}
}
		

