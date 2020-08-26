package day14methodcreation;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
//		Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran
//		Program yazınız. Ornegin; CAN ==> C
//		          						  A
//										  N
		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen bir isim yaziniz");
		String ad=scan.next();
		scan.close();
		
		isimYazma(ad);
		
		
	}
	public static void isimYazma(String ad) {
	
		int bitis=0;
		while(bitis<ad.length()) {
			
			System.out.println(ad.toUpperCase().charAt(bitis));
			bitis++;
					
		}

		
		
		
		
		
		
		
		

	}

}
