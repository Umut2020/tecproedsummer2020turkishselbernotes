package day32interface;

public interface Klima {

	int i =15;
	
	
	void isitma();
	
	void antiBakteri();
	
	void fiyat();
	
	/*
	 1)interface icinde body'si olan bir method uretmek isterseniz 
	 	ya "default" veya "static" keyword'lerden birini kullanmaniz gerekir.
	   
	 2)"default" veya "static" keyword'lerinden birini kullanirsaniz mutlaka 
	 	method body"si kullanmaniz gerekir aksi takdirde Compile Time Error alirsiniz.
	 
	 3) "default" veya "static" keyword'lerden birini kullanarak olusturdugunuz
	    body'li methodlari child classlarin override etme zorunlulugu yoktur.         
	*/
	public default void sogutma () {
		System.out.println("Iyi sogutur");
	}
	
	public default void fresh () {
		System.out.println("Iyi sogutur");
	}
	
	
//	public default void  m1 (); ==> 2. not
//	public static void m2 (); ==> 2. not
	
	
	
	
	 
	
	
	
	
	
	
}
