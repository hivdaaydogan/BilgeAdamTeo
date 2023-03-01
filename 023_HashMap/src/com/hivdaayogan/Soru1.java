package com.hivdaayogan;

import java.util.HashMap;

public class Soru1 {
//* * * * * * * * * * Çözüm * * * * * * * * * * *
//	public static void harfSayisiniBul(String metin) {
//		// İpucu : HashMap kullanabilirsiniz.
//		// İpucu => Key : Karakter  -> Value : Karakterin tekrar sayısını (count) tutabilirsiniz 
//		HashMap<Character, Integer> hashmap = new HashMap<>();
//	    for (int i = 0; i < metin.length(); i++) {
//	        if(!hashmap.containsKey(metin.charAt(i))) {
//	        	hashmap.put(metin.charAt(i),1); 
//	        } else {
//	            int count= hashmap.get(metin.charAt(i));
//	            hashmap.put(metin.charAt(i),count+1);
//	        }    
//	    }
//	    System.out.println(metin);
//	    System.out.println(hashmap);
//		}
//	
//	public static void enCokTekrarEdenHarfiBul(String metin) {
//		// İpucu : HashMap kullanabilirsiniz.
//		// İpucu => Key : Karakter  -> Value : Karakterin tekrar sayısını (count) tutabilirsiniz 
//		HashMap<Character, Integer> hashmap = new HashMap<>();
//		char c = 0;
//		int max = 0;
//	    for (int i = 0; i < metin.length(); i++) {
//	        if(!hashmap.containsKey(metin.charAt(i))) {
//	        	hashmap.put(metin.charAt(i),1); 
//	        } else {
//	        	int tekrarSayisi = hashmap.get(metin)+1;
//	        	if (tekrarSayisi > max) {
//	        		c = metin.charAt(i);
//	        		max = tekrarSayisi;
//	        	}
//	        	
//	            int count= hashmap.get(metin.charAt(i));
//	            hashmap.put(metin.charAt(i),count+1);
//	        }    
//	    }
//	    System.out.println(metin);
//	    System.out.println(hashmap);
//	    System.out.println("en çok tekrar eden karakter: " + c +" tekrarSayisi : "+ max);
//		}
	

	// * * * * * * * * * Hocanın çözümü * * * * * * * * * * * *
	public static void harfSayisiniBul(String metin) {
		// İpucu : HashMap kullanabilirsiniz.
		// İpucu => Key : Karakter    ->     Value : Karaketrin tekrar sayısını (count) tutabilirsiniz.
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for (int i=0;i<metin.length();i++) 
		{
			char ch = metin.charAt(i);
			
			if (hashMap.containsKey(ch))   // Karakter hasMap'te mevcut ise bu kod bloğuna girer.
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			} 
			else  // Karakter hashMap'te mevcut dğeilse bu kod bloğuna girer
			{
				hashMap.put(ch, 1);				
			}
		}
				
		System.out.println(hashMap);
	}

	public static void enCokTekrarEdenHarfiBul(String metin) {
		// İpucu : HashMap kullanabilirsiniz.
		// İpucu => Key : Karakter    ->     Value : Karaketrin tekrar sayısını (count) tutabilirsiniz.
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char encokTekrarEdenKarakter = 0;
		int max = 0;
		
		for (int i=0;i<metin.length();i++) 
		{
			char ch = metin.charAt(i);
			
			if (hashMap.containsKey(ch))   // Karakter hasMap'te mevcut ise bu kod bloğuna girer.
			{
				int tekrarSayisi = hashMap.get(ch)+1;
				
				if (tekrarSayisi > max) 
				{
					encokTekrarEdenKarakter = ch;
					max = tekrarSayisi;
				}
				
				hashMap.put(ch, hashMap.get(ch)+1);
			} 
			else  // Karakter hashMap'te mevcut dğeilse bu kod bloğuna girer
			{
				hashMap.put(ch, 1);				
			}
		}
		
		System.out.println(hashMap);
		System.out.println("En cok tekrar eden karakter : " + encokTekrarEdenKarakter + "  tekrar sayısı: " + max);
	}
	
public static void main(String[] args) {
		// Static bir metot yazın
		// Bir string içindeki karakterlerin sayısını bulan ve ekrana yazdıran bir metot yazınız.
		String metin = "Hello";  // H:1 e:1 l:2 o:1
		Soru1.harfSayisiniBul(metin);
		
		// En çok tekrar eden harfi bulunuz  ve tekrar sayısını bulunuz
		Soru1.enCokTekrarEdenHarfiBul(metin);
}
	

	
		
	
}
