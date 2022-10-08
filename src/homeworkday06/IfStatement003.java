package homeworkday06;

public class IfStatement003 {

	public static void main(String[] args) {
		//bir char variable olusturun ve bir buyuk harf atayin 
				// Eger girdigi harf haftanin gunlerinden biriyse o gunler yazilsin
				//Eger girdigi harf haftanin gunlerinden biri degilse o gunler yazilsin
				// boyle bir gun yok yazilsin

		char day = 'K';		
		if (day=='P') {
			System.out.println("pazar pazartesi persembe");			
		}
		
		if (day == 'C') {
			System.out.println("cuma cumartesi carsamba");			
		}
		if (day == 'S') {
			System.out.println("sali");			
		}
		if (day != 'P' || day != 'C' || day != 'S' ) {
			System.out.println("boyle bir gun yok");			
		}		
	}
}
