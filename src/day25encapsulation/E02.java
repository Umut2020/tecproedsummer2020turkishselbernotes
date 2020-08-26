package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj =new E01();
		System.out.println(obj.getSifre());//1234
		System.out.println(obj.getIsim());// Ali Can
		System.out.println(obj.getKilo());//2.5
	
		obj.setSifre(987654);
		System.out.println(obj.getSifre());//987654
	
		obj.setKilo(84.5);
		System.out.println(obj.getKilo());
	
		
		obj.setIsim("Umut Gungor");// burada degistirme methodunu uyguladik
		System.out.println(obj.getIsim());// burada okuma methodunu kullandik.Baska classtaki methodu obj ile getirdik.
		System.out.println();

	
		E03 obj2 =new E03();
		System.out.println(obj2.getIsim());//Kemal Dogru
		System.out.println(obj2.getYas());//23
	
		obj2.setBorc(235.25f);//borc degistirildi ama okuyamiyorum cunku getter yok
		
		obj2.setYas((byte) 25);
		
		
		
		
		
		
		
	
	}

}
