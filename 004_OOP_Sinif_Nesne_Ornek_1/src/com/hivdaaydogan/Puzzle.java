package com.hivdaaydogan;

public class Puzzle {

	// static degişken
	public static final String tur = "Oyuncak";
	
	// Sınıf üye değişkenleri:
	public String ad;
	public String marka;
	public int parcaSayisi;
	public int stokMiktari;
	
	public String puzzleBilgileriniGetir() {
		String metin = "ad: " + ad +" Marka: "+marka+" Parça sayisi: "+parcaSayisi+" Stok: "+stokMiktari
			        + " Tür: "+ Puzzle.tur;
		return metin;
	}
	
}
