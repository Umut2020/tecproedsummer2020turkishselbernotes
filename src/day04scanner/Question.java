package day04scanner;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		
		//* kullanarak aşağıdaki gibi üçgen yapınız (kullanıcıdan alarak)
		//    *
		//  *   *
		//*   *   *
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Herhangi bir character giriniz");
		char ch =scan.next().charAt(0);
		
		
		System.out.println("  " + ch + "  ");
		System.out.println(" " + ch + " " + ch + " ");
		System.out.println(ch + " " + ch + " " + ch);
		
		
		scan.close();
		
		
	}

}

