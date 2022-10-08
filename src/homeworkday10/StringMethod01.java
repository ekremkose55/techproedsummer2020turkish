package homeworkday10;



public class StringMethod01 {

	public static void main(String[] args) {
		String str1 = "Javva World";
		System.out.println(str1.indexOf('v'));
		System.out.println(str1.indexOf('J'));
		System.out.println(str1.indexOf('a',2));
		
		String str2 = "Alamanya";
		System.out.println(str2.indexOf('a', 3));
		int idx = str2.indexOf('a');
		System.out.println(str2.indexOf('a', idx + 1));
		
		
		String str3 = "Missisipi";
		System.out.println(str3.indexOf("si"));
		
		//lastIndex() methodu
		String str4 = "Sivrihisar";
		System.out.println(str4.lastIndexOf('r'));
		System.out.println(str4.lastIndexOf('s'));
		System.out.println(str4.indexOf("iv"));
		System.out.println(str4.lastIndexOf('i'));
		System.out.println(str4.lastIndexOf("is"));
		
		// charAt() method
		String str5 = "cimbombom";
		System.out.print(str5.charAt(0));
		System.out.print(str5.charAt(1));		
		System.out.println(str5.charAt(2));
		System.out.print(str5.charAt(3));
		System.out.print(str5.charAt(4));
		System.out.println(str5.charAt(5));
		System.out.print(str5.charAt(6));
		System.out.print(str5.charAt(7));
		System.out.println(str5.charAt(8));
		
		// length() methodu
		String str6 = "ekrem";
		System.out.println(str6.length());
		String str7 = "hatice kose";
		System.out.println(str7.length());
		
		
		
		
		
		
	}

}
