package homeworkday07;

import java.util.Scanner;

public class NestedIf003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Password giriniz");
		int password = scan.nextInt();
		
		if (password<10000 && password>999){
			
			if (password%2==0) {
			System.out.println("Pasword tamam");			
		}else if (password%2!=0) {
			System.out.println("Tekrar deneyin");
		}
		}else {
			System.out.println("Tekrar deneyin");
		}
		scan.close();
	}
}
