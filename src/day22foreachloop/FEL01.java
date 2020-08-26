package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {

		List <Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		
		
		// for-each loop = enhanced loop(zenginlestirilmis loop)
		
		for(Integer w : il) {
			System.out.println(w);
		}
		
		//il listinin tum elemanlarini toplayiniz/
		
		int sum = 0 ;
		for(Integer w : il) {
			sum = sum + w;
		}
		System.out.println(sum);
		
		//il listinin icindeki elemanlarin carpimini bulunuz
		
		int product = 1;
		
		for (Integer w : il) { // for-each de primitive data type kullanilabilir.Yani parantez icine int yazilabilir.
			
			if (w%2!=0) {
				product = product * w;
			}
		}System.out.println(product);
		
		
		//il listinin icindeki tek sayi  elemanlarini ekrana yazdiriniz.
		
	
		System.out.print("Tek sayi elemanlar = ");
		for (Integer w : il) { 
			
			if (w%2!=0) {
			
				System.out.print( w + " ");
			}
		}
		
		//break ve continue karsilastirmasi
		
		//il list'inin ilk 3 elemanini karsilastiriniz
		
		
		int count = 0;
		
		for(int w : il) {
			
			if (count<3) {
				System.out.println(w + " ");
				count++;
			  }
			
		}
		
		System.out.println();
		
		//2. Yol
		
		int c = 0;
		for(int w : il) {
			System.out.println(w + " ");
			c++;
			if(c==3) {
				break;
			}
		}
		
		System.out.println();
		
		// il list'inde 3 ile bolunebilen elemanlari ekrana yazdirin
		
		for (int w : il) {
			
			if (w%3==0) {
				System.out.print(w + " ");
			}
		}
		
		System.out.println();
		
		//2.Yol 
		
		for (int w: il) {
			
			if (w%3!=0)
				continue;
			System.out.print(w + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
