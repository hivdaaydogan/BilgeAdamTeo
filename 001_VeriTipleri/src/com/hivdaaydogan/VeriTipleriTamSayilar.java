package com.hivdaaydogan;

public class VeriTipleriTamSayilar {   //Pascal Casing: MainProgram, KomutaKontrolSistemi...

	public static void main(String[] args) {
		
		// scope : kapsam(açılan parantez kapanır)
		
		System.out.print("Hello Java 1");
		System.out.print("Hello Java 2");
		System.out.println("Hello Java 3");
		System.out.print("Hello Java 4");
		
		System.out.println("Hello" +" " + "Java");
		
		// Değişken tanımlama ve İlkel(Primitive) Veri Tipi
		// BYTE : 1 byte
		// Byte'ın alabileceği değerlerin aralığı: -128 ile 127
		//                                         -2^7 ile -2^(7-1) 
		byte byteValue = 0;  // 1 Byte yer kaplar, local değişken
		                     // camelCasing  Ör: networkUdpPort, threadSayisi, maximumSayi...
		
		byteValue = 3;
		System.out.println(byteValue); // Bir local değişkenşn ilk değer ataması olmaksızın ekrana yazdırılmaz, kullanılmaz.
		
		byte maxURLSayisi = 100; // camelCasing'e uygun.
		
		byte ogrenciSayisi; // Doğru
		// Yanlış tanımlamalar:
		// byte ogrenci Sayisi
		// byte *ogrenciSayisi
		// byte öğrencisayısı
		// byte 1ogrenciSayisi    ogrenciSayisi1 => Doğru
		
		byteValue = 1;
		System.out.println(byteValue);
		
		// 11111111    00000000
		// ^: Sign bit
		// En soldaki bir sign biti olarak görev yapar. 
		// 0 ise pozitif sayı. Örn: 00000001 : 1    00000011 : 3   01111111 : 127
		// 10000000 : -128    10000001 : -128+1= -127   10000010 : 126   11111111 : -1
		// Byte'ın alabileceği değerlerin aralığı: -128 ile 127
		//                                         -2^7 ile -2^(7-1) 
		byteValue = 127;
		
		// SHORT : 2 byte 10000000 00000000 = -2^15
		// -2^15 ile 2^15-1
		// -32,768 ile 32,767
		short shortValue = 22;
		short shortVal1 = 30, shortVal2 = 244, shortVal = 55;
		
		// Büyük ilkel veritip = küçük ilkrl verritipi diyebiliriz, ancak tersini yapamayız
		shortValue = byteValue; // ok 
		
		// byteValue = shortValue; => Direkt olarak bu şekilde atama yapamayız casting gerekiyor...
		byteValue = (byte) shortValue;  // (byte) : casting işlemi.
		System.out.println(byteValue);
		
		// Peki shortValue 127'den büyük olsaydı ne olurdu?
		shortValue = 129; // 0000 0000   1000 0001 = 129 Ama byte için 1000 0001 = -127 anlamı ifade eder.
		                                                // Yanlış işlem yapmış oluruz.
		                                                // Dolayısıyla byte'ın alabileceği max değerler dışında kullanmalıyız.
		byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		
		// INT : 4 byte
		// -2^31 ile 2^31-1
		// -2147483648 ile 2147483647
		System.out.println(Integer.MIN_VALUE);  // Integer: Wrapper class'lar
		System.out.println(Integer.MAX_VALUE);  // Integer: Wrapper class'lar
		int intValue = 7;
		int i1,i2,i3;
		i1 = 0;
		i2 = 5;
		
		intValue = shortValue;
		// shortValue = intValue;  Bu da aynı şekilde hata verir... 
		
		// Byte Toplama
		byteValue = 12;
		byte b2;
		// b2 = byteValue + byteValue; Hata verir.. Neden?
		// Çünkü byteValue + byteValue sonucunu int'e otomatik atar 
		b2 = (byte) (byteValue + byteValue);
		System.out.println(b2);
		
		
		short sh1 = 3;
		short sh2 = 2;
		short sh3;
		// sh3 = sh1 + sh2; // => Hata alırsınız, casting lazım. Casting işlemi yaparken de java inisiyatifi bize bırakır.
		                    // Değerleri bizim kontrol etmemiz lazım toplam değer short değerini geçmemeli!
		sh3 = (short)(sh1 + sh2); // int'e kadar bu tarz hatalar alırsınız. int'ten itibaren bu tarz hatalar almazsınız.
		System.out.println("sh3:" + sh3);
				
		
		int x1 = 33;
		int x2 = 44;
		int x3;
		x3 =x1 + x2; // Sorun yok!
		System.out.println("x3:" + x3);
		
		
		// LONG : 8 byte
		// -2^63 ile 2^63-1
		System.out.println("\n\nMin Long Değeri:" + Long.MIN_VALUE);
		System.out.println("Max Long Değeri:" + Long.MAX_VALUE);
		long longValue = 7;
		System.out.println(longValue);
		
		// longValue = 9223372036854775807; bu şekilde sağ taraf int'in sınırlarını geçerse hata alırısnız!
		longValue = 9223372036854775807L;  // Sonuna L harfi kullanabiliriz, şimdi çözüldü!
		
		// Şu tarz hatalar da olabilir:
		// long myTimer = 372036854775807 * 2; => Hatalı
		// Hatayı düzeltmek için L ekleyin: 
		long myTimer = 372036854775807L * 2;
		
		// Şu tip hatalar da olabilir:
		int carpan = 10000000;
		long carpim = carpan * carpan;
		System.out.println("carpim:" + carpim); // Yanlış sonuç alırsınız.. Neden? Sağ taraftaki int sorunu burada da yaşandı.
		// Çözüm:
		// Çarğılan sayıların ilkine long tipinde bir sayı eklenirse sağ taraf long olur:
		carpim = 1L * carpan * carpan;
		System.out.println("carpim:" + carpim);
		
		
		// long altçizgi kullanımı 
		long x = 123_234_221L;   // kolay okunması için. 
		System.out.println("x:" + x);

	}

}
