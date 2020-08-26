package day03variables;

import java.util.Scanner;

public class ScannerOdev {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Tam isminizi giriniz.");
		String tamIsım = scan.nextLine();
		System.out.println(tamIsım);
		
	
		System.out.println("Yaşınızı giriniz");
		int yasAlma = scan.nextInt();
		System.out.println(yasAlma);
		
		//data type int ise; nextInt() methodunu kullanıyoruz.
		
		System.out.println("İsminizin İlk Harfini Giriniz");
		//nextChar() methodu yok bu yüzden next().charAt(0);
		
		char ilkHarf =scan.next().charAt(0);
		System.out.println(ilkHarf);
		
	 System.out.println("Çocuk Sayınızı Giriniz");
	 byte cocukSayısı = scan.nextByte();
	 System.out.println(cocukSayısı);
	 
	 scan.close();
	 
	}

}
