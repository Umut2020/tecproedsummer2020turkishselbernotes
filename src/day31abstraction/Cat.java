package day31abstraction;

public class Cat  extends Mammal {

	/*
	 1)Concrete class'lar parent'lari olan abstract class'lardaki tum abstract method'lari 
	 override etmek zorundadirlar.Aksi takdirde CTE olusur.
	 
	 2)Concrete class'larda parent'lari olan abstract class'larda concrete method'lari override etmek zorunda degildirler.
	   Concrete	method'larin override edilmesi istege baglidir.
	  
	 3)Concrete class'lar tum abstract parent'larindaki Tum abstract method'lari 
	  override etmek zorundadirlar.Aksi takdirde Compile Time Error olusur.
	 */
	
	public static void main(String[] args) {
	
		
	}

	@Override
	public void asi() {
		System.out.println("Ey kedi asi ol");
	}

	@Override
	public void drink() {
		System.out.println("Su icerler");
		
	}

	@Override
	public void feed() {
		System.out.println("Yavrularini besler");
		
	}



}
