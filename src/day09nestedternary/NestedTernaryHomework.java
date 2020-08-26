
package day09nestedternary;

import java.util.Scanner;

public class NestedTernaryHomework {

	public static void main(String[] args) {
	
		/*Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.” */

			Scanner scan =new Scanner(System.in);
			System.out.println("Bir tam sayı giriniz");
			int s = scan.nextInt();
			
			// () ? ( () ?  () : ()  ) : (() ?  () : () ) ;
			
			String result = (s>99) && (s<1000) ?  "Üç Basamaklı sayı" :  (s%2)==0	?  "Üç Basamaklı olmayan çift  sayı" : 	"Üç Basamaklı olmayan tek sayı" ;
			System.out.println(result);
		
			scan.close();
			
	}

}

