package day27inheritance;

public class Dog extends Mammal {

	/*
	1) Java'da bir class sadece bir class'a extend edebilebilir.
	 Java'da bir class'in sadece bir tane parent'i olabilir 
	 Java multiple inheritance'i onaylamaz
	 
	 2)protected ve public method'lar inheritance'a uygundurlar.
	   private method'lar inheritance'a uygundurlar.
	   default ayni package'de iseniz inheritance'a uygundur ama farkli package'da 
	   iseniz uygun degildir.Kullanmak risklidir bu yuzden inheritance'da default 
	   access modifier kullanilmaz.(bu kurallar variable'lar icinde gecerli)
	   
	   3) Parent Class = Super Class 
	   	  Child Class = Sub Class
	   	  
	   4) Her constructor'in ilk satirinda (aksi bir hamle yapilmadigi surece ) "super ()"
	     constructor call'u vardir.super () yazmak istege baglidir.Yazsanizda yazmasanizda 
	     super() otomatik olarak calisir.
	     
	   5) Static Methods or variable’lar inherit edilemezler. Sari cizgi verir.
	   Class ismiyle kullanilmalidir
	 */
	
	public boolean loyal = true ;
	
	public Dog () {
	super();//istege bagli. yazilmasa da olabilir.
		System.out.println("Dog");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog ();
		dog.bark();
		dog.drink();
		dog.eat();
		dog.feed();//The static method feed() from the type Mammal should be accessed in a static way
				  //Mammal türündeki statik yöntem feed'e () statik bir şekilde erişilmelidir
				  // Yani class ismi kullanarak
		dog.smell();
		System.out.println("Sadik ? " + dog.loyal);//yazdirmayinca cte veriyor ==> kullanilmayan varable
		System.out.println("Dogum ? " + dog.dogum);
		System.out.println("Yas ? " + dog.age);
		
	
		
		}

	public void bark () {
		System.out.println("Havlarlar");
	}
	
	public void smell () {
		System.out.println("Iyi koku alirlar");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
