package day22foreachloop;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {
		/*Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya
		for-each loop kullanarak yazdırınız.
		İpucu: split()		 */
		
		String s = "UmutGungor";
		
		String sArray [] = s.split("");
		System.out.println(Arrays.toString(sArray));
		
		for (String w : sArray) {
			System.out.println(w);
		}
		
		//List<String> sl3=Arrays.asList(arr3);
		
		//String arr[ ] = list.toArray(new String[0]);
		//Object arr[ ] = list.toArray( );
	}

}
