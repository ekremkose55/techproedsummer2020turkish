package day09switchoperator;

public class SinavCozumu {

	public static void main(String[] args) {
		int maas = 7000;
		switch(maas) {
		case 2000:
			System.out.println(":Asgari Ucret");
			break;
		case 4000:
			System.out.println("Ogretmen maas");
			break;
		case 7000:
			System.out.println("Tester maas");
			break;
			default:
				System.out.println("Yok boyle bir maas");				
		}
		String meslek = "tester";
		switch (meslek) {
		case "isci":
			System.out.println("2000");
			break;
		case "ogretmen":
			System.out.println("4000");
			break;
		case "tester":
			System.out.println("7000");
			break;
			default:
				System.out.println("bu meslegin maasi bilinmiyor");
				break;		
		
		}
		int gun = 2;				 
		
		switch(gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;		
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			default:
				System.out.println("Gecerli bir gun sayisi giriniz");				
		}
		int year = 505;
		if(year%100==0 && year%400==0) {
			System.out.println("Artik yil");			
		}else if(year%100!=0 && year%4==0) {
			System.out.println("Artik yil");
		}else {
		System.out.println("Artik yil degildir");
		}
		
		
	}

}
