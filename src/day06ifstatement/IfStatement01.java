package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
		// 
         if (3>2) {  // buradaki kosul dogru ise ilk bunu yazar 
        	           //yanlissa sadece 2. si yazilir
         
        	 System.out.println("if body calisti"); 	 
         }

         System.out.println("if body calismadi");
         
         // bir int variable olusturun ona bir deger atayin
         // eger atadiginiz deger pozitif ise ekrana pozitif yazdirin
         //eger atadiginiz deger negatif ise ekrana negatif yazdirin
         
         //0 isaretsiz bir sayidir
         
         int num = 123; //0 isaretsiz bir sayidir
         
         if(num>0) {
             System.out.println("Pozitif");
         }
         
         if(num<0) {
             System.out.println("Negatif");
         }
         
         if(num==0) {
             System.out.println("Notr");
             
         }
     }
 }

	

