package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]
		
		ListIterator<String> li1 = list1.listIterator();
		
		//while loop'un icindeki next() methodunu kullanmazsaniz pointer hareket etmez ve sonsuz dongu olusur.
		//List'teki elk iki elemani siliniz.
		while (li1.hasNext()) {
			Object element = li1.next();
			li1.remove();
			if (element.equals("X")) {
				break;
			}
			
			}
		//tum elemanlari silme
				while (li1.hasNext()) {
					Object element = li1.next();//Object element = : bu kisim olmasa da kod calisir.
												//Cunku element zaten kullanilmiyor
					li1.remove();
					
					}
				System.out.println(list1);//[]
				
				//oder list1.clear();
				//System.out.println(list1); aynisini yapiyor
		
		
		
		
		//Bir String list olusturun ve tum elemanlari "XXX" e donusturun
		List<String> list2= new ArrayList<>();
		list2.add("AB");
		list2.add("CD");
		list2.add("EF");
		System.out.println(list2);
		
		ListIterator<String> li2 = list2.listIterator();
		
		while (li2.hasNext()) { 
			String el = li2.next();//Object dememizin nedeni her seyi kapsiyor ama bazen method kullanmak icin 
									//direkt ismi yazabiliriz...(burasi onemli)
			
			li2.set(el.replace(el,"XXX"));
			//oder ==> li2.set("XXX");
		}
		
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
