package day11stringmethodsforloopdt;

public class StringMethods03 {

	public static void main(String[] args) { 
		
		// 11. starsWith() methodu ilk characteri kontrol eder
		String a = "Hadi gidelim bu diyardan" ;
	 
		System.out.println(a.startsWith("H"));//true
		System.out.println(a.startsWith(""));//true
		System.out.println(a.startsWith("Hadi"));//true
		
		System.out.println(a.startsWith("g", 5)); // index 5 "g" harfi ile mi başlıyor		
		System.out.println(a.startsWith("", 7 )); // index  boşlukla başlıyor :)
		System.out.println(a.startsWith("Hadi", 0)); // eğer doğruysa "H" nin indexine yazar
		
		
		
		
		
		
		
		// 12. methods   indexOf() methodu soldan sağa doğru giderken ilk görünümün indexini verir. H==> 0  0 dan başlıyor
		System.out.println(a.indexOf("i"));  // 3 
		System.out.println(a.indexOf('d'));  // 2    indexOf() methodunda hem String hem char kullanılabilir
		System.out.println(a.indexOf("deli")); //  "deli" nin ilk harfinin indexini ekrana yazdırır.
		System.out.println(a.indexOf("x"));    // olmayan bir character için indexOf() kullanırsanız  java -1 return eder.
		System.out.println(a.indexOf("diyer")); // çoklu character için indexOf() kullanırsanız  java -1 return eder.
		System.out.println(a.indexOf(""));  // 0 
		System.out.println(a.indexOf("d", 4 ));  //7   ilk görünüm değilde 4. character den sonra ilk "d" kaçıncı indexte (4 dahil)
		System.out.println(a.indexOf("a", 9)); //19 
		System.out.println(a.indexOf('e', 8) ); // 8
		
		
		
		
		
		
		//13. lastIndex0f() methodu son gorunumun index'ini verir.
		// Birden fazla character kullanırsanız son görünümü bulur onun içindeki character'lerden ilkinin index'ini return eder
		String b = "Java ah Java!" ;
		System.out.println(b.lastIndexOf("v")); //10
		System.out.println(b.lastIndexOf("av")); //9
		
		
		
		
		
		
		
		//14. substring() bir String'in belli bir bölümünü kesip almaya yarar(ÖNEMLİ)(ÇOK KULLANILIR)
		String c = "Karakartal";
		//Sadece kartal kelimesini ekrana yazdırın
		System.out.println(c.substring(4));
		//Sadece "arakartal" yazdırın
		System.out.println(c.substring(1));
		//Ekrana sadece "kar" yazdırın
		//substirng() methodunda iki sayı kullanırsanız ilk sayı dahil ikinci sayı hariç olur
		System.out.println(c.substring(4, 7)); //4. 5. 6. indexler yazılır

		System.out.println(c.substring(2,2)); // ""   başlangıç ve bitiş indexlerini aynı yaparsanız hiçbir sey almış olursunuz
		//System.out.println(c.substring(5, 3)); // substirng() methodunda başlangıç indexi bitiş index inden büyük olamaz 
												// olursa RUN TİME ERROR alırsınız.
		
		
		
		
		
		
		
		
		
		//15. trim() methodu bir String'in bas ve son taraflarındaki space'leri siler.
		// Dikkat: Aradakileri değil sadece baş ve sondakileri siler
		
		String d = "  Java iyidir  " ;
		System.out.println(d.length());//16
		System.out.println(d.trim().length());//11
		
		
		
		
		
		
	}

}
