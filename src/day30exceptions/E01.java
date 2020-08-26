package day30exceptions;

public class E01 {
	
	/*
	 1)Kod yazarken kirmizi alt cizgi almadiginiz halde, kodu calistirdiktan sonra console'da 
	 mesaj alirsaniz buna "Run Time Exception" denir.
	 */
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 0 ;
		
		String s1 = "";
		String s2 = null;
		
		try {
		System.out.println(a/b);//ArithmeticException: / by zero ===> Run Time Exception
		}catch (ArithmeticException e) {
			System.out.println("Bir sayiyi sifira bolemezsiniz");
		}
		
		System.out.println(s1.length());//0
		System.out.println(s2.length());//NullPointerException
		
	}

}
