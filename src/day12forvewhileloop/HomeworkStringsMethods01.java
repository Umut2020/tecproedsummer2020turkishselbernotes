package day12forvewhileloop;

import java.util.Scanner;

public class HomeworkStringsMethods01 {

	public static void main(String[] args) {

		
		//	Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
		//   indexini ekrana yazdırın. “a” harfi yoksa ekrana “a harfi yok” yazdırın.
		
		
		
		
		Scanner scan = new Scanner (System.in);
	    System.out.println("Lutfen bir String giriniz");	
		String str=scan.nextLine();
		
		if (str.contains("a")) {
			System.out.println("'a' nın ilk indexi = " + str.indexOf("a"));
		}else {
			System.out.println("'a' harfi yok ");
		}
		

	
		
		
		scan.close();

		
		
		
	
	}

}
