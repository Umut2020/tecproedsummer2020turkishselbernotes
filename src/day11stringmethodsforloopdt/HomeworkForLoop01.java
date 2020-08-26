package day11stringmethodsforloopdt;

public class HomeworkForLoop01 {

	public static void main(String[] args) {

		//Ekrana ilk 100 cift sayma sayisini yazdiriniz
		//İki farklı yöntemle çözünüz 

		//  (Baslangic; Condition;  Artirma/Azaltma )
		//1. Çözüm
		
//		for ( int i  = 2 ;   i<=200 ; i=i+2  ) {
//			System.out.println(i);
//		}
		//2. Çözüm
				
		
		int say = 1 ; //Flag
		
			for (int i = 1 ; say<=100; i++ ) {
				if (i%2==0 ) {
					System.out.println(i+ " ");
					say++;
				}
			}
		
		
	}

}

