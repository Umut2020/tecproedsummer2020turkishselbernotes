package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Üçgenin birinci kenarını giriniz");
		int k1 = scan.nextInt();
		System.out.println("Üçgenin ikinci kenarını giriniz");
		int k2 = scan.nextInt();
		System.out.println("Üçgenin üçüncü kenarını giriniz");
		int k3 = scan.nextInt();
		
		String result = (k1==k2) &&  (k3==k1) ? "Eşkenar Üçgen" : "Eşkenar Değil";
		
		System.out.println(result);
		
		
		
		System.out.println((k1==k2) &&  (k3==k1) ? "Eşkenar Üçgen" : "Eşkenar Değil");
		
		
		/*
		 * Scanner scan = new Scanner(System.in);
		System.out.println("Üçgenin üç  kenar uzunluğunu  giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		 */
		scan.close();
		
	}

}
