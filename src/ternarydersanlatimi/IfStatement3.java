package ternarydersanlatimi;

import java.util.Scanner;

public class IfStatement3 {

	public static void main(String[] args) {
		// Kullanicidan sifirdan buyuk bir tamsayi alin
        // Deger 0' dan buyuk ve cift sayi ise "pozitif cift sayi" 
        // Deger 0' dan buyuk ve tek sayi ise "pozitif tek sayi"	
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Lutfen sifirdan buyuk bir tamsayi giriniz");
		 int num = in.nextInt();
		 
		 if(num>0 && num%2==0) {
			 System.out.println("pozitif cift sayi");
		 }
		 if(num>0 && num%2!=0) {
			 System.out.println("pozitif tek sayi");
		 }
		
		
		
		
	}
}
