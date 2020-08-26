package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gün yazınız");
		String gun = scan.next();
	
		/*
		 * Scanner scan = new Scanner(System.in);
		System.out.println("Gun numarasini giriniz");
		int day = scan.nextInt();
		
		switch(day) {
			case 1:
				System.out.println("Pazar");
				break;
			case 2:
				System.out.println("Pazartesi");
				break;
			case 3:
				System.out.println("Sali");
				break;
			case 4:
				System.out.println("Carsamba");
				break;
			case 5:
				System.out.println("Persembe");
				break;
			case 6:
				System.out.println("Cuma");
				break;
			case 7:
				System.out.println("Cumartesi");
				break;
			default:
				System.out.println("Gecerli gun sayisi giriniz");	
		 */
		
		
		
		
		
		switch (gun) {
			case "Pazar":
				System.out.println("1. gün");
				break;
			case "Pazartesi":
				System.out.println("2. gün");
				break;
			case "Salı":
				System.out.println("3. gün");
				break;
			case "Çarşamba":
				System.out.println("4. gün");
				break;
			case "Perşembe":
				System.out.println("5. gün");
				break;
			case "Cuma":
				System.out.println("6. gün");
				break;
			case "Cumartesi":
				System.out.println("7. gün");
				break;
			default:
				System.out.println("Böyle bir güng yok");
		}
		
		
		
		scan.close();
		
		
		
	}

}

