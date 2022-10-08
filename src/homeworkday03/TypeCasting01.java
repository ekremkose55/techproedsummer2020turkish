package homeworkday03;

public class TypeCasting01 {

	public static void main(String[] args) {
		byte by = 55;
		int num1 = by;
		System.out.println(num1);
		
		int num2 = 26236164;
		long ln = num2;
		System.out.println(ln);
		
	  int say3 = 44;
	  byte by2 = (byte) say3;
	  System.out.println(by2);
	  
	  double num4 = 23.5;
	  int by3 = (int) num4;
	  System.out.println(by3);
	  
	  float sayi4 = -23.9f;
	  short by4 = (short) sayi4;
	  System.out.println(by4);
	  
	  double sayi5 = 4.8;
	  double sayi6 = 1.4;
	  
	  double sonuc = sayi5 / sayi6;
	  System.out.println(sonuc);
	  
	  int sonuc2 = (int) (sayi5 / sayi6);
	  System.out.println(sonuc2);
	  
	  int sayi7 =5;
	  int sayi8 = 3;
	  int sonuc3 = sayi7 / sayi8;
	  System.out.println(sonuc3);
	  
	  int sayi9 = 255;
	  byte by5 = (byte) sayi9;
	  System.out.println(by5);
		  
	  
				

	}

}
