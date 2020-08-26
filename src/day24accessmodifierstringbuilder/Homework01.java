package day24accessmodifierstringbuilder;

public class Homework01 {

	public static void main(String[] args) {
		
		//Bir tane String builder olusturalim
		
		//1. yol
		
		StringBuilder sb1 = new StringBuilder ();// Bos bir StringBuilder olusturduk
		
		//2. Yol
		
		StringBuilder sb2 = new StringBuilder(3);
		
		
		//3. Yol
		 StringBuilder sb3 =new StringBuilder("Umut Gungor");
		 
		
		 //substring
		 System.out.println( sb3.substring(2,6));//ut G
		 System.out.println( sb3.substring(6));//ungor
		 
		 //indexOf
		  System.out.println(sb3.indexOf("G"));//5
		  
		 //length
		 System.out.println(sb3.length());//11
		 
		 //charAt
		 System.out.println(sb3.charAt(5));//G
		 
		 //append (ekleme)
		 
		 sb3.append(" GS");
		  System.out.println(sb3);//Umut Gungor GS
		 sb3.append(" Sampiyon").append(" Olamadi"); 
		  System.out.println(sb3);//Umut Gungor GS Sampiyon Olamadi
		 
		  //insert
		  sb3.insert( sb3.length() ," mi ?");
		  System.out.println(sb3);//Umut Gungor GS Sampiyon Olamadi mi ?
		  
		  //delete 
		  sb3.delete(0, 5);//5. index'i almiyor
		  System.out.println(sb3);//Gungor GS Sampiyon Olamadi mi ?
		  
		  //deleteCharAt();
		  sb3.deleteCharAt(sb3.length()-1);
		  System.out.println(sb3);// "?"  yok olur
		  
		  //reverse 
		  sb3.reverse();//tersten yazma
		  System.out.println(sb3);// im idamalO noyipmaS SG rognuG
		  
		  
		  StringBuilder sb4 = new StringBuilder("13468sd4fsdnaon ansdo");
		  sb4.toString();
		  System.out.println(sb4);///?????????????
		  
		  sb3.substring(3);

		  System.out.println(sb3);

		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		 		

	}

}
