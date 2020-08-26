package day04scanner;

public class TypeCasting02 {

	public static void main(String[] args) {
		
		int i1 = 5/2; // decimal (ondalık) bir sayıyı byte, short,int, long gibi bir tamsayıya assign edersek
		//Java o virgüllü sayının ondalık kısmını iptal eder sadece tam kısmı yazar (yuvarlama yapmaz)
	
		System.out.println(i1);
		
		
		// Java int/int sonucunu tamsayı olarak return eder
		double d1 = 5/2;
		System.out.println(d1);//2.0
		
		//Matematiksel işlemlerde birden fazla data tip kullanılırsa Java sonucu en büyük data type 'e göre verir.
		
		double d2 = 5.0/2;
		System.out.println(d2);

	}

}
