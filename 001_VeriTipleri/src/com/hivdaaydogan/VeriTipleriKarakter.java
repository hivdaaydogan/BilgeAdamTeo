package com.hivdaaydogan;

public class VeriTipleriKarakter {

	public static void main(String[] args) {
		
		// char veritipi :
		// 1 Byte
		char charValue = 'A';   // ASCII Tablosundaki karşılığı: 65
		
		
		// Soru:
		char charValue2 = 65;
	
		
		// Soru:
		char charValue3 = 84;
		System.out.println(charValue3);
		
		
		
		// String veritipi:
		//
		// Ekrana bir şey yazdırmak için syso("Ali Kaya")
		// Metinleri de tıpkı sayılar gibi değişkenlerde tutabiliriz. 
		// We can have a String with the length of 2,147,483,647 characters, theoretically.
		int y = 75;
		System.out.println(y);
		
		String name = "Ali";
		String surname = "Kaya";
		System.out.println("İsim: " + name + " Soyisim: " +surname);
		String nameSurname;
		nameSurname = name + " " + surname;
		System.out.println(nameSurname);
		

	}

}
