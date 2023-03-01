package com.hivdaaydogan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	private static void listeyiIncele(List<String> list) {
		// İşlemler
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Opel");
		list.add("Audi");
		list.add("VW");
		list.add("Renault");
		System.out.println(list);
		
		// Collections sınıfı: 
		// 
		// Collections sınıfı bit UTILITY sınıfıdır. (Yani collections framework kullanırken bize yardımcı olabilecek metotları barındırır.)
		Collections.sort(list);  // => Alfabetik sıraladı.
		System.out.println();
		System.out.println(list);  
	
		Main.listeyiIncele(list);
		
		// Şimdi kendi sınıfımızdan nesneleri kullanarak listeyi dolduralım ve sıralamaya çalışalım.
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("Berk", 1050));
		ogrenciler.add(new Ogrenci("Gülsu", 900));
		ogrenciler.add(new Ogrenci("Sinem", 1025));
		ogrenciler.add(new Ogrenci("Ahmet", 1205));
		ogrenciler.add(new Ogrenci("Hivda", 750));
		
		System.out.println("\n" +ogrenciler);
		// NOT : Kendi yazdığımız sınıfları collections'daki sort metodu ile sırlatmak istiyorsak
		// yazdığımız sınıflar Comparable interface'ini implement etmeli.
		Collections.sort(ogrenciler);
		System.out.println("\n" +ogrenciler);
		
		
		// Şimdi de nesnelerimizi compare edelim
		Ogrenci ogr1 = new Ogrenci("Ali",220);
		Ogrenci ogr2 = new Ogrenci("Veli",207);
		System.out.println(ogr1.compareTo(ogr2));
		
		
		

	}

}
