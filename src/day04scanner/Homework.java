package day04scanner;

public class Homework {

	public static void main(String[] args) {
		
		double d1 = 100.235;
		int i1    = (int)d1;
		System.out.println(i1);
		
		int i2     = 5;
		double d2  = 6.2;
		System.out.println(i2+d2);
		
		short num1 = 255;
		byte num2  = (byte)num1;
		System.out.println(num2);// -1
		
		int no1    = 5/2;
		System.out.println(no1);//5
		
		float no2  = 5f/2f;
		System.out.println(no2);//2.5
		
		double no3 = 5d/2d;//2.5
		System.out.println(no3);
	
		float f3  = 3.23f;
		
		double d3 = (float)f3;
		System.out.println(f3);	
			
		/*   3) double 100.235 i int’e çevirip ekrana yazdiriniz.
		  	 4) int data type’ında oluşturulan 5 sayısı ile double data type’ında oluşturulan
			    6.2 sayısını toplayıp sonucu ekrana yazdırınız.
			    */
	}

}
