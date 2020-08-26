package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework01 {

		/*Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını
			For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.	 */
	
	public static void main(String[] args) {
	
	int arr [] = {1,2,9,3,54,};
	
	int pro=1;
	
	for (Integer w : arr) {
		pro =pro * w ;
		
	}System.out.println(pro);
	 System.out.println(2*9*3*54);
	
	
	
	}
}
