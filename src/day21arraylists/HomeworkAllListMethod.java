package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkAllListMethod {

	public static void main(String[] args) {
	
		/*isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.
		 */
		//3.YolArrayList oluştur
		List<String> sl2 = new ArrayList();
		
		sl2.add("A"); sl2.add("C");		sl2.add("E");		sl2.add("F");
		
		sl2.add("B");		sl2.add(1, "L");	sl2.set(3,"D");		sl2.remove(4);
	
		Collections.sort(sl2);		Collections.reverse(sl2);
		

		System.out.println(sl2.contains("L"));//true
		System.out.println(sl2.contains("M"));//false
		System.out.println(sl2.size());//5
		
		sl2.clear();
		System.out.println(sl2);//[]
		
		System.out.println(sl2.isEmpty());//true
		
	
	
	
	}
}
