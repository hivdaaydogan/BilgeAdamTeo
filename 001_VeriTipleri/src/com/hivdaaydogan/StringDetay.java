package com.hivdaaydogan;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {


//		String metin = "Merhaba nasılsın?";
//		Scanner input = new Scanner(System.in);
//		metin = input.nextLine();
//		System.out.println(metin);
		
		//    0    1    2    3    4    5    6 ....
		// { 'B', 'u', 'g', 'ü', 'n', ' ', 'J', 'a', 'v',....... , 'z'} => char dizisi/array
		// index dizilimi 0,1,2,3, ...
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
		String tekHarf = "a";   // char[] dizi => { 'a' } => Java bunu 1 elemanlı char dizisi olarak tutar.
		                        // String'de mutlaka çift tırnak kullanacağız.
		
		// String en çok kullanılan metodları:
		
		// length metodu:
		// metin.length() => metnin uzunluğunu int cinsinden verir.
		int uzunluk = metin.length();
		System.out.println(uzunluk);
		
		// charAt metodu:
		// Belirli bir indexteki karakteri döner...
		System.out.println("0. karakter: " + metin.charAt(0));
		System.out.println("2. karakter: " + metin.charAt(2));
		
		
		// Peki bu metnin uzunluğu kaçtı? 42
		// Peki en sonuncu karaktere nasıl erişeceğiz?
		// System.out.println("42. karakter: " + metin.charAt(42)); => Hata alırsınız.
		System.out.println("Son karakter: " + metin.charAt(41));  // => Doğru
		System.out.println("Son karakter: " + metin.charAt(metin.length()-1));
		
		
		// indexOf metodu:
		// Find the index
		//
		// s harfi ilk nerede geçiyor? hangi indexte?
		System.out.println("s harfi ilk nerede geçiyor? :" + metin.indexOf("s"));
		System.out.println("B harfi ilk nerede geçiyor? :" + metin.indexOf("B"));
		System.out.println("b harfi ilk nerede geçiyor? :" + metin.indexOf("b")); //aradığınız karakter bulunamazsa -1 döner.
		
		// birden fazla harf arama
		// Java kelimesi ilk nerede geçiyor?
		System.out.println("Java kelimesi ilk nerede geçiyor? : " + metin.indexOf("Java"));
		
		
		
		
		
		
		

	}

}