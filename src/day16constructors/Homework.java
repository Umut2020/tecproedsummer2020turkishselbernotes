package day16constructors;

public class Homework {
	
	int x ; // instance variable
	static int y; // static variabble 
	
	
	Homework (int i){ // int paremetreli bir Constructor
		x += i ;
		y += i ;
	}
	
	public static void main(String[] args) {
		
		new Homework(2); // isimsiz obje olusturulmus ===> x=2    y= 2  oldu
		Homework mc = new Homework (3);  // x= 3   y=5
		System.out.println(mc.x + "," + mc.y );//  3, 5
		
		
	}

}
