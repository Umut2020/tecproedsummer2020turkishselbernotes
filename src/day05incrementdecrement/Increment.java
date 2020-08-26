package day05incrementdecrement;

public class Increment {

	public static void main(String[] args) {
	
		//Increase = Artırmak (fiil)    Increment = Artırım(Artış) (isim)
		
		
		//Increment 1. Yol
		int s = 12;
		System.out.println(s);//12
		
		s = s + 3;
		System.out.println(s);//15
		
		s = s + 5;
		System.out.println(s);//20
		
		//Increment 2. Yol
		int t =22;
		
		t += 3;//Bu ifade t = t + 3 ile aynıdır 
	
		System.out.println(t);
				
		//Sadece 1 artıracaksanız aşağıdaki yöntemi kullanın
		int u = 32;
		System.out.println(u);//32
		
		u++;// Bu ifade u = u + 1 ;  veya u += 1;  ile aynıdır ama 1 artırmalarda hep bu kullanılır.
		System.out.println(u);
		
		
		//Çarpma ile increment
		
		int v = 42;
		v = v*2;
		System.out.println(v);
		v *= 3;
		System.out.println(v);
			}

}
