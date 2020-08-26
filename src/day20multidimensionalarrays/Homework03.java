package day20multidimensionalarrays;

import java.util.Arrays;

public class Homework03 {

	public static void main(String[] args) {
		
		/*Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların toplamını birer birer bulan
		ve herbir sonucu yeni bir array’in elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız
		{ {1,2,3}, {4,5}, {6,7} }
		Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
		 */
		
		int mda [][]= { {1,2,3}, {4,5}, {6,7} };
			
		int yeni [] = new int [mda.length];
		
	
		
		for (int i = 0 ; i < mda.length; i++ ) {
			
			int sum = 0; //kilit nokta burasi i bitince sum'in sifirlanmasi lazim
			
			for (int j= 0; j<mda[i].length ; j++) {
				
				sum = sum + mda[i][j];
				yeni[i]=sum;
			}	
			
		}
	
		System.out.println(Arrays.toString(yeni));
	
	}
	
}
