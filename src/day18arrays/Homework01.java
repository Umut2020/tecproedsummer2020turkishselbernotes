package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	
		public static void main(String[] args) {
			/* Kac elemanli array girilecegini sorun ve tum elemanlari isteyin,
			 * Tum elemanlari ekrana yazdirin ve son elemani ilk eleman yapin
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("What is the array's length?:");
			int l= scan.nextInt();
			int arr1[] = new int [l];
			
			for (int i=0; i<arr1.length; i++) {
			System.out.println("Enter the" + i +". "+"element?");
			arr1[i]	= scan.nextInt();
			System.out.println(arr1[i]);
			}
			System.out.println(Arrays.toString(arr1));
		
			int temp= arr1[0];
			arr1[0]=arr1.length;
			arr1[arr1.length-1]= temp;
			System.out.println(Arrays.toString(arr1));
			scan.close();
			
			}

			
			
		
		
		
		
		
		
		
		
	}


