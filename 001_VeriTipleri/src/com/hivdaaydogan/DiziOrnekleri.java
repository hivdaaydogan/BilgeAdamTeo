package com.hivdaaydogan;

public class DiziOrnekleri {

	public static void main(String[] args) {

		// soru:
		int[] dizi = { -4, 7, 12, 78, -32, 122, 0, 9 };
		// bu dizinin ortalamasını tam sayı cinsinden bulunuz.

		System.out.println(dizi.length);
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam = toplam + dizi[i];
		}
		System.out.println("ortalama: " + (toplam / dizi.length));

		// int eşitlerken yuvarlama yapması
		int x = 20;
		int g = x / 3;
		int y = 3;
		double v = x / (y * 1.0);
		System.out.println(v);
		
		
		// Küsüratlarla ilgili java math kütüphanesinin kullanımı:
		System.out.println(Math.round(v));
		System.out.println(Math.round(1.4));
		
		// -----------------------
		// En küçük ve en büyük sayıyı bulma problemi
		//
		
		
		// Soru
		// Bir dizi içindeki en büyük sayıyı bulunuz.
		// En büyük sayıyı bulmak için en baştaki sayısını en büyük sayı kabul edip 
		// dizi içindeki bir sonraki sayı ile kıyaslayalım.
		// eğer kıyasladığımız sayı daha büyükse en büyük sayı o olsun, değilse değişiklik yapmayalım.
		// diizdeki tüm sayıları bu şekilde kontrol edelim.
		// { -4, 7, 12, 78, -32, 122, 0, 9 };
		int enBuyukSayi = dizi[0];
		for (int i=0;i<dizi.length;i++) {
			if (enBuyukSayi < dizi[i]) {
				enBuyukSayi = dizi[i];
			}
		}
		System.out.println("Dizi içindeki en büyük sayi: "+ enBuyukSayi);
		
		
		// Soru:
		// Dizi içindeki en küçük sayıyı ve indeksini bulunuz.
		int enKucukSayi = dizi[0];
		int index = 0;
		for (int i=0;i<dizi.length;i++) {
			if (enKucukSayi > dizi[i]) {
				enKucukSayi = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizi içindeki en küçük sayi: "+ enKucukSayi +" indeksi: " + index );
		

	}

}
