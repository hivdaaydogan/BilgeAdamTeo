package com.hivdaaydogan;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// ilk anahtar nesnemizi oluşturuyoruz.
		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk = "Mavi";
		anahtar1.ad = "Benim anahtarım";
		anahtar1.no = 10;
		
		
		System.out.println("ad: "+anahtar1.ad + " renk: "+ anahtar1.renk+ " no: "+ anahtar1.no + " uzunluk: " + anahtar1.uzunluk);
		
		// 2. bir anahtar nesnesi oluşturalım
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk = "Kırmızı";
		anahtar2.ad = "Kardeşimin anahtarı";
		anahtar2.no = 12;
		System.out.println("ad: "+anahtar2.ad + " renk: "+ anahtar2.renk+ " no: "+ anahtar2.no + " uzunluk: " + anahtar2.uzunluk);
		
		// 3. bir anahtar nesnesi oluşturalım
		Anahtar anahtar3 = new Anahtar();
		anahtar3.renk = "Yeşil";
		anahtar3.ad = "Deponun anahtarı";
		anahtar3.no = 15;
		System.out.println("ad: "+anahtar3.ad + " renk: "+ anahtar3.renk+ " no: "+ anahtar3.no+ " uzunluk: " + anahtar3.uzunluk);
		
		
		
		anahtar2.renk = "Sarı";
		System.out.println("ad: "+anahtar2.ad + " renk: "+ anahtar2.renk+ " no: "+ anahtar2.no + " uzunluk: " + anahtar2.uzunluk);
		System.out.println("\n******\n");
		
		// Static bir metodu kullanırken sınıf adı. metod adı yazılır
		Anahtar.uzunluguEkranaYaz();
		
		// non-static bir metod kullanırken nesne adı.metod adı yazılır.
		anahtar1.bilgileriEkranaYaz();
		anahtar2.bilgileriEkranaYaz();
		
		// peki şöyle yazılabilir mi?
		// Anahtar.bilgileriEkranaYaz();  ==> hata verir, çünkü bilgileriEkranaYaz() metodu 
		                                    // static olmadığı için sınıf adı ile çağırılamaz. Nesne adı ile çağırılabilir.
		
		
		// Nesnelerden oluşan diziler
		//
		int[] sayilarDizisi = {2,5,9,12};
		System.out.println(sayilarDizisi[0]);
		for (int i=0;i<sayilarDizisi.length;i++) {
			System.out.println(sayilarDizisi[i]);
		}
		
		
		Anahtar[] anahtarDizisi = {anahtar1,anahtar2,anahtar3};
		for (int i=0;i<anahtarDizisi.length;i++) {
			System.out.println(anahtarDizisi[i].ad + " " + anahtarDizisi[i].no+ " "+ anahtarDizisi[i].renk);
		}
		
		
		System.out.println();
		// yukarıdaki satırı metod kullanarak daha kolay yazabiliriz.
		for (int i=0;i<anahtarDizisi.length;i++) {
			anahtarDizisi[i].bilgileriEkranaYaz();
		}
		
		System.out.println();
		// Yukarıdakileri for each ile yazdıralım:
		for(Anahtar anahtar : anahtarDizisi) {
			anahtar.bilgileriEkranaYaz();
		}
		
		
		Anahtar anahtar4 = new Anahtar();
		Random random = new Random();
		int randomSayi = random.nextInt();
		int randomSayi2 = random.nextInt();
		
		
	}

}
