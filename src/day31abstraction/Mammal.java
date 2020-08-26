package day31abstraction;

public abstract class Mammal extends Animal  {

	/*
	 1) Gordugunuz gibi Mammal, Animal'in child class'i ve asi() method'u ile drink() method'unu override etmedi
	 ama herhangi bir Compile Time Error yok. Cunku; abstract child'larin abstract  parent'daki abstract method'lari
	 override etme zorunlulugu yoktur.
	 */
	
	public abstract void feed();
	
	public void move() {
		System.out.println("Hareket ederler");
	}
	
	
	
}
