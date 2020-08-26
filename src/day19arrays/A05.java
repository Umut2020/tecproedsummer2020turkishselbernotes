package day19arrays;

import java.util.Arrays;

public class A05 {

	public static void main(String[] args) {
		
		//Iki array'in esit olup olmadigini eguals methodu ile gorebiliriz
		
		//Bir String'i parcalara ayirmak
		
		String str = "Ipek topu at , topu at Ipek" ;
		
		String strArray[] = str.split(",");
		System.out.println(Arrays.toString(strArray));// [Ipek topu at,  topu at Ipek]  "topu" dan once
													 // 2 bosluk var ilki Java grammer kurali ikincisi Stringin 
		
		//str String'inde kac kelime var?
		String sArray [] = str.split(" ");
		System.out.println(Arrays.toString(strArray));//[Ipek, topu, at,,  topu, at, Ipek]
		System.out.println(sArray.length);//6
		
		String tArray[] = str.split("");// Bu kod space dahil tum characterleri ayirir.
		System.out.println(Arrays.toString(tArray));
	//[I, p, e, k,  , t, o, p, u,  , a, t,  , ,,  , t, o, p, u,  , a, t,  , I, p, e, k]

		
		
	}

}
