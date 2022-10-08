package ternarydersanlatimi;

public class IfStatement2 {

	public static void main(String[] args) {
		// bir tane string variable olusturun ve gun olarak bir deger atayin
	    // gun hafta ici bir gun ise "hafta ici"; hafta sonu ise "hafta sonu" yazdirin
		
		String day = "cumartesi";
		if(day=="pazartesi" || day=="sali"|| day == "carsamba"||day=="persembe" || day=="cuma") {
			System.out.println("hafta ici");
		}
		if(day=="cumartesi" ||day=="pazar") {
			System.out.println("hafta sonu");
		}
		
	}

}
