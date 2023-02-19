package com.hivdaaydogan;

// SINIF : CLASS (TASARIM)
public class Anahtar {
	// Sınıf Değişken
	// Static özellikler nesneye özgü değil sınıfa özgüdür(sınıfa ait ortak özellik gibi düşünülebilir) 
	// sadece bir tane tutulur her bir nesne için ayrı bir değer tutulmaz.
	public static final int uzunluk=10;
	
	// Özellik / üye değişken
	public String renk;
	public int no;
	public String ad;
	
	// Static üye metod
	public static void uzunluguEkranaYaz() {
		System.out.println(Anahtar.uzunluk);  // şu şekilde de yazılabilirdi: System.out.println(uzunluk);
		
		// static metodla içinde static olmayan değişkenler kullanılmaz!
		// System.out.println(renk);  ==> hata verir çünkü renk static olmayan bir üye özellik
	}
	
	
	
	// non-static (static olmayan) bir üye metod:
	public void bilgileriEkranaYaz() {
		System.out.println("No: "+ no+ " Ad: "+ ad+ " Renk: "+ renk);
	}
	

}
