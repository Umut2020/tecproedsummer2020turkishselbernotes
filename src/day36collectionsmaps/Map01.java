package day36collectionsmaps;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm01 = new HashMap<>();
		hm01.put(100, "Ali");
		hm01.put(101, "Emine");
		hm01.put(102, "Veli");
		hm01.put(103, "Ayse");
		System.out.println(hm01);//Siralamayi karisik yapar
		
		//Ayni key degeri ile ikinci defa "put()" kullanirsaniz ustune yazar.
		hm01.put(102,"XXXX");
		
		//Ayni value ama key farkli ise ekleme yapar, ayni value tekrarli olarak kullanilabilir
		hm01.put(104, "XXXX");
		
		//"key" null kabul eder mi? Cevap: Kabul eder ama sadece 1 tane null kabul eder
		//"key" kullanirsaniz ustune yazar
		hm01.put(null, "YYYY");
		
		//HashMap value olarak "null" kabul eder mi?
		//Cevap: HashMap value olarak 1'den fazla "null" kabul eder.
		hm01.put(105, null);
		hm01.put(106, null);
		hm01.put(107, null);
		
		System.out.println(hm01);
		
		hm01.containsKey(102);//true 
		hm01.containsValue("Selim");//false
		
		//Map'lerde herhangi bir elemanin "value"sunu almak icin "get()" methodu "key" parametresi ile kullanilir. 
		hm01.get(101);//Emine
		
		System.out.println(hm01.getOrDefault(101, "Oyle bir isim yok"));//Emine
		System.out.println(hm01.getOrDefault(11, "Oyle bir isim yok"));//Oyle bir isim yok
		
		System.out.println(hm01.keySet());//butun key'leri siralar ==> Collection'lardaki "Set" tipi
		
		System.out.println(hm01.values());//tum value'lari gosterir==> Collections
		
		//putIfAbsent(108, "Katip"); method'u MAp'a bakar; map'de key olarak 108 yoksa "Katip"i ekler 
		//108 varsa "Kemal"i eklemez
		hm01.putIfAbsent(108, "Katip");
		hm01.putIfAbsent(108, "Muharrem");
		System.out.println(hm01);
		
		hm01.remove(null); //key'i "null" olan elemani remove eder
		System.out.println(hm01);
		
		//iki sarta gore silme yapar
		hm01.remove(103,"Ayse");//key 103 e gelir "Ayse" ise siler
		System.out.println(hm01);
		hm01.remove(102,"Van");
		System.out.println(hm01);
		
		//replace(102, "Mustafa"); ile put(102, "Mustafa"); ayni seyi yapar
		hm01.replace(102, "Mustafa");
		System.out.println(hm01);
		
		hm01.replace(105, null ,"Jackson");//key 105'e git null ise "Jackson" yap 
		System.out.println(hm01);
		
		System.out.println(hm01.size());//8
		
		
		
		
		
		
		
		
		

	}

}
