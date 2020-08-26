package day17staticblock;

public class Test03 {

	int x = 10 ;
	
	
	
	public static void main(String[] args) {
		
		Test03 t1 = new Test03 ();
		System.out.println(t1.x); // instance variable lara  objeler ile ulasabilirsiniz
									// ornekte t1 objesi ile ulasilmis
	}
	
	static 
	{
		int x = 20 ;
		System.out.print(x + " ");   // 20 10
	}
	
	
	
	
}