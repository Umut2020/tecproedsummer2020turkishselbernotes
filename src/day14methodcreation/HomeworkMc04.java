package day14methodcreation;

import java.util.Scanner;

public class HomeworkMc04 {

	public static void main(String[] args) {
		
		//Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		//		Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
		//		Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	
		Scanner scan = new Scanner (System.in);
		System.out.println( "paralelkenar, dikdörtgen ve üçgen kelimelerinden birini seciniz");
		String s = scan.next();
		System.out.println("Birinci sayiyi giriniz");
		int n1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int n2 = scan.nextInt();
	scan.close();		
		alanCevre (s , n1 , n2) ;
		}
	 public static void  alanCevre (String s , int n1 , int n2 ) {
		 int h1 = 5;//yukseklik	 
		 
		 if (s.equalsIgnoreCase("paralelkenar")) {
			 System.out.println("Alan : "+ (n1*h1)/2  );
			 System.out.println("Cevre : " +   (2*(n1+n2)));
		 }else if (s.equalsIgnoreCase("dikdortgen")) {
			 System.out.println("Alan : "+ (n1*n2));
			 System.out.println("Cevre : " +   (2*(n1+n2)));
		 }else if (s.equalsIgnoreCase("ucgen")) {
			 System.out.println("Alan : "+ (n1*h1)/2);
			 System.out.println("Cevre : " +   (2*(n1+n2)));
		 }
	 
	 
	 }
	
	
	
}
