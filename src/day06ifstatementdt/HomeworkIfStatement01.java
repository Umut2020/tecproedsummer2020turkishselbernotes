package day06ifstatementdt;

import java.util.Scanner;

public class HomeworkIfStatement01 {

	public static void main(String[] args) {

		/*
		 *Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın.
		 Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.
		 */		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz");
		int say1 = scan.nextInt();	
		
		System.out.println("İkinci sayıyı giriniz");
		int say2 = scan.nextInt();
		
		System.out.println("1.sayı= " + say1 + "\n" + "2.sayı= " + say2 );
		
		if ((say1>0 && say2>0) || (say1<0 && say2<0)  ) {
			System.out.println("Aynı İşaretli");
		}if ((say1<0 && say2>0) || (say1>0 && say2<0)) {
			System.out.println("Farklı İşaretli");
		}
		
		scan.close();
		
		
	}

}
