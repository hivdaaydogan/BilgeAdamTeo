package com.hivdaaydogan;

import java.util.Random;
import java.util.Scanner;

import com.alikaya.YardimciSinif;

public class Main {

	// Metodlar - Fonksiyonlar
	// OOP dışındaki tüm metodlar static.
	
	// Access Modifier(erişim belirleyici) :
	// public : Bütün package'lar kullanılabilir.
	// protected : Sadece aynı package içi kullanım sağlar
	// private : Sadece sınıf içi kullanım sağlar.

	
	// static => (zorunlu değil) static metodların hepsi program çalışır çalışmaz adreslenir ve değişmez.
	// static olmasa idi adres, nesne oluşunca oluşacaktı.
	
	//final => (zorunlu değil) : metodun başında final yazılırsa o metod override edilemez demektir. (OOP'de göreceğiz.)
	//final keyword'ü class'ın başına gelirse, o sınıftan yeni sınıf türetilemez.. (inheritance edilemez)
	//final'ı en çok değişkenlerde kullanırız, mesela:
	
	final static double PI =3.14; //pi değerini değiştiremezsiniz anlamına gelir.
	final static int DUNYA_YARICAP = 40000;
	
	// Return type: => Zorunludur. Hiçbir şey return etmeyecekse (döndürmeyecekse) void yazılmalıdır.
	// hello: metod ismi yazılmak zorundadır.
	// Parantezler içine isterseniz parametre(ler) yazabilirsiniz. (opsiyonel)
	// Aşağıdaki hello() örneğinde parametre yok.
	// {} : metodun içeriğini (code body) süslü parantezlerin içine yazmamız gerekir.
	
	
	public static final void hello() { // void: değer döndürmüyorsa
		System.out.println("Hello from the other side :)");
	}

	//örnek metod:
	//
	//bir sayının karesini hesaplayıp return etsin
	// parametreli metod
	// parametre değişkenlerinin yaşam alanı (scope) sadece tanımlandığı metod içindedir.
	private static int kareAl(int sayi) {
		int sonuc = sayi * sayi;  // mesela burda sonuc değişkeni int tipinde lokal bir değişken
		return sonuc;				// lokal değişkenlerin scope'u tanımlandığı metod içindedir sadece.
	}
	
	//örnek metod:
	//
	//random sayı üreten bir metod yazalım.
	public static int randomNumber() {
		Random random = new Random();
		int result = random.nextInt(101);
		return result;
	}
	
	//örnek metod:
	//
	// peki üst limiti parametre olarak alan ve üst limite kadar random bir sayı üreten bir metod yazalım.
	// eğer, metodun içinde üst limit değiştirmek yerine
	//üst limiti kodu çalıştırırken belirlemek istiyorsak böyle yazarız.
	// Method OVERLOADING : metod aşırı yüklenmesi
	public static int randomNumber(int ustLimit) {
		Random random = new Random();
		int result = random.nextInt(ustLimit);
		return result; 
	}
	
	// aynı metoda tekrar ****public static int randomNumber(int uLimit)**** diye parametre koymaya çalışırsan duplicate hatası alırsın.
	//çünkü bir metod aynı şekilde iki kez overload edilirse, çağırdığında hangisini alacağını bilemez.
	// ama farklı tipte, mesela string, overload edebilirsin.
	
	// aşağıdaki işlem de yanlış. parametrenin ismi değişti diye overloading olmadı.
//	public static int randomNumber(int ustL) {
//		Random random = new Random();
//		int result = random.nextInt(ustL);
//		return result; 
//	}
	
	
	// kullanıcının girdiği alt ve üst limitler arasında randm bir sayı üretip return eden bir metod yazınız.
	private static int randomNumberV3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen alt limit giriniz: ");  //300
		int altLimit =scanner.nextInt();
		System.out.println("lütfen bir üst limit giriniz: "); //1000
		int ustLimit = scanner.nextInt();
		Random random = new Random();
		// 1. çözüm:
		//int sonuc = random.nextInt(altLimit, ustLimit);
		//2. çözüm:
		int sonuc = random.nextInt(ustLimit - altLimit) + altLimit; //((0-700) arasında random bir sayı +300)
		return sonuc;
	}
	
	public static void main(String[] args) {

		System.out.println("Merhaba");

		Main.hello(); //aynı class içindeki static metodları çağırmak için uzun uzun paket ismi veya
		//sınıf ismi yazmak zorunlu değildir. 
		//ama farklı paketler için yazmak zorundayız.
		//ya da package import etmek gerekiyor.
		
		YardimciSinif.hello();  //sadece class çağırınca hata veriyor.
		// import ediyoruz hata gidiyor.
		
		com.alikaya.YardimciSinif.hello(); // Bir static metodu çağırırken; package adı => class adı => metod adı yazılır.
		

		// eğer YardimciSinif içindeki hello() metodu private veya protected olsaydı		
		//o zaman çağıramazdık.
		
		int matSonuc = Main.kareAl(5); //static fonksiyonları çağırırken, aynı class'ın içinde çağırıyorsak sadece fonk ismi yeter.
		System.out.println("sayının karesi: " + matSonuc);   //amaaaaa farklı classta çağırıyorsak, 
															//"metodunbulunduğuclassınismi.fonkismi" şeklinde çağırmalıyız.
		
		System.out.println("random sayı: " + randomNumber());
		
	//	System.out.println("random sayı: " + result);  ==> metodun içindeki result değişkenini main metodunun içinde yazdıramıyoruz.
	// çünkü metodun içindeki değişken, lokal değşken.
		
		int randomSayi3 = Main.randomNumber();
		System.out.println("random sayı: " + randomSayi3); // ===> metodu çağırıp yeni değişkene atayıp, o değişkeni yazdırabiliriz.
		
		// eğer, metodun içinde üst limit değiştirmek yerine
		//üst limiti kodu çalıştırırken belirlemek istiyorsak böyle yazarız.
		System.out.println("random sayı version2: " + randomNumber(1000));
		
	//	DUNYA_YARICAP =200; => final bir değişken hiçbir zaman değiştirilemez, her zaman ilk değeri kullanılır.
		// bir lokal değişkenin scope'u tanımlandığı süslü parantezler içindedir.
		{
			int x2 = 5;
			System.out.println("x2: " + x2);
		}
		// system.out.println(x2); çalışmaz.
		
		//soru:
		//
		// kullanıcının girdiği alt ve üst limitler arasında randm bir sayı üretip return eden bir metod yazınız.
		
		System.out.println(randomNumberV3());
		
		
		//soru:
		// main içinde kullanıcıdan bir string ve bu stringin tekrarlanma sayısını (tamsayı) alın.
		//aldığınız bu iki değeri tekrarla isimli bir metoda gönderin, metod gönderdiğiniz metni tekrar sayısı kadar
		//ekrana yazsın.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen kelimeyi giriniz: ");
		String kelime = scanner.nextLine();
		System.out.println("lütfen tekrar sayısını giriniz: ");
		int tekrarSayisi = scanner.nextInt();
		metniTekrarla(kelime , tekrarSayisi);  //bunu yazdıktan sonra hatadan çift tıklayıp metodu otomatik oluşturudk. main'in dışına oluşturuyor.
		
	}

	private static void metniTekrarla(String kelime, int tekrarSayisi) {
		
		for (int i =0; i<tekrarSayisi; i++) {
			System.out.println(kelime);
		}
		
	}

}
