package day12forvewhileloop;

import java.util.Scanner;

public class HomeworkKarma10_11_12 {

	public static void main(String[] args) {
		
            //Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
            // Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		
		
//			// 1. Çözüm For-Loop
//			Scanner scan =new Scanner(System.in);
//			System.out.println("Bir sayı giriniz");
//			
//			int num = scan.nextInt();
//			
//			System.out.print(num + " bölenleri = ");
//			
//			for (int i = 1 ; i<=num    ; i++) {
//				if(num%i==0) {
//					System.out.print(i + " ");
//				}
//			}
			
			
			// 2. Çözüm While Loop
			Scanner scan =new Scanner(System.in);
			System.out.println("Bir sayı giriniz");
			int num = scan.nextInt();
		
			int i = 1;
			System.out.print(num + " ın bölenleri = ");
			while (i<=num) {
				if (num%i==0) {
				System.out.print(i + " ");
				}
				i++;
			}
		
		
		scan.close();
		
	}}
