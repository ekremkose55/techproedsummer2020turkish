package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data tipinde bir variable olusturun
		// bu variable nin degerini carpma ve bolme kullanarak 
		// artirin ve azaltin
		
		int num1 = 12;
		num1 = num1 * 3;  // 1. uzun yol
		System.out.println(num1);
		
		num1*=3;   // 2. yol kisasi
		System.out.println(num1);
		
		num1 = num1 / 9;
		System.out.println(num1); // 1. yol uzun
		
		num1/=2;
		System.out.println(num1); // 2. yol kisa
		
		

	}

}
