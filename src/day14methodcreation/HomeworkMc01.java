package day14methodcreation;

import java.util.Scanner;

public class HomeworkMc01 {

	

	public static void main(String[] args) {

//Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.		

//		Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük
//		diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Adinizi giriniz ");
		String ad = scan.next();
		System.out.println("Soyadinizi giriniz");
		String soyad = scan.next();
				scan.close();
		isimSoyisim (ad, soyad);
		
	}

	public static void isimSoyisim ( String isim , String soyisim ) {
		
		System.out.println(isim.toUpperCase().charAt(0) + isim.toLowerCase().substring(1) );
		System.out.println(soyisim.toUpperCase().charAt(0) + soyisim.toLowerCase().substring(1) );

	}
	
	
	
	
}
