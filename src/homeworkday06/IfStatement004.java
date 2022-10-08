package homeworkday06;

public class IfStatement004 {

	public static void main(String[] args) {
		// bir tane string variable olusturun ve gun olarak bir deger atayin
	    // gun hafta ici ise hafta ici hafta sonu ise hafta sonu yazdirin
		
		String day = "sunday";
		if (day.equals("sunday")  || day.equals("saturday") ) {
			System.out.println("weekend");							 			
		}
	    if (day != "sunday" && day != "saturday")	{
	    	System.out.println("week");		
	}

	}

}
