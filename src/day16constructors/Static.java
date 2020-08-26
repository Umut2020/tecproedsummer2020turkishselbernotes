package day16constructors;

public class Static {

	static int x ;
	int y;
	
	
	Static ( ) {
		x +=2;
		y ++;
	}
	
	static int getSquare () {
		return x * x ;
	}
	
	
	public static void main(String[] args) {
	Static s1 = new Static (); // x = 2   und y= 1 oldu
	Static s2 = new Static (); // x= 4   und y = 1 oldu
	int z = s1.getSquare(); // z = 16
	System.out.println("-x" + z  + "-y" + s2.y ); // -x16-y1
	
	}

}
