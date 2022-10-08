package homeworkday07;

import java.util.Scanner;

public class ArtikYilNestedIf {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int year = in.nextInt();
		
		if (year%100==0) {
			if(year%400==0) {
				System.out.println("Artik Yil");
			}else {
				System.out.println("Artik yil degildir");
			}
			}else if(year%100!=0 && year%4==0) {
				System.out.println("Artik yil");			
					
		}else {
			System.out.println("Artik yil degildir");
		}
in.close();
	}

}
