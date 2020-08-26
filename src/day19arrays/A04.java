package day19arrays;

import java.util.Arrays;

public class A04 {

	
	public static void main(String[] args) {
		
		int arr [] = {3,7,1,18 };
		System.out.println(Arrays.toString(arr));// [3,7,1,18]
		
		//Array elemanlarini kucukten buyuge siralayalim
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));// [1,3,7,18]
		
		//Bir String array olusturun elemanlarini alfabetik sirada dizin
		
		String arr2 [] = { "a" , "d" , "k", "l" ,"b" };
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//Bir integer array'deki en buyuk ve en kucuk sayiyi ekrana yazdiran bir code yazdirin
		
		int arr3 [] = { 2,5,1,4,3};
		Arrays.sort(arr3);
		System.out.println( "En kucuk = " +arr[0]);
		System.out.println("En buyuk = " + arr[arr.length-1]);
		
		//Bir String array olusturun alfabetik siraya bastan ve sondan 
		//ikinci elemanlari ekrana yazdirin
		
		String arr4 [] = {"Ali" , "Veli" , "Sami" , "Hakan" } ;
		Arrays.sort(arr4);		
		System.out.println("Bastan ikinci = " + arr4[1]);
		System.out.println("Sondan ikinci = " + arr4[arr4.length-2]);
		
		//Bir elemanin  array'de var olup olmadigini kontrol etmek
		
		int arr5 [] = {2,1,7,7,3,5};
		
		//arr5  array'inde 7 elemaninin var olup olmadigini kontrol ediniz
		
		//1. Yol For-Loop ile
		
		int count = 0;
		
		for (int i=0; i<arr5.length ; i++) {
			if (arr5[i] ==7) {
				count++;
			}
			
		}
		
		if(count!=0) {
			System.out.println("7 eleman olarak var");
		}else {
			System.out.println("7 eleman olarak yok");
		}
		
		//2. Yol: binarySearch() kullanarak
		  //==> a)Once kesinlikle sort() kullanmalisiniz (binarySearch kullanmak icin)
		Arrays.sort(arr5);//[1, 2, 3, 5, 7]
		  //==> b)Arardiginiz eleman array'de varsa binarySearch() size o elemainin 
		  //      index'ini verir
	    System.out.println(Arrays.binarySearch(arr5, 7));//4
	
	    /*
	      binarySearch() methodu eleman array'de var oldugunda asla negatif bir output vermez.
	      binarySearch() methodu eleman array'de yoksa negatif bir output verir.
	    */
	    System.out.println(Arrays.binarySearch(arr5, 6));
	    //-5 verir ==> "-" nin anlami yok demek 
	    //         ==> "5" in anlami; 6 eleman olarak bulunsaydi 5'inci eleman olurdu demek.
	    
	    System.out.println(Arrays.binarySearch(arr5, 4));//-4
	    System.out.println(Arrays.binarySearch(arr5, 99));//-6

	    //Note: Bir array'de tekrarli elemanlar varsa binarySearch() methodu elemanin 
	    //		var olup olmadigi hakkinda dogru karar verebilir ama elemanin sirasi hakkinda bazen yanilir
	    
	    
	    int arr6 [] = {1,3,8,3,11};
	    Arrays.sort(arr6);
	    System.out.println(Arrays.binarySearch(arr6,3));// 1 veya 2 ama kesn sonuc yok
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
