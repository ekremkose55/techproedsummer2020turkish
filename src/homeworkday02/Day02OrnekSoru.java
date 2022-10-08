package homeworkday02;

import java.util.Scanner;

public class Day02OrnekSoru {

	public static void main(String[] args) {
		// kullanici karenin bir kenarini versin biz cevre ve alanini hesaplayalim
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenarini giriniz");
        // karenin cevresi a*4 alani a2
        int num1 = scan.nextInt();
        System.out.println(num1*4);
        System.out.println(num1*num1);
       scan.close(); 
	}

}
