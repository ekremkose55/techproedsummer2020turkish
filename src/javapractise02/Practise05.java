package javapractise02;

import java.util.Scanner;

public class Practise05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen saat giriniz");
		int saat = scan.nextInt();
		System.out.println(saat);
		
		System.out.println("Lutfen dakika giriniz");
		int dakika = scan.nextInt();
		System.out.println(dakika);
		
		System.out.println("Lutfen saniye giriniz");
		int saniye = scan.nextInt();
		System.out.println(saniye);
		
		
		System.out.print("Saatiniz: " + saat + ":" + dakika + ":"+ saniye + " ");
		
		if (saat<12) {
			System.out.println("AM");
		}else if (saat>=12){
			System.out.println("PM");			
		}
	
	
scan.close();	     
	}

} 
