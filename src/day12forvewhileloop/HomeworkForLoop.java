package day12forvewhileloop;

import java.util.Scanner;

public class HomeworkForLoop {

	public static void main(String[] args) {
		
		//Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
		//biten tüm harfleri büyük harf olarak ekrana yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Başlangıc harfini giriniz giriniz");
		char ilk =scan.next().toUpperCase().charAt(0);
		
		System.out.println("Son harfi giriniz");
		char son =scan.next().toUpperCase().charAt(0);	
	
		
	
		for (char i = ilk ;  i<=son ; i++) {
				System.out.print(i + " ");		
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}


