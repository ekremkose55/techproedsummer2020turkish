package homeworkday03;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
	    //kullanicidan ad soyad alalim ekrana yazdiralim
		// adres alalim ekrana yazdiralim yesilirmak mah 10 sok no 19
		// yasini alip ekrana yazdir
		// kullanidan turkiyede yasiyorum dogru yanlis diye sorup ekrana yazdir 
		// true veya false olarak
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ad ve soyadinizi giriniz");
        String isim = scan.nextLine();
        System.out.println(isim);
        
        System.out.println("lutfen adresinizi giriniz");
        String adres = scan.nextLine();
        System.out.println(adres);
        
        System.out.println("lutfen yasinizi giriniz");
        String yas = scan.nextLine();
        System.out.println(yas);
        
        System.out.println("Turkiye de yasiyorum");
        boolean tr = scan.nextBoolean(); 
        System.out.println(tr);
      
        scan.close();      
	}

}
