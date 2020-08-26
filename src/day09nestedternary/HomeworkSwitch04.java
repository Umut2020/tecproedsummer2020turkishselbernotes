package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch04 {

	public static void main(String[] args) {

		/*Kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın.
			A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
			Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın. */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Doğru şıkkı giriniz");
		char cvp  = scan.next().charAt(0);
		
		switch (cvp) {
		case 'C':
			System.out.println("Doğru Cevap");
		break;
		case 'A' :
		case 'B' :
		case 'D' :
			System.out.println("Yanlış Cevap");
		break;
		default:
			System.out.println("Geçersiz şık");
		}
		
		scan.close();
		
		
	}

}
