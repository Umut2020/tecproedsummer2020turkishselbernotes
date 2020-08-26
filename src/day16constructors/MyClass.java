package day16constructors;

public class MyClass {

	int x =3 ;
	int y = 5 ;
	
	MyClass () {
		x +=1; // x=4 oldu
		System.out.println("-x" + x); // -x4
	}
	
	MyClass (int i) {
		this ();
		this.y=i; // y=3 oldu
		x +=y;  // x = 7 oldu
		System.out.println("-x" + x); // -x7
	}
	MyClass (int i , int i2) { // 4,3 
		this(3); 
		this.x -= 4 ; // x = 7
		System.out.println("-x" + x); //-x3
	}
	public static void main(String[] args) {

	MyClass mc1 = new MyClass (4,3); 	
		
		
	}

}
