package homeworkday08;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int num = input.nextInt();
		
		String result = num>99 && num<1000 ?"3 basamakli":num%2==0?"3 Basamakli olmayan cift sayi":
			"3 Basamakli olmayan tek sayi";
		System.out.println(result);
input.close();
	}

}
