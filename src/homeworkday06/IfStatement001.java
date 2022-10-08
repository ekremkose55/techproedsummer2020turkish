package homeworkday06;

public class IfStatement001 {

	public static void main(String[] args) {
		 // bir int variable olusturun ona bir deger atayin
        // eger atadiginiz deger pozitif ise ekrana pozitif yazdirin
        //eger atadiginiz deger negatif ise ekrana negatif yazdirin
		
		int num = 5;
		if (num>0) {
			System.out.println("Pozitif");
		}
		if (num == 0) {
			System.out.println("Notr");
	    }else {
		    System.out.println("Negatif");
		}
	}

}
