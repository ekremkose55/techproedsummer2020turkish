package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		// 
		byte by = 101;
		int sayi = by;// kucuk data tipini buyuk data type ye donusturme otomatiktir
		
		System.out.println(sayi);// 101
		
		int sayi2 = 53;
	  // byte by2 = (byte)sayi2; //buyuk data yi kucuge java yapmaz biz yapmaliyiz ornek!
		
		System.out.println(sayi2);// 53
		
		double sayi3 = 23.5;
		int by3 = (int)sayi3;
		System.out.println(by3); // 23
		
		float sayi4 = -23.9f;
		short by4 = (short)sayi4;
		System.out.println(by4);//-23
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc1 = sayi5 / sayi6;
		System.out.println(sonuc1);//3.428571428571429
		
		int sonuc2 = (int) (sayi5 / sayi6);
		System.out.println(sonuc2);//3
		
		int sayi7 = 5;
		int sayi8 = 3;
		
		int sonuc3 = sayi7 / sayi8;
		System.out.println(sonuc3);//1   normalde 5/3=1.666 ama int 1 alir 
		
		int sayi9 = 556;
		byte by5 = (byte) sayi9;//sayi9; ustune gidince zaten degistirebilme panosu aciliyor
        System.out.println(by5);
        
        
        
        
        
        
	}

}
