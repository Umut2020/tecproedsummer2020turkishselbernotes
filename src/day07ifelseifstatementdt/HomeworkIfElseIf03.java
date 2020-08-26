package day07ifelseifstatementdt;

import java.util.Scanner;

public class HomeworkIfElseIf03 {

	public static void main(String[] args) {

		/*Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum” yazdırın.
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın.
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Yılı giriniz");
	
		double yıl = scan.nextDouble();
		
		if ( (yıl%1000)==0 )  {
			System.out.println("Milenyum");
		}else if ((yıl%100)==0 ) {  
			System.out.println("Yüzyıl");
		}else if ((yıl%10)==0) {
			System.out.println("Onyıl");
		}
		
		//if else ıf  lerde sıra önemlidir.
		
		
		
		
		/*if ( (yıl%1000)==0 )  {
			System.out.println("Milenyum");       bu durumda bütün değerleri yazdınır 1000 yazınca ekranda Milenyum Yüzyıl Onyıl yazar
		}if ((yıl%100)==0 ) {  
			System.out.println("Yüzyıl");
		}if ((yıl%10)==0) {
			System.out.println("Onyıl");
		}
		 */
	scan.close();
	
	}
	
}
