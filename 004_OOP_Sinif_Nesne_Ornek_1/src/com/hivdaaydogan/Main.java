package com.hivdaaydogan;

public class Main {

	public static void main(String[] args) {
		
		Kitap kitap1;
		kitap1 = new Kitap();   //new kelimesi ile memory'de yer tahsis edilir.
		kitap1.ad = "İnce Memed";
		kitap1.sayfaSayisi = 450;
		kitap1.yazarAdi = "Yaşar Kemal";
		kitap1.stokMiktari = 500;
		System.out.println(kitap1.ad + " " + kitap1.sayfaSayisi);
		
		kitap1.sayfaSayisi = 452;
		System.out.println(kitap1.ad + " " + kitap1.sayfaSayisi);
		System.out.println();
		
		Kitap kitap2 = new Kitap();
		kitap2.ad = "Kaşağı";
		kitap2.sayfaSayisi = 50;
		kitap2.yazarAdi = "Ömer Seyfettin";
		kitap2.stokMiktari = 80;
		kitap2.kitapBilgileriniGetir();
		System.out.println(kitap2.kitapBilgileriniGetir());
		
		System.out.println(kitap1.kitapBilgileriniGetir());
		
		
		// Şimdi de puzzle nesneleri oluşturalım.
		Puzzle ravensBurgerEyfel = new Puzzle();
		ravensBurgerEyfel.ad = "Eyfel Kulesi";
		ravensBurgerEyfel.marka = "RavensBurger";
		ravensBurgerEyfel.parcaSayisi = 1000;
		ravensBurgerEyfel.stokMiktari = 300;
		System.out.println(ravensBurgerEyfel.puzzleBilgileriniGetir());
		
		
		Kitap kitap3;
		kitap3 = kitap2;
		System.out.println(kitap3.ad);
		kitap3.sayfaSayisi = 75;
		System.out.println(kitap3.sayfaSayisi);
		
		System.out.println(kitap2.sayfaSayisi);
		
		kitap2 = new Kitap();
		kitap2.ad = "880 günde devrialem";
		kitap2.sayfaSayisi = 150;
		kitap2.yazarAdi = "Jules Verne";
		kitap2.stokMiktari = 220;
		
		System.out.println(kitap2.kitapBilgileriniGetir());
		
		
		

	}

}
