package day16constructors;

public class Test02 {

	static int i = 1 ;
	int k        = 1 ;
	public static void main(String[] args) {

	for ( i = 1; i<10 ; i++  ) {
		i = i + 2;
		System.out.print(i + " ");//10
	}
	
	System.out.println("====================");
											   
	
	for (int k = 1; k<10 ; k++  ) {
		k = i + 2;
		System.out.print(k + " ");
		
	}

}
}	
	
