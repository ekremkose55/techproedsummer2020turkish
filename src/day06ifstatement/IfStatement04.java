package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// bir tane string variable olusturun ve gun olarak bir deger atayin
		// gun hafta ici ise hafta ici hafta sonu ise hafta sonu yazdirin
		
		String day = "pazar";
		
    if (day.equals("pazartesi")||day.equals("sali")||day.equals("carsamba")||day.equals("persembe")||day.equals("cuma")) {
			
        System.out.println("hafta ici");
	}
    if (day.equals("cumartesi")||day.equals("pazar")) {
	    System.out.println("Hafta Sonu");
}
	}
}
