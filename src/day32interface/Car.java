package day32interface;

public interface Car {
	/*
	 1) Interface bir class degildir, interface interface'dir.
	
	 2) Abstract class'larin icine concrete method'lar koyabilirdik ama interface'lerin icine 
	 (bazi ozel durumlar haric ) concrete method koyamayiz. Yani; interface'ler sadece abstract method icerebilir.
	 Bu yuzden interface kullanimi "full abstraction" olarak adlandirilir.Abstract class kullanimina 
	 "partial abstraction" denir.
	 
	 3) Interface'ler iclerindeki method'lari default olarak abstract kabul ederler. Bu yuzden method olustururken
	 abstract keyword kullanmak istege baglidir.
	 
	 4) Interface'lerdeki method'larin access modifier'leri  default olarak "public" olurlar, 
	 protected, private ve default olamaz.
	 
	 5)interface'lerde variable'lar default olarak "final" olurlar.
	 
	 6)interface'lerde variable'larin access modifier'lari default olarak "public' olurlar.
	 
	 7)interface'lerde variable'lar default olarak "static" olurlar.
	 
	 8)interface'lerde variable olusturdugunuzda mutlaka deger atamasi(initialize) yapmalisiniz.
	 
	 9)interface'lerden obje uretilemez.
	 
	 */

	int i =12;// int i =12 == public static final  int i =12;
	
	public static final  int k =13;
	
	public void engine() ;
	
	public abstract void direksiyon ();
	
	//public void sur() {} ==> 	Abstract methods do not specify a body==> Interface'in icine
								//concrete method koyamazsiniz
	
	//teker () method'u hem public'dir hem de abstract'tir
	//void teker(); == public void teker();  == abstract void teker(); == public abstract void teker(); 
 	 void teker();
	
 	 void fiyat ();
}












