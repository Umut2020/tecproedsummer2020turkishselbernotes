package day08nestedif;

import java.util.Scanner;

public class HomeworkTernary01 {

	public static void main(String[] args) {

		/*Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
		  Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
		  ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın. */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Alınacak ürün miktarını giriniz");
		double m =scan.nextInt();
		System.out.println("Alınacak ürünün birim fiyatını giriniz");
		double b =scan.nextInt();
		
		double result = m>1000 ? (b*m)*0.9 : (b*m) ;
		System.out.println(result);
		
		scan.close();
		
	}

}
