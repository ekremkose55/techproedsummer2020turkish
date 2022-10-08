package homeworkday05;

import java.util.Scanner;

public class Modulus05Odev {

	public static void main(String[] args) {
// kullanicidan 4 basamakli bir tamsayi alin, bu sayinin rakamlari toplamini bulun+
   
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayi giriniz");
        
        int num = scan.nextInt();
        int firstNum = num / 1000;
        int lastNum  = num % 10;
        int v1 = num / 100;
        int secondNum = num % v1;
        int v2 = num / 10;
        int thrdNum = num % v2;
        
        System.out.println(firstNum+secondNum+thrdNum+lastNum);
   
   
   
        scan.close();
	}

}
