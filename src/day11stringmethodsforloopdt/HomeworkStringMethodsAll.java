package day11stringmethodsforloopdt;

public class HomeworkStringMethodsAll {

	public static void main(String[] args) {
		
		String str = "Cat, caterpillar";
	
		/*
		System.out.println(str.indexOf("c")); //5
		System.out.println(str.indexOf("cat"));//5
		System.out.println(str.indexOf("s"));//-1
		System.out.println(str.indexOf("CAT"));//-1
		System.out.println(str.indexOf("ter"));//7
		System.out.println(str.indexOf("pars"));//-1
		System.out.println(str.indexOf("a" , 3 ));//6 ilk görünüm değilde 3. character den sonra ilk "a" kaçıncı indexte (3 dahil)
		System.out.println(str.indexOf("at", 2));//6
		System.out.println(str.indexOf("at", 8));//-1
		
		
		System.out.println(str.lastIndexOf("c"));   // 5
		System.out.println(str.lastIndexOf("cat")); //5
		System.out.println(str.lastIndexOf("s"));  // -1
		System.out.println(str.lastIndexOf("CAT")); // -1
		System.out.println(str.lastIndexOf("ter")); // 7
		System.out.println(str.lastIndexOf("pars")); //-1
		System.out.println(str.lastIndexOf("a" , 3 ));  //
		System.out.println(str.lastIndexOf("at", 2));  //
		System.out.println(str.lastIndexOf("at", 8));  // ilk 8 karakter içindeki son "at" karakterininde "a" nın indexi
		
		
		System.out.println(str.toUpperCase()); //CAT, CATERPILLAR
		System.out.println(str.toLowerCase()); //cat, caterpillar
		System.out.println(str.toUpperCase().toLowerCase()); //cat, caterpillar
		
		
		
		String strA = "Cat " ;
		System.out.println(strA.trim());//Cat
		
		String strB = " Cat";
		System.out.println(strB.trim());//Cat
		
		String strC = " Cat " ;
		System.out.println(strC.trim());//Cat
		
		
		
		
		String strA = "Cat";
		System.out.println(strA.contains("a"));//true
		
		String strB = " Cat";
		System.out.println(strB.contains(" "));//true
		
		String strC = "Cat";
		System.out.println(strC.contains(""));//true
		
		
		"Cat, caterpillar"
		
		
		System.out.println(str.substring(0));//"Cat, caterpillar"
		System.out.println(str.substring(3));//", caterpillar"   3 dahil 
		System.out.println(str.substring(4));//" caterpillar"    4 dahil
		System.out.println(str.substring(15));//r    
		System.out.println(str.substring(16));//
		System.out.println(str.substring(5,8));//"cat"
		System.out.print(str.substring(3,4));//", "	
		System.out.println(str.substring(5,5));//"" hiç bir şey alırız 
		System.out.println(str.substring(8,5));//Run Time Error
	
		
			
		System.out.println(str.startsWith("C")); //true
		System.out.println(str.startsWith("c"));//false
		System.out.println(str.startsWith("B")); //false
		System.out.println(str.startsWith("Cat"));//true
		System.out.println(str.startsWith("c",5)); // true   index 5 "c" ile başlar
		System.out.println(str.startsWith("ter",7));// true  
		System.out.println(str.startsWith("p", 11));// false
		System.out.println(str.startsWith(""));// true   
			
					
					
		System.out.println(str.endsWith("r")); // true "r" ile biter
		System.out.println(str.endsWith("C"));// false
		System.out.println(str.endsWith("")); //true 	 hiçbir şey ile biter 
		System.out.println(str.endsWith(" "));//false
		System.out.println(str.endsWith("lar")); // true
		System.out.println(str.endsWith("caterpillar")); // true
	
				
		
		String str1 = "";
		System.out.println(str1.isEmpty());// true       	Yalnızca length () 0 ise true değerini döndürür.
											//       	Döndürür: length () 0 ise true, aksi takdirde false
		String str2 = " ";
		System.out.println(str2.isEmpty());//false
		String str3 = "Almanya";
		System.out.println(str3.isEmpty());//false
	
		

		
		System.out.println(str.replace('t', 'm'));//"Cam, camerpillar"     '' char methodu kullanılabilir
		System.out.println(str.replace("t", "m"));//"Cam, camerpillar"     tüm "t" leri "m" yapar  
		System.out.println(str.replace("x", "y"));//"Cat, caterpillar"
		System.out.println(str.replace("", "|"));// ?
		System.out.println(str.replace("a", ""));// "Ct, cterpillr"
		System.out.println(str.replace("at", "amel")); // "Camel, camelerpillar"
		System.out.println(str.replace("at", "e")); //"Ce, ceerpillar"
		System.out.println(str.replaceFirst("c", "C"));//"Cat, Caterpillar"    dizedeki ilk "c" yi "C" ye çevirir.Sadece onu çevirir.  
		System.out.println(str.replaceFirst("at", "amel"));//"Camel, caterpillar
		System.out.println(str.replaceFirst("Cat, caterpillar", "Deve"));//"Deve"    */
		
		
		
		//Integer.valueOf() methodu ile String.valueOf() methodunun farkını açıklayınız.
		
		String str1 = "900";
		String str2 = "1000";
		int str3 = 900;
		int str4 = 1000;
		System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));// Integer.valueOf() sayı  değerini alır
		System.out.println(String.valueOf(str3) + String.valueOf(str4));// String.valueOf()   Concatinention
		
		
		
		
	
		
		
		
		
		
		
	}
	
	
	
	
}
