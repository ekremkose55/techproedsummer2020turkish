package homeworkday02;

import java.util.Scanner;

public class Scanner03OrnekSoru {

	public static void main(String[] args) {
		// sayinin kupunu bul a3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen kupun bir kenarini giriniz");
		 int kupunAlani = scan.nextInt();
		 System.out.println(kupunAlani+kupunAlani+kupunAlani);// veya a3 a*3 yani
		
		 
		 scan.close();
	}

}
