package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen dikdortgenin en ve boyunu giriniz");
		
        int en = scan.nextInt();
        int boy = scan.nextInt();
        
        System.out.println(en * boy);
        System.out.println(2*(en + boy));
     
        
        scan.close();    
	}

}
