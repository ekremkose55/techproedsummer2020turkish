package ternarydersanlatimi;

import java.util.Scanner;

public class TernaryOperator3 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi alin
		// Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
		// Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin
		 
		Scanner in = new Scanner(System.in);
		 System.out.println("Lutfen bir sayi giriniz");
		 double num1 = in.nextDouble();
		 System.out.println("Lutfen bir sayi daha giriniz");
		 double num2 = in.nextDouble();
		 
		 double sonuc = (num1==num2)  ? num1+num2 :num1*num2 ;
		 System.out.println(sonuc);
		
	}

}
