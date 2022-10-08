package homeworkday09;

import java.util.Scanner;

public class Switch003 {

	public static void main(String[] args) {
		// Kullanici ay ismini girsin
        // Program kacinci ay oldugunu ekrana yazsin
        // Buyuk harf kucuk harf hepsi icin calissin
        // Yanlis ay ismi girerse ekrana "Gecerli ay ismi giriniz" yazsin
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay ismi giriniz");
		String ayAdi = scan.next();
		ayAdi = ayAdi.toLowerCase();
		
		
		switch (ayAdi) {
		case "ocak":
			System.out.println(ayAdi + " birinci aydir");
			break;
		case "subat":
			System.out.println(ayAdi + " ikinci aydir");
			break;
		case "mart":
			System.out.println(ayAdi + " ucuncu aydir");
			break;
		case "nisan":
			System.out.println(ayAdi + " dorduncu aydir");
			break;
		case "mayis":
			System.out.println(ayAdi + " besinci aydir");
			break;
		case "haziran":
			System.out.println(ayAdi + " altici aydir");
			break;
		case "temmuz":
			System.out.println(ayAdi + " yedinci aydir");
			break;
		case "agustos":
			System.out.println(ayAdi + " sekizinci aydir");
			break;
		case "eylul":
			System.out.println(ayAdi + " dokuzuncu aydir");
			break;
		case "ekim":
			System.out.println(ayAdi + " onuncu aydir");
			break;
		case "kasim":
			System.out.println(ayAdi + " onbirinci aydir");
			break;
		case "aralik":
			System.out.println(ayAdi + " onikinci aydir");
			break;
			default:
				System.out.println("Gecerli bir ay giriniz");
			
		}
		
		scan.close();
	}

}
