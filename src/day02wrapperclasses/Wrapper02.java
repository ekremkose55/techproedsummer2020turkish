package day02wrapperclasses;

public class Wrapper02 {

	public static void main(String[] args) {
		//int data type nin max ve min degerlerini bulup ekrana yazdirin
		// int in wrapper class i Integer
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);//2147483647
		 // bir class icindeki metodlara 
         // ulasmak icin isminden sonra nokta koy (.)listeden sec
		 //cikan (max value) yaz ve bunu syso icine al (yukaridaki gibi)
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		//long data type nin max ve min degerlerini bul
		System.out.println(Long.MAX_VALUE);//9223372036854775807
		System.out.println(Long.MIN_VALUE);//-9223372036854775808
	
		// ode: tum primitive degerlerin max ve min degerlerini yaziniz
		
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);//-128
		System.out.println(Float.MAX_VALUE);//3.4028235E38
		System.out.println(Float.MIN_VALUE);//1.4E-45
		System.out.println(Short.MAX_VALUE);//32767
		System.out.println(Short.MIN_VALUE);//-32768
		System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);//4.9E-324
		
		
		
		
		
	}

}
