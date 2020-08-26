package day19arrays;

import java.util.Arrays;

public class HomeworkSplit {

	public static void main(String[] args) {
	
		String str = "Java'yi, sevdiniz mi?" ;
		
		String arr1 [] =str.split(",");
		String arr2 [] =str.split(" ");
		String arr3 [] =str.split("d");
		
		System.out.println(Arrays.toString(arr1)); // [ Java'yi,  sevdiniz mi? ]
		System.out.println(Arrays.toString(arr2));// [Java'yi,, sevdiniz, mi?]
		System.out.println(Arrays.toString(arr3));// [Java'yi, sev, iniz mi?]
		

	}

}
