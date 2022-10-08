package homeworkday09;

public class Switch001 {

	public static void main(String[] args) {
		// A harfini bulunca "Ilk harf", B harfini bulunca "Ikinci harf"
        // C harfini bulunca "Ucuncu harf", D harfini bulunca "Dorduncu harf"
        // yazdiran programi if else if() ve switch() kullanarak yaziniz.
        // digerleri icin "Bilmiyorum"
		
		char harf = 'E';
			
//		if (harf=='A') {
//			System.out.println("Ilk harf");
//		}else if(harf=='B'){
//			System.out.println("Ikinci harf");
//		}else if(harf=='C') {
//			System.out.println("Ucuncu harf");
//		}else if(harf=='D') {
//			System.out.println("Dorduncu harf");
//		}else {
//			System.out.println("Bilmiyorum");
//		}
		 switch (harf) {
		 case 'A':
			 System.out.println("ILK HARF");
			 break;
		 case 'B':
			 System.out.println("IKINCI HARF");
			 break;
		 case 'C':
			 System.out.println("UCUNCU HARF");
			 break;
		 case 'D':
			 System.out.println("DORDUNCU HARF");
			 break;
			 default:
			 System.out.println("BILMIYORUM");
			 
		 
		 }
	}

}
