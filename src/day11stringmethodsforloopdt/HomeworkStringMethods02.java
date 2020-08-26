package day11stringmethodsforloopdt;

import java.util.Scanner;

public class HomeworkStringMethods02 {

	public static void main(String[] args) {

//		Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
//		büyük harf olarak ekrana yazdırın.	
		
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen yaşadığınız ülkenin ismini  giriniz");
		String nat =scan.nextLine().toUpperCase();
		
		System.out.println("Baştan İkinci Harf = " + nat.charAt(1));
		System.out.println("Sondan İkinci Harf =" +  nat.charAt(nat.length()-2) );
		
		
	scan.close();
	

		
		
	}

}
