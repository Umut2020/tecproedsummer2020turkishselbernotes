package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch03 {

	public static void main(String[] args) {
		
		/*Kullanıcıdan ay ismi alın eğer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
			Eğer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
			Eğer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
			Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
			
			HAZİRAN Eylül Kasım
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Ay ismi giriniz");
		String ay = scan.next(); // nextLine() methoduna gerek yok zaten tek kelime alacağız
		
		switch (ay) {
			case "Nisan":
			case "Haziran":
			case "Eylül" :
			case "Kasım" :
				System.out.println("Bu ay 30 gündür");
			break;
			case "Aralık" : 
			case "Ocak"   :
			case "Mart"   :
			case  "Mayıs" :
			case "Temmuz" :
			case "Agustos":
			case "Ekim"   :
				System.out.println("Bu ay 31 gündür");
			break;
			case "Şubat" :
				System.out.println("Bu ay Şubat ayıdır");
			break;
			default:
				System.out.println("Geçersiz ay ismi");
		}
		
		scan.close();
		
		
	}
	
	
}
