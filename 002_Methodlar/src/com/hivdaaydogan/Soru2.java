package com.hivdaaydogan;

public class Soru2 {
	
	public static int fonks() {
		int x = 34;
		int y = 97;
		int sayac = 0;
		for (int i = x; i <= y; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
				sayac++;
			}
		}
		return sayac;
	}

//************************************************************************************************************************************	
	public static int fonks1() {
		int x = 34;
		int y = 97;
		int sayac = 0;
		for (int i = x; i <= y; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
				sayac++;
			}
		}
		return sayac;
	}

//***********************************************************************************************************************************	
	public static int[] fonks2(int sayi1, int sayi2) {

		int sayac = 0;
		int toplam = 0;
		for (int i = sayi1; i <= sayi2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
				toplam += i;
				sayac++;
			}
		}
		System.out.println();
		int[] sonuclarDizisi = new int[2];
		sonuclarDizisi[0] = sayac;
		sonuclarDizisi[1] = toplam;
		return sonuclarDizisi;
	}
	//***********************************************************************************************************************************	
		public static int[] fonks3(int[] sayilar) {

			int sayac = 0;
			int toplam = 0;
			for (int i =sayilar[0]; i <= sayilar[1]; i++) {
				
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.print(sayilar[i] + " ");
					toplam += i;
					sayac++;
				}
			}
			System.out.println();
			int[] sonuclarDizisi = new int[2];
			sonuclarDizisi[0] = sayac;
			sonuclarDizisi[1] = toplam;
			return sonuclarDizisi;
		}

	public static void main(String[] args) {
		// soru1:
		// 34 ile 97 arasında (34 ve 97 dahil) 3'e veya 5'e bölünebilen tüm sayıları
		// yazdıran bir metod yazalım:
		// metod bu aralıktaki 3'e veya 5'e bölünebilen kaç tane olduğu return etsin.
		System.out.println("\n34 ile 97 arasında 3 veya 5'e bölünebilen sayı adedi: " + fonks());

		// soru2:
		// 34 ile 97 arasında (34 ve 97 dahil) 3'e veya 5'e bölünebilen tüm sayıları
		// yazdıran bir metod yazalım:
		// metod bu aralıktaki 3'e veya 5'e bölünebilen kaç tane olduğu return etsin.
		System.out.println("\n34 ile 97 arasında 3 ve 5'e bölünebilen sayı adedi: " + fonks1());

		// soru3:
		// 34 ile 97 arasında (34 ve 97 dahil) 3'e veya 5'e bölünebilen tüm sayıları
		// yazdıran bir metod yazalım:
		// ve sayıları toplasın
		int[] dizi;
		dizi = Soru2.fonks2(34,97);
		System.out.println("\nsoru cevap");
		for (int sayi : dizi) {
			System.out.println(sayi);
		}
		
		//soru 4:
		//inputları bir dizi olarak parametre halinde alınız.
		int[] dizi2;
		int[] aralikDizisi = {34,97};
		dizi2 = Soru2.fonks3(aralikDizisi);
		System.out.println("\nsoru cevap");
		for (int sayi : dizi2) {
			System.out.println(sayi);
		}
	}

}
