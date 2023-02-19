package com.alikaya;

import com.hivdaaydogan.Main;

public class YardimciSinif2 {
	
	public static void main(String[] args) {
		
		YardimciSinif.hello();  // aynı paketin içinde import etmeden çağırabildik.
		
		YardimciSinif.hello2();
		
		// YardimciSinif.hello3();  => hello3() metodu private tanımlandığu için başka Class'lar içinden çağırılamaz.
		
		
		System.out.println(Main.randomNumber());  // public static veya protected static metodları başka sınıflardan 
												  // çağırırken class'ın ismini de başına yazmalıyız. 
		
		
	}
	


}
