package day30exceptions;

public class Test01 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
	
		String result = "";
		String v = null;
		
		try {
			try {
			result = result + "before" ;
			v.length();
			result = result + "after" ;
			}catch (NullPointerException e) {
			result = result + "catch" ;
			throw new RuntimeException ();
			}finally {
			result = result + "finally";
			throw new Exception () ;
			}	
			
		}catch (Exception e) {
			result = result + "done" ;
		}
		System.out.println(result);
	}

}
