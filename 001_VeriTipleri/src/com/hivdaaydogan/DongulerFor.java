package com.hivdaaydogan;

import java.util.Scanner;

public class DongulerFor {

	public static void main(String[] args) {
		
		System.out.println("Merhaba 0");
		System.out.println("Merhaba 1");
		System.out.println("Merhaba 2");
		System.out.println("Merhaba 3");
		
		// Bir şeyi n kere yazdıracaksam kaç kere saydığımı kontrol edebilmek için bir değişkene ihtiyacım var.
		// 0 değişken de genelde for döngülerinde i veya j isminde tutulur/kullanılır. size kalmış...
		
		// for loop - for döngüsü
		for (int i=0;i<4;i++) {
			System.out.println("Merhaba " + i);
		}
		
		for (int sayac=0;sayac<3;sayac++) {
			System.out.println("Merhaba");
			System.out.println("Java");
		}
		
		
		// int i; //ambiguity => Döngülerde kullandığınız sayac degisken isimlerini kod içinde kullanmamaya çalışın.
		System.out.println("\n\n*********");
		
		
		// Soru
		for (int i=0;i<3;i++); // Hiçbir işe yaramayan bir döngü oldu!

		
		for (int i=0;i<3;i++)  // Parantez kullanılmadığı için sadece merhaba'yı üç kez yazar, dünya döngü dışında.
			System.out.println("Merhaba");
		
		System.out.println("Dünya");
		
		
//		int x = 5;           // Küme parantezi kullanılmazsa yalnızca bir satır için işlemi yapar 
//		if (x > 1) {         //sonraki satır döngü dışında kalır.
//			System.out.println("1'den büyük");
//		System.out.println("0'dan da büyük");
//		}

//		// Sonsuz döngü
//		for (;;) {
//			System.out.println("Merhaba");
//			System.out.println("Java");
//		}
		
		
//		// for (int i=0;i<5;i++)
//		// Aşağıdaki kod çalışır ama tavsiye edilmez:
//		int i = 0;
//		for (;i<5;) {
//			System.out.println("Hello " + i);
//			i++;
//		}
		
		
		// Örnek:
		// 1'den 10'a kadar olan sayıların toplamını for ile bulalım:
		int toplam = 0;  // Toplam değişkenini tanımladım ve 0'ı ilk değer olarak atadım (initailize ettim)
		for (int i=1;i<=10;i++) {
			toplam = toplam + i;
		}
		System.out.println("Toplam: " + toplam);
		
		
		// Soru:
		// 1'den 10'a kadar olan tüm tek sayıları ekrana yazdıran program
		for (int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		
		
		
		// Soru:
		// Ekrana aşağıdaki şekli çizdiren döngü içeren kodu yazınız:
		// * * * *
		// * * * *
		// * * * *
		
		for (int i=1;i<=12;i++) {
			System.out.print("* ");
			if (i%4==0) {
				System.out.println();
			}
		}
		
		// Soru:
		// Aşağıdaki kodu çalıştırınca kaç kere test yazar?
		// Bu şekilde for döngüsü içinde index'i değiştirmek tavsiye edilmez.
		// Eğer kod bloğu içinde indexi(sayacı) değiştirmeniz gereken durumlar oluyorsa "while" veya "do while"
		// döngüleri kullanınız.
		for (int i=0;i<11;i++) {
			i=10;
			System.out.println("test");
		}
		
		
		
		// Soru:
		// Kullanıcıddan iki tane sayı alın.
		// Başlangıç ve bitiş sayilari arasında 7'ye bölünebilen sayıları ekrana yazdırın.
		Scanner input= new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int x = input.nextInt();
		System.out.println("Lütfen bir sayı giriniz: ");
		int y = input.nextInt();
		for (int i=x; i<y; i++) {
			if (i%7==0) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
