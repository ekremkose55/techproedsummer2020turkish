package homeworkday08;

import java.util.Scanner;

public class TernaryOperator001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Put your password please");
		
		double num = scan.nextDouble();		
//		if (num>=0) {
//			System.out.println(num + " pozitif or notr");			
//		}else {
//			System.out.println(num + " negatif");
//		}
      
//		             condition ?    dogru yaz      :yanlis yaz ;  
		String sonuc =  num>=0 ? "pozitif or notr" : "negatif";     

		System.out.println(sonuc);
		
		scan.close();
	}

}
