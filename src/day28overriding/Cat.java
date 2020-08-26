package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.sound();//Constructor Cat oldugu icin   "Miyavlar" yazar
		cat.numOfFoot();
	}

	
	public void sound () {
		System.out.println("Miyavlarlar");
		
	}
	@Override//Annotation: Bu asagidaki methodu'un override kurallarina uygun 
			 // olrak override edlilip edilmedigini kontrol eder.
	public void numOfFoot() {
		System.out.println("4 ayaklari vardir");
	}


	@Override
	public Cat myMethod() {
		Animal obj1 = new Animal ();
		return null;
	}
	
}
