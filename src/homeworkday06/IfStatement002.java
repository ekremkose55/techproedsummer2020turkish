package homeworkday06;

public class IfStatement002 {

	public static void main(String[] args) {
		// Bir integer variable olusturun deger atayin
        // Deger cift sayi ise ekrana "cift" yazdirin 
        // Deger tek sayi ise ekrana "tek" yazdirin
		
		int num = -12;
		
		if (num % 2 == 0) {
			System.out.println("cift");
		} 
		if (num%2 != 0) {
			System.out.println("tek");
		}

	}

}
