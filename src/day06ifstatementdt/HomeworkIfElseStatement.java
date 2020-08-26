package day06ifstatementdt;

import java.util.Scanner;

public class HomeworkIfElseStatement {

	public static void main(String[] args) {
		/*
		 *4) Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
			Diğer durumlarda ekrana “Harf değil” yazdırın.
		
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir karaekter giriniz");
		char kar =scan.next().charAt(0);
		
		if( (kar>='a' && kar<='z') || (kar>='A' && kar<='Z')  ) {
			System.out.println("Harf");
		}else {
			System.out.println("Harf değil");
		}
		
		scan.close();
		
		
		
		
	}

}
