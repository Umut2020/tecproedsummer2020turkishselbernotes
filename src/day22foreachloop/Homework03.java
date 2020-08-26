package day22foreachloop;

import java.util.Arrays;

public class Homework03 {

	public static void main(String[] args) {
		  /* İki String array oluşturunuz ve bu array’lerdeki ortak elemanları
			For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
			Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız
		  */
		String arr1 []= {"Ali" , "Veli" , "Deniz" };
		String arr2 []= {"Hasan" , "Veli" , "Huseyin" };
		
		String ortak = "";
		int count = 0 ;
		
		for (String w : arr1) {
			for (String x : arr2) {
				if (w.equals(x)) {
					ortak += x;
					count ++;
					}
				}
			}
	
		if (count!=0) {
			System.out.println("Ortak elemanlar : " + ortak);
		}else {
			System.out.println("Ortak eleman yok");
			}
	
		
	}
}
