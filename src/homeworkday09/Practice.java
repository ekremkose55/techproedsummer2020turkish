package homeworkday09;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");
		int not = input.nextInt();
		
		if (not>=0 && not<50) {
			not = 0;
		}else if(not>=50 && not<60) {
			not = 50;			
		}else if (not>=60 && not<80) {
			not=60;
		}else if (not>=80 && not<=100) {
			not=80;
		}
		
		switch (not) {
		      case 0 :
		    	  System.out.println("D");
		      break;
		      case 50 :
		    	  System.out.println("C");
		      break;
		      case 60 :
		    	  System.out.println("B");
		      break;
		      case 80 :
		    	  System.out.println("A");
		      break;		      
		      default:
		    	  System.out.println("Gecerli bir not giriniz");	
		}
		
	
		
input.close();
	}

}
