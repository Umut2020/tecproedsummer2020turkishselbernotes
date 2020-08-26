package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		
		
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);//21:21:35.309 ===> nanosecond
		
		// Zamanda ileri nasil gidilir?
		System.out.println(lt.plusMinutes(7));
		System.out.println(lt.plusHours(6));
		
		//Zamanda nasil geri gidilir?
		System.out.println(lt.minusSeconds(11));
		
		//Time formati nasil degistirilir?
		//hh==>12'lik sistem kullanir.  HH==> 24'luk sistem kullanir
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf1.format(lt));//09:30
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf2.format(lt));//21:30
		
		//Farkli ulkelerde yerel saati nasil yazdirabilirim?
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Zurich")));
		
		
		
		
		
		
		
		
		
	}

}
