package day19arrays;

import java.util.Arrays;

public class Homework03 {

	public static void main(String[] args) {

		//Soru program calistiktan sonra count'un degeri ne olur
		
		int[] x1 = {0,1,2,3};
		int[] x2 = {1,2,2,3};
		
		int i1 = 0;
		int i2 = 0;
		int count =0;
			
		while ((i1< x1.length) && (i2<x2.length) ) {
			
			if (x1[i1]==x2[i2]) { 
				count++; // 4
				i2++; //4
			}else if (x1[i1] < x2[i2] ) { // i1 = 3
				i1++;
			}else { // x1[i1] > x2 [i2]
				i2++;
			}
			
		}
		System.out.println(count);// 4
		System.out.println(i1);// 3
		System.out.println(i2);// 4

	}
}
