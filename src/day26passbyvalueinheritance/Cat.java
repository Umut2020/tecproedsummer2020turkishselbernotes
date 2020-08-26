package day26passbyvalueinheritance;

public class Cat  extends Mammal {
	
	
	public static void main(String[] args) {
	
		Cat obc =new Cat ();
		obc.eat();
		obc.drink();
		obc.feed();
		obc.meow();
		
	}
	
	public void meow() {
		System.out.println("Miyavlarlar"); 
	}
	
	public  void clean() {
		System.out.println("Temizlenirler");
	}
}
