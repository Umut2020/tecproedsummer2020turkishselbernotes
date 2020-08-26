package day20multidimensionalarrays;


public class Homework01 {

	public static void main(String[] args) {
		//mda olusturma 1. yol
		//int mda [] [] = new int [3] [3] ;
		// 2.yol  ve Soru:
		//Aşağıdaki multi dimensional array’in tum elemanlarının çarpımını ekrana yazdıran bir program yazınız.
			int mda [][] = {{1,2,3} , {4,5,6} };
			//1. cozum hard coding 
		System.out.println(mda[0][0]*mda[0][1]*mda[0][2]*mda[1][0]*mda[1][1]*mda[1][2]);
		
		//2. cozum flexibel coding
		
		int product = 1;
		
		for (int i = 0 ; i < mda.length; i++ ) {
			for (int j= 0; j<mda[i].length ; j++) {
				
				product = product* mda[i][j];
			}	
		}
		
		System.out.println(product);
		
	}
	
}
