package homework10;

import java.util.Scanner;

public class OdewSorususwitch {

	public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay adi giriniz");
        String ay = scan.nextLine();
        ay = ay.toLowerCase();
        
        switch (ay) {
        case "ocak":
        	System.out.println(ay + " 31 gundur");
        	break;
        case "subat":
        	System.out.println(ay + " 28 veya 29 gundur");
        	break;
        case "mart":
        	System.out.println(ay + " 31 gundur");
        	break;
        case "nisan":
        	System.out.println(ay + " 30 gundur");
        	break;
        case "mayis":
        	System.out.println(ay + " 31 gundur");
        	break;
        case "haziran":
        	System.out.println(ay + " 30 gundur");
        	break;
        case "temmuz":
        	System.out.println(ay + " 31 gundur");
        	break;
        case "agustos":
        	System.out.println(ay + " 30 gundur");
        	break;
        case "eylul":
        	System.out.println(ay + " 31 gundur");
        	break;
        case "ekim":
        	System.out.println(ay + " 30 gundur");
        	break;
        case "kasim":
        	System.out.println(ay + " 31 gundur");
        	break;
        case "aralik":
        	System.out.println(ay + " 31 gundur");
        	break;
        default:
        	System.out.println(ay + " gecersiz ay adidir");
        
        	scan.close();     	
        }
	}

}
