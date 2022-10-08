package homeworkday07;

import java.util.Scanner;

public class ArtikYilSorusuInterview01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int year = scan.nextInt();
		
		if (year%100==0 && year%400==0) {
			System.out.println(year + " artik yildir");			
		}else if(year%100!=0 && year%4==0) {
			System.out.println(year + " artik yildir");
		}else {
			System.out.println(year + " artik yil degildir");
		}

		
scan.close();
	}

}
