package javapractise02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Bir cumle giriniz");
		    String str = sc.nextLine();
		    int num = sc.nextInt();
		     
		    System.out.println(num+". pozisyondaki karakter " + ": " + str.charAt(num));
	sc.close();	    
	}
	
}
