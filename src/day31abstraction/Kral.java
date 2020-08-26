package day31abstraction;

public class Kral extends Otel {

	public static void main(String[] args) {
		
		Kral krl = new Kral();
		
		krl.cay();
		krl.kahvalti();
		krl.wifi();
		//static olmayan methodlar obje ile kullanilir. Static olanlar main'de objesiz kullanilabilir.
	}

	@Override
	public void kahvalti() {
		System.out.println("Insan gibi ye!");
		
	}

	@Override
	public void cay() {
	 System.out.println("Cay ic iyidir...");
	}

	
	
}
