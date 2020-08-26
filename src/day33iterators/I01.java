package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		List<String> list1= new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		
		System.out.println(list1);//[X,Y,Z]
		
		//list1 icindeki her elemanin sonuna "A" harfini ekleyin
		//Loop kullanarak List'leri degistiremezsiniz.Elemanlari degistirebilirsiniz.
		for (String w : list1) {
			w=w+"A";
		}
		
		System.out.println(list1);
		
		//Bir list'i update etmek isterseniz iterator kullanmak zorundasiniz.
		
		//1.Adim: ListIterator objesi olusturun
		ListIterator<String> li1 = list1.listIterator();
		
		//2.Adim: while loop kullanin
		/*
		 1)hasNext(); pointer'a "Senden sonra eleman var mi ? diye sorar.Pointer'dan sonra eleman varsa
		 true, yoksa false cevabini alir. Cevap true ise loop bir kez daha calisir, cevap false ise loop kirilir.
		 
		 2)next(): pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
		
		 3)set() : list icindeki elemanlari degistirmeye yarar.
		 */
		
		while (li1.hasNext()) {
			Object element=li1.next();
			li1.set(element + "A");
		}
		System.out.println(list1);
		
		/*
		 String bir list olusturun
		 Her elemanin basina "K", sonuna "L" ekleyin.
		 Yeni list'i ekrana yazdirin
		 */
		
		List <String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("E");
		list2.add("U");
		
		ListIterator<String> li2 = list2.listIterator();//Pointer'li ArrayList ==>ListIterator 
		
		while (li2.hasNext()) {
			Object element = li2.next();
			li2.set("K" + element + "L");
		}
		System.out.println(list2);
		
		
		
		
	}

}
