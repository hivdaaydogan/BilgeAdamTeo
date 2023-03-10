package com.hivdaaydogan;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {

//		String metin = "Merhaba nasılsın?";
//		Scanner input = new Scanner(System.in);
//		metin = input.nextLine();
//		System.out.println(metin);

		// 0 1 2 3 4 5 6 ....
		// { 'B', 'u', 'g', 'ü', 'n', ' ', 'J', 'a', 'v',....... , 'z'} => char
		// dizisi/array
		// index dizilimi 0,1,2,3, ...
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
		String tekHarf = "a"; // char[] dizi => { 'a' } => Java bunu 1 elemanlı char dizisi olarak tutar.
								// String'de mutlaka çift tırnak kullanacağız.

		// String en çok kullanılan metodları:

		// **************
		//
		// length metodu:
		// metin.length() => metnin uzunluğunu int cinsinden verir.
		int uzunluk = metin.length();
		System.out.println(uzunluk);

		// **************
		//
		// charAt metodu:
		// Belirli bir indexteki karakteri döner...
		System.out.println("0. karakter: " + metin.charAt(0));
		System.out.println("2. karakter: " + metin.charAt(2));

		// Peki bu metnin uzunluğu kaçtı? 42
		// Peki en sonuncu karaktere nasıl erişeceğiz?
		// System.out.println("42. karakter: " + metin.charAt(42)); => Hata alırsınız.
		System.out.println("Son karakter: " + metin.charAt(41)); // => Doğru
		System.out.println("Son karakter: " + metin.charAt(metin.length() - 1));

		// ***************
		//
		// indexOf metodu:
		// Find the index
		//
		// s harfi ilk nerede geçiyor? hangi indexte?
		System.out.println("s harfi ilk nerede geçiyor? :" + metin.indexOf("s"));
		System.out.println("B harfi ilk nerede geçiyor? :" + metin.indexOf("B"));
		System.out.println("b harfi ilk nerede geçiyor? :" + metin.indexOf("b")); // aradığınız karakter bulunamazsa -1
																					// döner.

		// birden fazla harf arama
		// Java kelimesi ilk nerede geçiyor?
		System.out.println("Java kelimesi ilk nerede geçiyor? : " + metin.indexOf("Java"));

		// Soru:
		// Metin string'i içinde x harfinin kullanılıp kullanılmadığını bulunuz.

		if (metin.indexOf('x') == -1) {
			System.out.println("x harfi metnin içinde yoktur");
		} else {
			System.out.println("x harfi metnin içinde vardır");
		}

		// i harfi ilk nerede geçiyor?
		System.out.println("i ilk nerede geçiyor? : " + metin.indexOf("i"));

		System.out.println("i 14. indexten sonra ilk nerede geçiyor? " + metin.indexOf("i", 14));

		// Soru:
		// i harfi cümlenin (metnin) yarısından itibaren ilk geçtiği yerin indexi nedir?
		System.out.println(
				"i metnin yarısından itibaren ilk nerede geçiyor? " + metin.indexOf("i", (metin.length() / 2)));

		// ***********
		//
		// substring
		// substring (başlangıç index, bitiş index) => başlangıç dahil - bitiş dahil
		// değil
		// Gets substring of a string
		// "Bugün Java ile string konusunu işleyeceğiz"
		System.out.println("Metnin ilk 5 karakteri: " + metin.substring(0, 5)); // 0 dahil, 5 dahil değil. 0,1,2,3,4.
																				// karakterler

		// Soru:
		// Metindeki java ifadesini substring ile çekin
		System.out.println("Java kelimesinin  geçtiği yer: " + metin.substring(6, 10));

		// Soru:
		String test = "Test 1234";
		System.out.println(test.substring(2, 7)); // Ne yazar? st 12

		// 2. Kullanım şekli:
		System.out.println(test.substring(5)); // 1234 yazar...

		// ************
		//
		// trim
		// Bir String'in başındaki ve sonundaki boşlukları(space) siler.

		String cumle = " Hello Java ";
		System.out.println(cumle);
		cumle = cumle.trim();
		System.out.println(cumle);
		// Kullanıcı adı şifre yazan uygulamalarda trim kullanmazsanız sorun
		// yaşabilirsiniz.

		// **************
		//
		// toUpperCase ve toLowerCase
		//
		// Metnin içindeki harflerin case'ini değiştirmeye yarar.
		metin = "Hello Java";
		System.out.println(metin.toLowerCase()); // hello java
		System.out.println(metin.toUpperCase()); // HELLO JAVA

		// Soru:
		// Aşağıdaki çıktıyı ekrana yazdıran bir döngü yazınız:
		/*
		 
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * * 
		 * * * * * * 
		 * * * * * * *
		 
		 */

		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		String s = "*";
		for (int i=0;i<7;i++) {
			System.out.println(s);
			s = s + " *";
		}
		
		
		//**************
		//
		// valueOf
		// converts different types of values to String
		// farklı veri tiplerini String veri tipine çevirir.
		int sayi = 2233;
		String ss = String.valueOf(sayi);
		System.out.println(ss);
		
		boolean flag = true;
		ss = String.valueOf(flag);
		System.out.println(ss);
		
		
		//**************
		//
		// equals metodu
		//
		String uname = "gsungur@test.com";  // DB'de loginname bu şekilde tutuluyor diyelim.
		
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen kullanıcı adınızı giriniz: ");
		String userName = input.nextLine();
		
		userName = userName.toLowerCase().trim();  // Kullanıcının boşluk ve büyük harf kullanma ihtimaline karşı bunu ekleriz.
		
		// Stringleri bu şekilde == ile karşılaştırma yapmayın!
//		if (userName == uname) {
//			System.out.println("Kullanıcı adı eşleşti");
//		}else {
//			System.out.println("Kullanıcı adı eşleşmedi!");
//		}
		
		if (userName.equals(uname)) {
			System.out.println("Kullanıcı adı eşleşti.");
		}else {
			System.out.println("Kullanıcı adı eşleşmedi!");
		}
		
		
		//*************
		//
		// equalsIgnoreCase metodu
		// Metin karşılaştırması yaparken küçük harf ve büyük harf ayrımını dikkkate almaz.
		
		String isim1 = "Vedat";
		String isim2 = "vedat";
		
		if (isim1.equalsIgnoreCase(isim2)) {
			System.out.println("isimler eşleşti");
		}else {
			System.out.println("isimler eşleşmedi");
		}
		
		
		//***************
		//
		// replace metodu
		String s2 = "Şahin yırtıcı bir kuştur";
		String s3 = s2.replace("Ş" , "s");
		System.out.println(s3);
		
		// Nerelerde kullanılır?
		// 1. Örnek : Kira Sözleşmesi...
		String sozlesme = "Ali Kaya Güneş sokak Çankaya mah. adresindeki evini Ayşe Naz'a kiraladı..";
		String yeniSozlesme = sozlesme.replace("Ayşe Naz", "Veli Han");
		System.out.println(yeniSozlesme);
		
		// 2. Kullanım:
		// web url'lerinde türkçe karakterlerde sorun çıkabiliyor...
		// Örn. https://www.isbasvuru.com/alikaya iş başvuru.pdf => Sıkıntı çıkar
		String dosyaAdi = "https://www.isbasvuru.com/alikaya iş başvuru.pdf";
		// Boşluk karakterini - ile değiştirin, türkçe karakterleri ingilizce ile değiştirin...
		dosyaAdi = dosyaAdi.replace(" " , "-").replace("ş", "s");
		System.out.println(dosyaAdi);
		
		
		//*************
		//
		// contains metodu:
		// Herhangi bir substringin hedef string içinde var olup olmadığını kontrol eder.
		String yeniMetin = "Hava bugün çok yağmurlu";
		System.out.println("ağ kelimesi var mı?" + yeniMetin.contains("ağ"));
		System.out.println("tağ kelimesi var mı?" + yeniMetin.contains("tağ"));
		
		if (yeniMetin.contains("yağmur")) {
			System.out.println("Hava durumunda bugün yağmur görünmüyor!");
		}else {
			System.out.println("Bugün yağmur yok");
		}
		
		
		//***************
		//
		// startsWith
		String ad = "Ali Kaya";
		System.out.println(ad.startsWith("A")); // => True
		System.out.println(ad.startsWith("Ali")); // => True
		System.out.println(ad.startsWith("li")); // => False
		String kontrol = "Al";
		System.out.println(ad.startsWith(kontrol)); // => True
		
		
		// split
		//
		// verilen ifadeye göre metni böler. [] : dizi/array simgesi
		String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";                 //  0       1       2        3        4
		String[] isimler = liste.split(","); // String dizisi yapar: { "Ali", "Burcu", "Ayşe", "Zeynep", "Kaan" }
		System.out.println(isimler[0]);
		System.out.println(isimler[2]);
		System.out.println(isimler[isimler.length-1]);

		
//		System.out.println();
//		for (int i=0;i<isimler.length;i++) {
//			System.out.println(isimler[i]);
//		}
		
		
		// Örnek:
		// Öğrencilerin listesi String olarak tutuluyor olsun. Ben bunları ayrıştırmak istiyorum:
		String ogrencilerStr = "Ali Kaya,123;Veli Öz,222;Zeynep Naz,342";
		String[] ogrenciler = ogrencilerStr.split(";"); // ogrenciler = { "Ali Kaya,123", "Veli Öz,222", "Zeynep Naz,342"}
		System.out.println(ogrenciler[0]);
		System.out.println(ogrenciler[1]);
		System.out.println(ogrenciler[ogrenciler.length - 1]);
		
		
		// Peki ilk öğrencinin okul numarasını ekrana yazalım:
		// System.out.println(ogrenciler[0].split(",")[1]);  //  { "Ali Kaya", "123" }
		// ogrenciler[0] => "Ali Kaya,123"
		String[] ogrenciBilgileri = ogrenciler[0].split(",");  //  ogrenciBilgileri => { "Ali Kaya", "123"}
		System.out.println(ogrenciBilgileri[0]);
		System.out.println(ogrenciBilgileri[1]);
		
		// Veli'nin okul numarasını yazdıralım:
		String[] ogrenciBilgileriVeli = ogrenciler[1].split(",");  // { "Veli Öz", "222"}
		System.out.println(ogrenciBilgileriVeli[1]);
		// int ogrNo = Integer.parseInt(ogrenciBilgileriVeli[1]);
		
		// Veli'nin sadece ismini yazdıralım
		String[] ogrenciBilgileriIsim = ogrenciBilgileriVeli[0].split(" ");  // { "Veli", "Öz" }
		System.out.println(ogrenciBilgileriIsim[0]);
		
		
		//
		// stringbuilder kullanımı
		//
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Merhaba");
		stringBuilder.append(" Dünya");
		stringBuilder.append(" Java");
		System.out.println(stringBuilder);
		
		
//		Scanner sc = new Scanner(System.in);
//		sb.append(sc.nextLine());
//		System.out.println(sb);
		
		
		
		// String karşılaştırma konusu detay:
		System.out.println("\n************\n");
		String x= "Ali";
		String y = "Veli";
		
		if (x==y)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
		
		String z = "Ali";
		if (x==z)
			System.out.println("Eşit");
		else 
			System.out.println("Eşit değil");
		
		String w = "Ali ".trim();
		System.out.println(w);
		if (x==w)
			System.out.println("w ve x Eşit");
		else
			System.out.println("w ve x eşit değil");
		
		
		// Çok dikkatli olmak lazım
		// String içerik karşılaştırmlarında mutlaka equals metodu kullanılmalıdır.
		// Sınavlarda / Mülakatlarda çok sorulan sorulardan biridir.
		System.out.println("\n*******\n");
		if (w.equals(x))
			System.out.println("eşit");
		else
			System.out.println("eşit değil");
		
		
			
	
		
		
		
		
		
		

	}

}
