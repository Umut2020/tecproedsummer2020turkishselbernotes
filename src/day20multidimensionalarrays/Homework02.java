package day20multidimensionalarrays;


 public class Homework02 {

	public static void main(String[] args) {
	
	//Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını ekrana yazdıran
	//	bir program yazınız { {1,2,3}, {4,5}, {6} }
	
		int mda [] [] = { {1,2,3}, {4,5}, {6} } ;
		
		//1.yol 
		System.out.println(mda[0][2]*mda[1][1]*mda[2][0]);//90
		//2. cozum
		
		int pro = 1;
		
		for (int i = 0 ; i<mda.length ; i++) {
			for (int j= 0; j<mda[i].length ; j++) {
				
				if (mda[i].length-1 == j) {
				pro = pro * mda[i][j];  
			}
		}	
	}	System.out.println(pro);

	
	}
	}
