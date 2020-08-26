package day05incrementdecrement;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
	
		// Kullanıcıdan 3 basamaklı bir sayı alınız.
		//Bu sayının rakamları toplamını ekrana yazdırınız.
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Üç basamaklı bir sayı giriniz");
		
		int s =scan.nextInt();

		int sonRakam  = s%10;
		
		int ortaRakam = (s/10)%10;
		
		int ilkRakam  = (s/100)%10;
		
		
		System.out.println(sonRakam + ortaRakam + ilkRakam);
		
		scan.close();
		
 		

	}

}

