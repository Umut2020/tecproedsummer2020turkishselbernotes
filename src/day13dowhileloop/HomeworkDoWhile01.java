package day13dowhileloop;

import java.util.Scanner;

public class HomeworkDoWhile01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.
		 “a” harfi yoksa tekrar bir String girmesini isteyin.
		  */
		
		//1. Cozum do  while ile
		Scanner scan =new Scanner (System.in);
		
		String s = "b" ;
			do {
			if (!(s.contains("a"))) {
				System.out.println("Bir String giriniz");
				s = scan.nextLine();
			}
		}while (!(s.contains("a")));
		System.out.println("'a' harfi var");
	
		//2. Cozum while-loop ile 
		
//	    Scanner scan =new Scanner (System.in);		
//		String s = "b" ;
//	
//		while (!s.contains("a") )  {
//		System.out.println("Bir String giriniz");
//		s = scan.next();
//		}System.out.println("'a' harfi var");
//		
			
		
		
		
		
		
		scan.close();
		
	
		
		
		
	}

}
