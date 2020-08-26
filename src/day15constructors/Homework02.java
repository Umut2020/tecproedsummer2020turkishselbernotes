package day15constructors;

public class Homework02 {
	
	String name ; // tanimlanmamis instance variable   default value ""
	int age = 20; // tanimlanmamis instance variable   default value "0"
	String phone;// tanimlanmamis instance variable   default value ""
	
	Homework02 (){} // bos Constructor
 	
	Homework02 (String name ,  int age , String phone) { // constructor
		this.phone=phone;
		this.name = name;
	
	
	}
	
	public static void main(String[] args) {
		
		Homework02 s1 = new  Homework02(); // s1 isimli obje olusturulmus
		Homework02 s2 = new  Homework02(" John", 22 , "029777"); //s1 isimli obje olusturulmus
				
		System.out.println(s2.name + "," + s2.age + "," + s2.phone );  //  John , 22 , 029777
		System.out.println(s1);

}
	
	
	
}