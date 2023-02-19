package com.hivdaaydogan;

public class VarArgsKullanimi {
	
	
	
	public static void toplaVarArgs(int... sayilar) {
		int toplam =0;    //yukardaki metodun parametre kısmında sayazan sayilar bir dizi gibi davranır.
		for (int i=0; i<sayilar.length;i++) {
			toplam += sayilar[i];
		}
		System.out.println("toplam: " + toplam);
		
		//yukardaki örneği for each ile yapalım
		int toplamForEach =0;
		for(int eleman : sayilar) {
			toplamForEach += eleman;
		}
		System.out.println(toplamForEach);
	}
	
	
	public static void ekranaYazdir(String...isimler) {
		for(String isim : isimler) {
			System.out.println(isim);
		}
	}
	public static void main(String[] args) {
		
		toplaVarArgs(1,2,3,4,5,7,3);
		ekranaYazdir("ali", "kaan", "zeynep");

	}
}
