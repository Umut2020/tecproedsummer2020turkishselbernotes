package day28overriding;

public class Dog extends Animal {

		/*
		 1)Parent'taki method'u  Method Signature'ini degistirmeden method body'sini 
		 degistirerek Child class'da kullanmaya "Method Overriding" denir.
		 
		 2)Override ile overloading arasindaki fark
		 
		 3)Parent class'daki private method'lar override edilemezler
		 	private demek o class' ait demektir
		 	
		 4)final method'lar override edilemezler. Cunku final method'larin body'leri olabilecek son haldedir.
		 Halbuki overriding'in amaci method body'i degistirerek kullanmaktir.
		 
		 5)static methodlar override edilemezler.Cunku static methodlar zaten ortak kullanima aciktir.
		 onun body'sini degistirmek herkesi etkiler bu yuzden Java da static methodlarin override 
		 edilmesine musaade edilmez.
	 
		 6) Child class'taki override edilmis method'un (Overriding Method) accsess modifier'i 
		 Parent class'daki override edilen method'un (Overridden Method ) accsess modifier'indan 
		 daha dar olamaz.
		 
		 7) Child calss'daki override edilmis method'un return type'i parent class'daki
		  override edilmis method'un return type'i ile ayni olur veya onun  child'lerinden biri olabilir.
		  
		 8) Primitive data type veya void kullanilan method'larda mecburen ayni data type 'i kullanmalisiniz 
		 
		 */
	
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.sound();
		
		
	}
	
	public void sound () {
		System.out.println("Havlarlar");//Yandaki yukari yonlu mavi okta overriding yaziyor.
	}

	@Override
	public void numOfFoot() {
		System.out.println("4 ayaklari vardir");
	}

}
