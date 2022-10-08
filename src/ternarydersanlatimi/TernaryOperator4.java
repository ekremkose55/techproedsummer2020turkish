package ternarydersanlatimi;

import java.util.Scanner;

public class TernaryOperator4 {

	public static void main(String[] args) {
		//Ternary Operator (If Else If}
		
		//Kullanicidan bir sayi aliniz
       //Sayi  0' dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		 
		Scanner in = new Scanner(System.in);
		 System.out.println("Lutfen bir sayi giriniz");
		 double num = in.nextDouble();
		 String sonuc = (num>=0)?(num<10)?"Rakam" : "Pozitif sayi" : "Negatif sayi";
		 System.out.println(sonuc);
	}

}
