package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
        System.out.println("lütfen karenin bir kenar uzunlugunu girin");
        
        int kenarUzunlugu= scan.nextInt();
        int cevre = kenarUzunlugu*4;
        int alan = kenarUzunlugu*kenarUzunlugu;
        
        System.out.println(kenarUzunlugu+kenarUzunlugu+kenarUzunlugu+kenarUzunlugu );
        System.out.println(kenarUzunlugu*kenarUzunlugu);
        
        System.out.println(cevre);      
        System.out.println(alan);
        
        

scan.close();
	}
}
       
       
