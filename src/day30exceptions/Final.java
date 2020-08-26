package day30exceptions;

public class Final {

	/*
	 	final, finally ve finalize() arasindaki farklar nelerdir?
	 	
	 	==>final ve finally keyword'dur ama  finalize() method'dur
	 	
	 	final: final keyword'u variable'lardan,method'lardan, class'lardan once kullanilabilir.
	 			1)final variable: Bir variable final ise, o variable'a bir kere deger atamasi yaparsiniz ve bir daha 
	 				o degeri degistiremezsiniz.
	 			
	 			2)final method: Body'si son halde olan method'lardir. Yani body'si degistirilemeyecek olan method'lardir.
	 				final method'lar override edilemezler.
	 				
	 			3)final class: Child'i olamaz(Parent'i olabilir).Inheritance yapilamaz.
	 			
	 	finally: try-catch den sonra kullanilabilir.Try block exception uretse de uretmese de 
	 			finally block icindeki kod calisir. 
	 	
	 	finalize(): Java'da Garbage Collecter silmesi gereken data'lari once finalize eder sonra imha eder.
	 	
	 */
	
	final static  double pi =3.14;//The final field F01.pi cannot be assigned
	
	public static void main(String[] args) {
	
	}

}
