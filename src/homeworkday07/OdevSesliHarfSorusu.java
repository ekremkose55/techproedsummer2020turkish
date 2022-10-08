package homeworkday07;

import java.util.Scanner;

public class OdevSesliHarfSorusu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		String harf = scan.next();
		
		if (harf == "a" || harf == "e" || harf == "i" || harf == "o" || harf == "u") {
			System.out.println(harf + " sesli harfdir");		
		
		}else   {
			
			System.out.println(harf + " sessiz harfdir");
			
		}

		
		scan.close();
	}

}
