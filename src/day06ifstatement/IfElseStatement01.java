package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyin
		// password true ise ekrana "Password True" yazdirin
		// password false ise ekrana "Password false, try to again please" yazdirin
		// True password == Java2020
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your password please");
		
		String password = scan.next();	
		
		if (password.equals("Java2020")) { // Stringlerin degeri icin == yerine . koy ve equals sec
			System.out.println("Password True");			
		} else {
			System.out.println("Password false, try to again please");
		}
	scan.close();	
	
	}
}
