package day05incrementdecrement;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
	
	/* 0.)Sayıları kullanıcıdan alın
	 * 1.)İki tane integer variable oluşturun a=5 ve b=3
	 * 2.)Sonra bu integer ların değerlerinin yerlerini değiştirin (swap) yani;a=3 ve b=5  
	 */
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Birinci sayıyı giriniz");
	int s1 =scan.nextInt();
	
	System.out.println("İkinci sayıyı giriniz");
	int s2 =scan.nextInt();
	
	System.out.println(s1 + " " + s2);
	
	int bos =0; //"0" değerinin önemi yok
	bos =s1; // 1. hamle 
	s1  =s2;//2. hamle
	s2  =bos;//3. hamle
	
	System.out.println(s1 +  " " + bos + " " + s2 );
	
	scan.close();
	
	
	
	}

}
