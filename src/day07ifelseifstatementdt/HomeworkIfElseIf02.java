package day07ifelseifstatementdt;

import java.util.Scanner;

public class HomeworkIfElseIf02 {

	public static void main(String[] args) {

		/*Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		1. 50 den az - D 2. 50(dahil) ile 60 arası - C 3. 60(dahil) ile 80 arası - B. 4. 80(dahil) ustu- A
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Notunuzu giriniz");
		int not =scan.nextInt();
		
		if( (not<0) || (not>100) ){
			System.out.println("Geçersiz not");
			
		}else if((not<50) && (0<=not) ) {
			System.out.println("D");
		}else if( (not>=50) && (60>not)) {
			System.out.println("C");
		}else if ((not>=60) && (not<80)) {
			System.out.println("B");
		}else  {
			System.out.println("A");
			
		}
		scan.close();
		
	}

}

