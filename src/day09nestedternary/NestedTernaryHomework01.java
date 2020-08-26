package day09nestedternary;

import java.util.Scanner;

public class NestedTernaryHomework01 {

	public static void main(String[] args) {

		/*Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil”yazdırın.
		 */
		 

		Scanner scan = new Scanner(System.in);
		System.out.println("Yıl  giriniz");
		int yıl = scan.nextInt();
		 
		String result = (yıl%4)==0 ? "Artık Yıl" : "Artık yıl degil" ;
		System.out.println(result);
		
		scan.close();
		
		
	}

}

