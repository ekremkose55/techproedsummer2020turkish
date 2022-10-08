package homeworkday07;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Lutfen bir password giriniz");
		int num = in.nextInt();
		
		if (num>999 && num<10000) {
			if(num%2==0) {
				System.out.println("Password tamam");
		   }else if (num%2!=0) {
		        System.out.println("Tekrar deneyin");		
		   }
		}else {
				System.out.println("Tekrar yeni deneyin");
	}
		in.close();
	}
}
