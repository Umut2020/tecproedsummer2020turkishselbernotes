package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya kaç elemanlı bir array gireceğini sorun.
		  Kullanıcıdan array’in elemanlarını girmesini isteyin.
		  a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
		  b) Bu arayın tum elemanlarını tersten yazdırın.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Kac elemanli bir array olusturmak istiyorsunuz");
		int a = scan.nextInt();
		int arr [] = new int [a];
		
		for (int i=0 ; i<a ; i++) {
			System.out.println((i+1) + ". elemani giriniz" );
			arr[i]	= scan.nextInt();
			System.out.println(arr[i]);
			}
			System.out.println("Array'in tum elemanlari = " + Arrays.toString(arr));
			
			
			int count = 0;
			System.out.println("Sorgulanacak elemani giriniz");
			int s =scan.nextInt();
						
			for (int i=0 ; i<a ; i++) {
				if (arr[i]==s ) {
					count++;
				}
			}
			if (count!=0) {
				System.out.println("Olusturdugunuz arrayda " +  s + " elemani vardir");
			}else {
				System.out.println("Olusturdugunuz arrayda " +  s + " elemani yoktur");
			}
		
			
			
			scan.close();
			
		
	}

}
