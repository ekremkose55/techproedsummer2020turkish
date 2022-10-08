package ternarydersanlatimi;

import java.util.Scanner;

public class TernaryOperator2 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin en ve boyunu alin
	     // esitse ekrana "bu bir karedir" yazdirin
	     // degilse "bu bir dikdortgendir" yazdirin
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Lutfen seklin en degerini tamsayi giriniz");
		 int num1 = in.nextInt();
		 System.out.println("Lutfen seklin boy degerini tamsayi giriniz");
		 int num2 = in.nextInt();
		 
		 String sonuc = (num1==num2)? "Bu bir karedir" : "bu bir dikdortgendir"  ;
		 System.out.println(sonuc);
		

	}

}
