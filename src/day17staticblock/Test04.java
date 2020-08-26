package day17staticblock;

public class Test04 {

	int x = 10 ;
	
	
	
	public static void main(String[] args) {
		
	
		//System.out.println(Test04.x); //cte cunku instance variable ler objeler ile classtan alinir
									
	}
	
	static 
	{
		int x = 20 ;
		System.out.print(x + " ");   // 20
	}
	
	
	
	
}