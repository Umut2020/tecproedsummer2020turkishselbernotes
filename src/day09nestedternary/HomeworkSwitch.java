package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch {

	public static void main(String[] args) {

		/*Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
			“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
			Bu harflerin dışında bir character için “Geçersiz character” yazdırın.
		  NOT: SWİCHT STATEMENT KULLANINIZ   */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Bir harf giriniz");
		char ch =scan.next().charAt(0);
		switch (ch) {
			case 'a' :
			System.out.println("Sesli harf"); 
			break;
			case 'e' :
			System.out.println("Sesli harf");
			break;
			case 'i' :
			System.out.println("Sesli harf");
			break;
			case 'o' :
			System.out.println("Sesli harf");
			break;
			case 'u' :
			System.out.println("Sesli harf");
			break;
			case 'b' :
			System.out.println("Sessiz harf"); 
			break;
			case 'c' :
			System.out.println("Sessiz harf");
			break;
			case 'd' :
			System.out.println("Sessiz harf");
			break;
			case 'f' :
			System.out.println("Sessiz harf");
			break;
			default:
				System.out.println("Geçersiz karekter");
		}
		
		scan.close();
		
		
		
	}

}
