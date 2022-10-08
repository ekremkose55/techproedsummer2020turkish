package homeworkday07;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
	    
		
		
		for (int i=word.length()-1; i>=word.charAt(0);i--) {
			System.out.println(i);		   	   
		}
		scan.close();
		}	
	}


