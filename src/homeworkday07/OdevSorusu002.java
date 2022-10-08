package homeworkday07;

import java.util.Scanner;

public class OdevSorusu002 {

	public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     System.out.println("Lutfen bir tamsayi giriniz");
     
     int num = scan.nextInt();
     if (num%3==0) {
    	 System.out.println("3 e bolunebilir");
     }else {
    	 System.out.println("3 e bolunemez");
     }
    
     scan.close();
	}

}
