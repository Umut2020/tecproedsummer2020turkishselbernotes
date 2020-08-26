package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class Homework02 {

	public static void main(String[] args) {
	
		/*Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını
		For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.	 */

	
		List <Integer> list = new ArrayList<>();		
		
		list.add(1);		list.add(2);		list.add(3);		
		list.add(4);		list.add(5);		list.add(6);
		
		int sum = 0;
		
		for (Integer w : list) {
			sum= sum + ( w*w);
		}System.out.println(sum);
		
		System.out.println(1+4+9+16+25+36);
	
	}
}
