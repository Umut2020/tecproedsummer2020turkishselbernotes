package day07ifelseifstatementdt;

import java.util.Scanner;

public class HomeworkIfElseIf01 {

public static void main(String[] args) {
	
		/*Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
			“Eşkenar üçgen” yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen”
			yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Üçgenin birinci kenarını giriniz");
		int k1 =scan.nextInt();
		
		System.out.println("Üçgenin ikinci kenarını giriniz");
		int k2 =scan.nextInt();
		
		System.out.println("Üçgenin üçüncü kenarını giriniz");
		int k3 =scan.nextInt();
		
		
		
		if((k1==k2) && (k2==k3)) {
			System.out.println("Eşkanar Üçgen");
		}else if(k1==k2 || k2==k3 || k3==k1) {
			System.out.println("İkizkenar Üçgen");
		}else if((k1!=k2) && (k2!=k3) && k3!=k1   ) {
			System.out.println("Çeşitkenar Üçgen");
		}
				
		
		scan.close();
		
		
	}

}

