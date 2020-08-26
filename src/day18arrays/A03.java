package day18arrays;

import java.util.Arrays;

public class A03 {

	public static void main(String[] args) {
		
		String s[] = {"Ali", "Can" , "Veli"};//[Ljava.lang.String;@15db9742 (Referance adresi)
											// Arrays' lerde sadece non primitive date type'lar ve Object Referance'lar
											//olur. 
											// Obje gorunumlu referance lar var
		int arr [] = {23 ,12,21,21,1 };
		
		System.out.println(s);
	 	System.out.println(arr);
		System.out.println(s[2]); //Veli
		System.out.println(Arrays.toString(arr));
	}

}
