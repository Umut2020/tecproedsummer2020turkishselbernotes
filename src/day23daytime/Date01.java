package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {
		/*
		 	1) Anlik tarihi almak
		 	2) Tarihi ilerletmek veya geriletmek 
		 	3) Tarihi farkli formatlarda yazmak
		 */
	
	
	
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();//LocalDate class'ini kullandik. Import ettik.
		System.out.println(ld); //2020-07-21
		
		//X gun, ay ,yil  sonrasinin tarihi ekrana nasil yazdirilir? (ileri tarihler)
		System.out.println(ld.plusDays(275));//2021-04-22
		System.out.println(ld.plusMonths(3));//2020-10-21
		System.out.println(ld.plusYears(1));//2021-07-21
		
		
		//X gun, ay ,yil  oncesinin tarihi ekrana nasil yazdirilir? (gecmis tarihler)
		System.out.println(ld.minusDays(12));//2020-07-09
		System.out.println(ld.minusMonths(6));//2020-01-21
		System.out.println(ld.minusYears(12));//2008-07-21
		
		//Tarihi nasil farkli formatta yazdirabiliriz?
		// MM==>Kacinci ay  MMM==>Ayin ilk 3 harfi  MMMM==>Ayin isminin tamami
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(ld));//21/07/2020
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf1.format(ld));//21/Jul/2020
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf2.format(ld));//21/July/2020
		System.out.println(dtf2.format(ld.plusMonths(2)));//21/September/2020
		
		//d==>10 dan kucuk gunler icin tek rakam basar ama 10 ve yukarisi icin yazdirir
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d/MMMM/yyyy");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
