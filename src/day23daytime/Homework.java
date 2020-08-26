package day23daytime;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		  //Homework: Kelimenin harflerini alip onlari giris sirasina gore birlestirerek ekrana basan 
		//          bir program yaziniz. Varargs kullanmalisiniz.
	
		Scanner scan =new Scanner (System.in);
		System.out.println("kelimenin harflerini giriniz");
		char hrf = scan.next().charAt(0);
		
		
		
		harfSirasi(hrf);
		
		
		
	}

	public static void harfSirasi (char...s) {
	
			
		for (char w : s) {
		
			System.out.print(w );
		}
		
		
	}
	
	
	
}
