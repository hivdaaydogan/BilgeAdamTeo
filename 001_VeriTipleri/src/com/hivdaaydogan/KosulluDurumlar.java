package com.hivdaaydogan;

import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int x = input.nextInt();

		// Kullanııcının girdiği sayı pozitif, negatif veya sıfır olduğunu bulan bir kod
		// yazalım.
//		if (x > 0) {
//			System.out.println("Girilen sayı pozitiftir!");
//		}
//		else if (x < 0) {
//			System.out.println("Girilen sayı negatiftir!");
//		}
//		else if (x == 0) {
//			System.out.println("Girilen sayı sıfırdır!");
//		}

//		// Örnek Soru
//		// Girilen bir sayının 10'un katı olup olmadığını bulunuz.
//		if (x % 10 == 0) {
//			System.out.println("Girdiğiniz sayı 10'a kalansız bölünür.");
//		}
//		// else if (x % 10 != 0) {
//		// (x% 10 == 0) koşulu yanlış ise her durumda sadece else bloğunun içine mutlaka girer.
//		else {
//			System.out.println("Girdiğiniz sayı 10'la kalansız bölünemez.");
//		}

//		// Örnek Soru
//		// Otomobil yaşına göre vergi dilimi hesaplama
//		// 0-5 : En yüksek vergi dilimi (0 ve 5 dahil)
//		// 5-10 : Orta vergi dilimi (10 dahil)
//		// 10 : En düşük vergi dilimi
//		if (x >= 0 && x <= 5) {
//			System.out.println("En yüksek vergi dilimindesiniz.");
//		}
//		else if (x > 5 && x <= 10) {
//			System.out.println("Orta vergi dilimindesiniz.");
//		}
//		else if (x > 10) {  // Burada sadece else kullansak da olur.
//			System.out.println("En düşük vergi dilimindesiniz.");
//		}

		// x kullanıcının girdiği işlem olsun.
		// 1: toplama, 2: çıkarma, 3: çarpma, 4: bölme, Diğer her şey için yanlış seçim.
//		if (x == 1) {
//			System.out.println("işlem toplama");
//		}
//		else if (x == 2) {
//			System.out.println("işlem çıkarma");
//		}
//		else if (x == 3) {
//			System.out.println("işlem çarpma");
//		}
//		else if (x == 4) {
//			System.out.println("işlem bölme");
//		}
//		else {
//			System.out.println("yanlış seçim");
//		}

//		switch (x) {
//		case 1:
//			System.out.println("Toplama işlemi");
//			break;
//		case 2:
//			System.out.println("Çıkarma işlemi");
//        break;
//		case 3:
//			System.out.println("Çarpma işlemi");
//		break;
//		case 4: 
//			System.out.println("Bölme işlemi");
//		break;
//		default:
//			System.out.println("Yanlış seçim");
//			break;
//		}

		// Örnek
		//
		// Kullanıcının girdiği sayıya göre ilgili mevsimi ekrana yazdırın.
		switch (x) {
		case 12, 1, 2:
			System.out.println("Kış");
			break;
		case 3, 4, 5:
			System.out.println("İlkbahar");
			break;
		case 6, 7, 8:
			System.out.println("Yaz");
			break;
		case 9, 10, 11:
			System.out.println("Sonbahar");
			break;
		default:
			System.out.println("Girdiğiniz değer 1-12 arasında değil.");
			break;
		}

	}

}
