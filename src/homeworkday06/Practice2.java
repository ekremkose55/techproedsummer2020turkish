package homeworkday06;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		System.out.println("Bir gun giriniz");
		String day = in.nextLine().toUpperCase();
		
		if(day.equalsIgnoreCase("Cuma")) {
			System.out.println(day + " Muslumanlar icin kutsal gun");
		}else if(day.equalsIgnoreCase("Cumartesi")) {
			System.out.println(day + " Museviler icin kutsal gun");
		}else if (day.equalsIgnoreCase("Pazar")){
			System.out.println(day + " Iseviler icin kutsal gun");
		}else {
			System.out.println(day + " Kutsal gun degil");
		}
		
in.close();
	   
	}

}
