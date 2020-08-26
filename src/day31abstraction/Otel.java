package day31abstraction;
/*
 OTEL PROJECT
1) Bir otelde tek kisilik, aile ve kral odasi var.
2) Butun odalarda kahvalti servisi olmali.
3) Kral dairesinde cay servisi olmali, diger odalarda istege bagli.
4) wifi servisi tum odalar icin istege bagli.
5) Aile odasina ek yatak konmali diger odalarda olmamali.
 */

public abstract  class Otel {
	
	/*
	 1) abstract class'i final yapamayiz.Cunku final class'larin child class'lari olamaz; halbuki biz 
	 abstract class'lari child class'lari olsun ve child class'lari bazi seyleri yapmaya mecbur biraksin diye olustruruz.
	 Bu celiskiden dolayi Java abstract class'larin final olmasina musaade etmez, Compile Time Error verir.
	 
	 2) abstract method'lar da final olamazlar .Cunku final olurlarsa override edilemezler, halbuki biz abstract methodlari
	 override yapmak icin olustururuz.
	 
	 3)abstract method'lar private da olamazlar. Cunku private olurlarsa override edilemezler, halbuki biz abstract methodlari
	 override yapmak icin olustururuz.
	 
		 
	 */
	
	public abstract void kahvalti();
	
	public void cay() {
		System.out.println("7/24 Cay servisi");
	}
	
	public void wifi() {
		System.out.println("7/24 wifi servisi");
	}
	
}
