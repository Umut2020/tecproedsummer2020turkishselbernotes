package day34collections;

import java.util.LinkedList;
import java.util.List;

public class Li01 {

	public static void main(String[] args) {
		//LinkedList elemanlari giris sirasina gore siralar.Das heisst "insertion order".
		LinkedList<String> linkedList = new LinkedList<>();//List'in basina Child class yazilabilir
		linkedList.add("Veli");
		linkedList.add("Aliye"); 
		linkedList.add("Burhan"); 
		linkedList.add("Canan"); 
		linkedList.add("Kemal"); 
		linkedList.add("Reyhane"); 
		System.out.println(linkedList);
		
		LinkedList<String> linkedList2 = new LinkedList<>();//List'in basina Child class yazilabilir
		linkedList2.add("XXXX");
		linkedList2.add("YYYY"); 
		linkedList2.add("ZZZZ"); 
		System.out.println(linkedList2);
		
		linkedList.add(1,"Cemal");
		System.out.println(linkedList);
		
		linkedList.addFirst("Kayahan");
		System.out.println(linkedList);
		
		linkedList.addLast("Ayse");// add'den farki daha hizli calisir.
		System.out.println(linkedList);
	
		//addAll() kullandiginizda ilk list degisir, parantezin icindeki list degismez
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);
	
		
		linkedList.addAll(5, linkedList2);
		System.out.println(linkedList);
		
		linkedList.remove();//ilk elemani siler
		
		linkedList.remove(1);//Index'i 1 olan elemani siler
		
		linkedList.remove("Canan");//Canan'i siler. Olmayan elemani sil dersek error vermez ve silme yapamaz.
		
		linkedList.remove("YYYYY");//Tekrarli elemanlardan ilkini siler
		System.out.println(linkedList);
		
		linkedList.removeFirstOccurrence("ZZZZ");//FirstOccurrence==>ilk gorunum 
		System.out.println(linkedList);
		
		linkedList.removeLastOccurrence("XXXX");//son gorunum
		System.out.println(linkedList);
		
		System.out.println(linkedList);//[Veli, Aliye, Burhan, XXXX, YYYY, ZZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZZ]
		linkedList.removeAll(linkedList2);//linkedList2'de var olan elemanlarin tamamini list'den siler.
		System.out.println(linkedList);//[Veli, Aliye, Burhan, Kemal, Reyhane, Ayse]
		
		linkedList.removeFirst();//ilk elemani siler
		System.out.println(linkedList);
		linkedList.removeLast();//son elemani siler
		System.out.println(linkedList);
		
		//Test Case; Product'larin  arasinda ayakkabi disinda urun olmasin
		linkedList.removeIf(t->t.contains("a"));
		System.out.println(linkedList);
		
		}
}
