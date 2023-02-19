package com.hivdaaydogan;

public class Kitap {
	
	// static degişken
	public static final String tur = "Kitap";
	
	// Sınıf üye değişkenleri:
	public String ad;
	public int sayfaSayisi;
	public String yazarAdi;
	public int stokMiktari;
	
	public String kitapBilgileriniGetir() {
		String kitapBilgileri = "Ad: " + ad + " Yazar: " + yazarAdi + " Sayfa sayisi: " + sayfaSayisi 
				                + " Stok: " + stokMiktari +  " Tür: "+ Kitap.tur;
		return kitapBilgileri;
	}

}
