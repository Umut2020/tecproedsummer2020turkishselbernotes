package day04scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		
		//Küçük data tipinin büyük data tipine cast edilmesi
		// Auto Widening(Genişletme) Casting
		
			byte b1 = 13;
			int i1 = b1;
			
			System.out.println(b1);
			System.out.println(i1);
		
			short s1 = 2300;
			float f1 = s1;
			
			System.out.println(s1);//2300
			System.out.println(f1);//2300.0
			
			
		// Explicit (Açıkça) Narrowing(Daraltma) Casting
			
			short s2 = 120;
			byte b2 = (byte) s2;
			
			System.out.println(s2);
			System.out.println(b2);
			
			double d2 = 7637657;
			float f2  = (float)d2;
			System.out.println(d2);
			System.out.println(f2);
			
			//byte = -128.....127=toplamda 256 adet sayı var java diyor ki eğer 127'den büyük sayı olursa 255-256= -1 olur (aşağıdaki örnek için)
			// amaç= memory den tasarruf (eğer çıkan değerin önemi yoksa)
			
			short s3 = 255;
			byte b3  = (byte) s3;
			
			System.out.println(s3);//255
			System.out.println(b3);//-1
			
			//Aşağıdaki hata kaç farklı şekilde düzeltilebilir.
			
			//  float f3 = 2.34;
			
			// 1.) 2.34 den sonra f yazabiliriz. ==> float f3 = 2.34f;
			// 2.) 2.34 un önüne (float) yazarız ==> float f3 = (float)2.34;
			// 3.) Data tpye'ini double'a çevirin ==> double f3 = 2.34;
			
			
			
			
			
			
	}

}
