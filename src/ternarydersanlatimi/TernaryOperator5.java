package ternarydersanlatimi;

import java.util.Scanner;

public class TernaryOperator5 {

	public static void main(String[] args) {
		// Kullanicidan bir yil girmesini isteyiniz
		// Girilen yil artik yil ise "Artik yildir" 
		// degilse "artik yil degildir" yazdirin
		
		// Artik yil; yil%100==0 ve yil%400==0
		//            yil%100!=0 ve yil%4==0 olmalidir
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Lutfen bir yil giriniz");
		 int yil = in.nextInt();
		 
		String sonuc = (yil%100==0 && yil%400==0) ?"Artik yil" : (yil%100!=0 && yil%4==0)?"Artik yil" : "Artik yil degildir" ;
		System.out.println(sonuc);
	}

}
