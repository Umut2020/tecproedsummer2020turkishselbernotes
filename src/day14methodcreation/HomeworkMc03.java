package day14methodcreation;

import java.util.Scanner;

public class HomeworkMc03 {

	public static void main(String[] args) {
		
		//Aşağıdaki soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız.
		/* Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
			yazdıran bir program yazın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int a=scan.nextInt();
		scan.close();
		rakamlariToplami(a);

		}
			public static void rakamlariToplami(int a) {
			int n=1;
			int sum=0;
			do {
				sum=sum+(a/n)%10;
				n=n*10;
			}while((a/n)>=1);
			System.out.println(sum);			
		}

}
