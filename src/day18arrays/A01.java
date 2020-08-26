package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		int arr1[] = new int [3] ; // array olusturma kalibi
		
		// Bir array'i console'a yazdirmak icin Arrays.toString() kullaniriz 
				System.out.println(Arrays.toString(arr1)); // [0,0,0]
				System.out.println(arr1);
				
			// Index e gore eleman ekliyoruz 
			//Bir array'a eleman ekleme
			arr1 [2] = 11;
			System.out.println(Arrays.toString(arr1)); // son elemani 11 olsun 
			
			arr1 [1]=9;
			System.out.println(Arrays.toString(arr1)); // orta eleman 9 olsun
	
			arr1 [0] = 7 ;
			System.out.println(Arrays.toString(arr1));// birinci elemani 7 yapalim
	
			 // Bir array' de olmayan index'i kullanmaya calisirsaniz Compile Time Error degil
			//Run Time Error alirsiniz. Yani; kodu calistirdiktan sonra console'da kirmizi 
			// hata mesaji gorursunuz. Kodu yazarken kirmizi alt cizgi almazsiniz.
			// Ornegin;arr1 [3]=13 ; kod calistiktan sonra " ArrayIndexOutOfBoundsException " hatasi alirsiniz
	
			// Kisa yoldan array olusturup deger atama 
			
			int arr2 [] = { 8, 10 , 12 , 14 };
			System.out.println(Arrays.toString(arr2));
			
			//Bir array'deki belli bir elemani ekrana yazdirmak icin 
			System.out.println(arr2[1]); //10
			System.out.println(arr2[3]);//14
			System.out.println(arr2[0]);//8 ==> Ilk eleman her zaman arrayisim[0] ile yazdiilir
			
			//her array'de son elemani yazdiran kod ne olabilir?
			int arr3[ ] = {21, 22 ,23 ,24 ,25 , 26};
			System.out.println(arr3[arr3.length-1]);//26 ==> Son eleman her zaman arrayismi[arrayismi.length-1]
													//ile bulunur
			
			
			
			
			//bir array olustrunuz bu arrray'in tum elemanlarini for-loop kullanarak ekrana
			//ayni satirda aralarina bosluk koyarak yazdiriniz 
			
			
			int arr4 [] = {21 ,22 ,23 ,24 };
			
			for (int i = arr4[0] ; i<= arr4[arr4.length-1] ; i++) {
				System.out.print(i + " ");
			}
			
			// baslangic indexi  int i = 0 ; olabilir o zaman syso'nun ici arr4[i] + " " olmali
			
			System.out.println("\n"  + "======");
			
			//Bir array olusturunuz. Bu array'in index'i cift sayi olan elemanlarini while loop 
			// kullanarak ekrana ayni satirda ve aralarina bosluk koyarak yaziniz.
			
			int arr5 [] = {0,12,23,45,56,45,10};
			
			System.out.println(arr5 );
			int i = 0;
			
			while (i<arr5.length) {
				if (i%2==0) {
					System.out.print(arr5[i] + " ");
				}
				i++;
			}
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
