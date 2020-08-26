package day29exceptions;

public class Homework {

	public static void main(String[] args) {
		
		String s = "";
		
		try {
			s += "t";
		}catch (Exception e){
			s += "c";
		}finally {
			s += "f";
		}
		
		s += "a";
		System.out.println(s);// tfa  t yazdirir daha sonra hata oldugu yerde durur. Daha sonra finally oldugu icin 
							// "f" yi her turlu yazdirir. "a" try-catch'in disinda oldugu icin onuda yazdirir.
		
	}

}
