package homeworkday02;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	
		//kullanici iki tam sayi versin
		// program bu tam sayilarin toplamini ve carpimini ekrana yazdirsin
		Scanner scan = new Scanner(System.in);	// Scanner clasini import ettik	
		
		System.out.println("Lutfen iki tam sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi1*sayi2);
		
scan.close();	
		
	}	
}
   
