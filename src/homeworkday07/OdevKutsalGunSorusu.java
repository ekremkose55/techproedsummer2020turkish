package homeworkday07;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Write a day name please!");
		String day = scan.nextLine();
		
		if (day.equalsIgnoreCase("Friday")) {
			System.out.println(day + "  is important for muslims");
		}else if(day.equalsIgnoreCase("Saturday")) {
			System.out.println(day + "  is important for yahudis");
		}else if(day.equalsIgnoreCase("Sunday")) {
			System.out.println(day + "  is important for christs");
		}else {
			System.out.println(day + "  is not important");
		}
		
		scan.close();	
	}

}
