package homeworkday08;

import java.util.Scanner;

public class ArtikYilTernaryIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.println("Lutfen bir yil giriniz");
     int year = input.nextInt();
     
       String result = year%100==0 && year%400==0 ? "Artik yil" :
        	           year%100!=0 && year%4==0?"Artik yil":"Artik yil degil";
       
       System.out.println(result);
     
     
   input.close();  
     
	}

}
