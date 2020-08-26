package day15constructors;

public class Homework01 {

	String name = "Emily"; // instance variable
	int age = 20; // instance variable
	
	Homework01 (String name ,  int age) { // constructor
		
		this.name = name;
		this.age = 22 ;
	
	}
	
	public static void main(String[] args) {
		
		Homework01 st = new  Homework01("Oliver", 21 ); // st isimli obje olusturulmus
		
		System.out.println(st.name);  //  Oliver
		System.out.println( ","  + st.age); // , 22

		
		
		
	}

}
