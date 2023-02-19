package com.hivdaaydogan;

public class SinifStaticDegiskenler {
	
	// javada global değişkenler yoktur.(C'de vardır)
	// bunun yerine sınıfların static değişkenlerini public yaparak kullanırsanız
	// global değişken gibi davranabilir.
	// sınıfların static değişkenleri
	//Static değişkenler program ilk çalıştırıldığında  memory2de adreslenir..



	public static final int DUNYANIN_YARICAPI = 6371; // km
	
	public static int aktifKullaniciSayisi = 0;
	
	public void staticOlmayanMetod() {
		System.out.println("static olmayan metoddan merhaba");
	}

	public static void main(String[] args) {
		
		System.out.println("aktif kullanıcı sayısı: " + SinifStaticDegiskenler.aktifKullaniciSayisi);
		SinifStaticDegiskenler.aktifKullaniciSayisi++;
		System.out.println("aktif kullanıcı sayısı: " + SinifStaticDegiskenler.aktifKullaniciSayisi);

		SinifStaticDegiskenlerTest.aktifKullaniciSayisiniArtir();
		System.out.println("aktif kullanıcı sayısı: " + SinifStaticDegiskenler.aktifKullaniciSayisi);
		
		
		
		//scope not:
		//lokal değişkenler ancak ve ancak tanımlandıktan sonra kullanılabilir
		
		int z =9;
		System.out.println(z);
		
		System.out.println(PI);
		
		//kural:
		//
		//static olmayan metodları static metodlar içinden direkt çağıramazsınız.!!!!
		//staticOlmayanMetod();   ==> hata verir
		//static olmayan metodları OOP derslerinde göreceğiz : 
		//(static olmayan metodlar nesnelere aittir, nesneler ile birlikte çağırılır.)
		//SinifStaticOlmayanDegiskenler nesne = new SinifStaticDegiskenler();
		//nesne.staticOlmayanMetos();
		
		
		}
	public static final double PI =3.14;
}
	
	
	
	
	
	
	
	


