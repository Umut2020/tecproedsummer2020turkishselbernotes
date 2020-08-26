package day14methodcreation;

import java.util.Scanner;

public class HomeworkMc02 {

	public static void main(String[] args) {
		
		//Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		/* Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise ekrana
		“Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Birinci sayiyi giriniz");
		int say1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		int say2 = scan.nextInt();
		scan.close();
		
		esit (say1,say2);
	}

	
		public static void esit (int n1 , int n2   ) {
			if (n1==n2) {
				System.out.println("Esit");
				}else if (n1>n2) {
					System.out.println("Birinci sayi buyuk");
				}else if (n1<n2) {
					System.out.println("Ikinci sayi buyuk");
				}
		}
		
	
		
		
	
	
	
}

