package day03variables;

import java.util.Scanner; // java.util library den import edildi

	
public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		//Scanner class ismi (büyük harfle başladığı için)
		// Scanner classı içinde (variableslar ve methodlar) var
		//1. ADIM
		//scan=objecktdir.
		//javada object oluşturmak için yukarıdaki gibi new yazılır. Sonra class ismi (Scanner) yazılır.Sonra () parantez yazılır.
		//Bazen içine yukarıda olduğu gibi yazılır bazen yazılmaz.
				
		System.out.println("Tam isminizi giriniz");//2.ADIM Kullanıcıdan talepte bulunma
        //Kullanicidan String almak icin next() veya nextLine() method'lari kullanilir.
		//next() kullanirsaniz kullanicinin girdigi sadece ilk kelimeyi alabilirsiniz.
		//nextLine() method kullanirsaniz kullanicinin girdigi herseyi alirsiniz
	    //Java Library  kütüphanesi java.util
				
		String tamIsim = scan.nextLine();//3. ADIM kullanıcıdan isim istediğimiz için String data tipini kullandık.
										// Scanner classının içindeki method ve variable ları görmek için scanden sonra "." basın
				System.out.println(tamIsim);

				 //scan.close (); yazılırsa 'sarı çizgilerin kaybolması için' kitabı kapatmak için java.utile iade işimiz bittikten sonra.(app ın iyi ve hızlı çalışmasını engeleler)
				
				scan.close();
				

}
	
}
