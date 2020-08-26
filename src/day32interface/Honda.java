package day32interface;

public class Honda implements Car, Klima {

	/*
	 1)Bir class'i bir interface'in child'i yapmak icin "implements" keyword kullaniriz.
	 
	 2)Abstract class kullanarak abstraction yaparsak bir class'a 1'den fazla parent
	  koyamayiz cunku Java multiple inheritance'a musaade etmez. Bu yuzden interface
	  kullaniriz ve bir class icin 1'den fazla parent olusturarak calisabiliriz.
	  
	 3)Birden fazla interface'i bir class icin parent yaptiginizda parent olan interface'lerde
	 ayni isimli method'lar kullanabilirsiniz.Ama ayni isimli method'larin return typr'lari ayni olmak zorundadir.
	 Ayni olmazsa Compile Time Error alirsiniz.
	 
	 4)Birden fazla interface'i bir class icin parent yaptiginizda,parent olan interface'lerde ayni isimli 
	 variable'lar kullanabilirsiniz.Ancak hangi variable'i kullanacaginiza interfaceismini kullanarak siz karar 
	 vermelisiniz.Aksi takdirde hangisini kullanacagina karar veremez Compile Time Error alirsiniz.
	
		 */
		
	public static void main(String[] args) {
		
		Honda honda = new Honda();
		honda.antiBakteri();
		honda.isitma();
		honda.direksiyon();
		honda.engine();
		honda.teker();
		System.out.println(Klima.i);//The static field Car.i should be accessed in a static way
		System.out.println(k);
	}

	@Override
	public void engine() {
	System.out.println("1.6 VTEC Diesel");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Suni deri");
		
	}

	@Override
	public void teker() {
		System.out.println("16 inch alasim ");
		
	}

	@Override
	public void isitma() {
		System.out.println("isitma var");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("%99 bakteri koruma");
		
	}

	@Override
	public void fiyat() {
		System.out.println("Ozellige gore degisir");
		
	}

}
