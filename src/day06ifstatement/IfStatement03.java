package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		//bir char variable olusturun ve bir buyuk harf atayin 
		// Eger girdigi harf haftanin gunlerinden biriyse o gunler yazilsin
		//Eger girdigi harf haftanin gunlerinden biri degilse o gunler yazilsin
		// boyle bir gun yok yazilsin
		
		char harf = 'K';
		
		if (harf == 'P') { 
			System.out.println("Pazar, Pazartesi, Persembe");
		}
		
		if (harf == 'S') {
			System.out.println("Sali");
		}
		
		if (harf == 'C') {
			System.out.println("Carsamba, Cuma, Cumartesi");
		}
		
		if (harf != 'P' && harf !='C' && harf!='S') { 
			
			// java "VE" islami icin && sembolu kullanir
			// java "VEYA" islami icin || sembolu kullanir pipe denir
			
		    
			System.out.println("Boyle bir gun yok");
		}
	

	}

}
