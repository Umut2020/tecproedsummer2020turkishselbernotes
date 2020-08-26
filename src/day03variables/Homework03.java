package day03variables;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("kaç saat olduğunu giriniz");
		
		long saat = scan.nextLong();
		System.out.println("Saniye= "+saat*60*60);
		
	
		
		/*8) Saati saniyeye çeviren bir program yazınız. (long kullanınız)
			Not 1: Saniye = Saat x 60 x 60
		 
		 */
		
		scan.close();
		
	}
	
}
