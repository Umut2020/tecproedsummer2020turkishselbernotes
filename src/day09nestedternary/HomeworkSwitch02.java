package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch02 {

	public static void main(String[] args) {
			/*Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın.
			99 ise ekrana “İki basamaklı en büyük sayı” yazdırın.
			999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
			Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
			 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		int s = scan.nextInt();
		
		
		switch (s) {
			case 9:
				System.out.println("Bir basamaklı en büyük sayı");
			break;
			case 99:
				System.out.println("İki basamaklı en büyük sayı");
			break;
			case 999:
				System.out.println("Üç basamaklı en büyük sayı");
			break;
			default:
				System.out.println("Yorum yok");
		}
		
		
		scan.close();
		
	}

}
