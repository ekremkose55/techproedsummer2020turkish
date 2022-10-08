package javapractise02;

import java.util.Random;

public class Practise03 {

	public static void main(String[] args) {
		Random random = new Random();
        int randomSayi = random.nextInt(1000);
        
        System.out.println(randomSayi);
        
        int yuzler = randomSayi/100;
        int onlar = randomSayi/10%10;
        int birler = randomSayi%10;
        
        
        System.out.println(yuzler+onlar+birler);

	}

}
