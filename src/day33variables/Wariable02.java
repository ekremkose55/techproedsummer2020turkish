package day33variables;

public class Wariable02 {

	public static void main(String[] args) {
		
		char harf1 = 'a';// a nin degeri 97
		char harf2 = 'b';//b nin degeri  98
		
		System.out.println(harf1); // a ve b ayri ayri alt alta
		System.out.println(harf2); // syso ctrl space yap kisayol olsun
		
		System.out.println(harf1+harf2); // a ve b toplami
		System.out.println(harf1*harf2); // a ve b carpimi
		
		System.out.print(harf1); // ab yazdirmak istiyorsan bu sekilde
		System.out.println(harf2);
		
		// bir char in sayi degeri askii tablosu olmadan nasil bulunur
		// mesela a 97 ise
		
		int aCharDegeri = 'a';
		System.out.println(aCharDegeri);
		// data type int olan bir wariable olustur ve bu wariable ata
		
		// ! % *
		int degerUnlem = '!';
		int degerYuzde = '%';
		int degerCarpma = '*';
		
		System.out.println(degerUnlem);
		System.out.println(degerYuzde);
		System.out.println(degerCarpma);

	}
 
}
