package com.hivdaaydogan;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ahmet","Emre",450,0);
		Ogrenci ogrenci2 = new Ogrenci("Ali","Taş",451,0);
		Ogrenci ogrenci3 = new Ogrenci("Zeynep","Emre",452,0);
		Ogrenci ogrenci4 = new Ogrenci("Fatma","Çelikçi",453,0);
		
		Sinif sinif1 = new Sinif("1A","Zemin kat 101 Nolu oda", new ArrayList<Ogrenci>());
		sinif1.sinifaOgrenciEkle(ogrenci1);
		sinif1.sinifaOgrenciEkle(ogrenci2);
		sinif1.sinifaOgrenciEkle(ogrenci3);
		//sinif1.sinifaOgrenciEkle(ogrenci4);   ==> Encapsulation'a göre bu yöntemle eklemek gerek. 
		sinif1.getOgrencilerArrayList().add(ogrenci4);   // Bu yöntemle eklemek tavsiye edilmez. 
		
		sinif1.siniftakiOgrenciListesiYazdir();
		
		
		//
		Sinif sinif2 = new Sinif("1B","C blok 1.kat");
		Ogrenci ogrenci5 = new Ogrenci("Kaan","Emre",500,0);
		sinif2.sinifaOgrenciEkle(ogrenci5);
		sinif2.siniftakiOgrenciListesiYazdir();
		
		
		//
		Sinif sinif3 = new Sinif("1C","Ana bina 102 nolu sinif");
		Ogrenci ogrenci6 = new Ogrenci("Bartu","Emre",800,0);
		Ogrenci ogrenci7 = new Ogrenci("Nihal","Emre",801,0);
		Ogrenci ogrenci8 = new Ogrenci("Özgür","Emre",802,0);
		sinif3.sinifaOgrenciEkle(ogrenci6);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(new Ogrenci("Şafak","Taş",803,0));
		
		sinif3.siniftakiOgrenciListesiYazdir();
		sinif3.siniftanOgrenciCikar(ogrenci7);
		sinif3.siniftakiOgrenciListesiYazdir();
		
		sinif3.siniftanOgrenciCikar(8002);
		sinif3.siniftakiOgrenciListesiYazdir();
		
		sinif3.sinifaOgrenciEkle("B","Ak",900,0);
		sinif3.siniftakiOgrenciListesiYazdir();
		sinif3.sinifaOgrenciEkle("Berfin","Ak",900,0);
		sinif3.siniftakiOgrenciListesiYazdir();

	}

}
