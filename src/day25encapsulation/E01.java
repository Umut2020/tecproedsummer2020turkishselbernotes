package day25encapsulation;

public class E01 {

	/*
	 1)Encapsulation "data saklamak (hidding) demektir. (hiding of date)
	 2)Encapsulation yapmak icin variable'lari "private" yapariz.
	 3)Encapsulation yaptigimiz variable'i a)Okumak b)Degistirmek icin acabilirsiniz.
	 */
	
	
	//Full Encapsulation ==> Tum variable'larin private olmasi ve tum getter ve setter'larin olusturulmasi demektir.
	
	//Immutable class ==> Degistirilemeyen class
	//Bir class'in AccesModifier'i private veya protected olamaz.
	
	private int sifre =1234;// sifre variable'i icin Encapsulation islemi yapilmis oldu
	private String isim = "Ali Can";
	private double kilo = 2.5;
	
	public static void main(String[] args) {
	
		
	}
	
	//Encapsulation yaptiginiz variable'in baska class'lardan okunabilmesini isterseniz 
	//getter method olusturmaniz gerekir.
//	   ||
//	  VVVV
	
	/*
	 Getter method olusturmak icin;
	 1)AccessModifier public olsun
	 2)Return Type variable'in return type'i ile ayni olsun 
	 3)Isim get + variable ismi seklinde olsun 
	 4)Method'un icinde "return variable ismi" yazilsin
	 5)* getter methodun AccessModifier'i public olmak zorunda 
	 */
	public int getSifre() {//get grammer kurali
		return sifre;
	}
	
	public String getIsim() {// baska classlarda okuyabilmnek icin method olusturuyoruz==>getter method
		return isim;
	}
	
	
	public double getKilo() {
		return kilo;
	}
	
	/*Setter method olusturmak icin;
	 1)AccessModifier'i her zaman public yapiniz.
	 2)Return Type'i her zaman void yapiniz.
	 3)Method ismi "set + variable ismi" seklinde yaziniz.
	 4)Method parantezi icine variable'i return type'i ile beraber yaziniz.
	 5)Method body'si icine "this.variable ismi = variable ismi" yaziniz.
	 
	 */
	public void setSifre (int sifre) {
		this.sifre = sifre; //"this." bu class'taki demek  this() ==> farkli==> bu constructor demek
	}
	
	
	public void setKilo(double kilo) {
		this.kilo= kilo;
		
	}
	
	public void setIsim(String isim) {
		this.isim=isim;
		
	}
	
	
		
	
}
