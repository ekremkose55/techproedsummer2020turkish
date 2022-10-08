package day03operators;

public class day3Operators01 {

	public static void main(String[] args) {
       /*1 parantez ici islemler yapilir
        *2 carpma ve bolmeler yapilir. carpma ve bolmeden soldaki once yapilir
        *3 toplama ve cikarmalar yapilir ancak soldakiler once yapilir 
        * 
        */
		int i1 = 12;
		int i2 = 13;
		int i3 = 14;
		int i4 = 15;
		
		System.out.println(i1 + i2*i3);//194 once i2*i3 sonra +i1
		System.out.println(i1*i2 + i3*i4);//366 i1*i2 sonra i3*i4 ardindan iki sonucu topla
		System.out.println((i1+i2)/i4);//1 once topla sonra bol
		System.out.println(i4 * (i2 + i1 / 3));//255 once ictekini sonra dis

	}

}
