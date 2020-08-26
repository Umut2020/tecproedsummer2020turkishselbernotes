package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
	/*
	 Kullanıcıdan bir gun alın eğer gun 
	 “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
     “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. 
     “Pazar” ise ekrana “Hristiyanlar icin kutsal gün” yazdırın
	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun giriniz");
		String gun = scan.next();
		//String'leri karsilastirirken sakin haaa "==" kullanmayin
		//String'leri karsilastirirken kesinlikle equals() kullanin
		//equals() boolean return eder.
						
		if(gun.equals("Cuma")) {
			System.out.println("Müslümanlar icin kutsal gün");
		}	
		
		/*
		if(gun=="Cumartesi") {
			System.out.println("Yahudiler icin kutsal gün"); Bu şekilde girilirse kod çalışmaz aşağıdaki gibi girilmesi
			
			çünkü;
			
			Note:
		
			“==” String’lerin hem degerlerini hem de adreslerini kontrol eder.
			String’lerin degerleri ve adresleri ayni ise bu String’leri eşit kabul eder.
			“equals( )” String’lerin sadece degerlerini kontrol eder.
			String’lerin degerleri ayni ise bu String’leri eşit kabul eder.
			Biz iki String’in eşit olup olmadigini kontrol etmek icin equals( ) kullanırız.
			Note:
			firstName == lastName ==> False olur çünkü degerler ayni ama adresler farklı
			firstName.equals(LastName) ==> True olur çünkü adresler kontrol edilmez,
			degerler ayni.
		}
		*/
		
	
		  if(gun.equals("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün");
		}		
		 
		
		
		if(gun.equals("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gün");
		}
		
		scan.close();		
	}


		
		
		
		
	}


