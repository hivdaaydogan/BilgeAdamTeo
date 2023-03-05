package com.hivdaaydogan;

import java.util.Scanner;

public class Main1 {

	// TRY-CATCH KOD BLOGU:
			/*
			 * try {
			 * 
			 * } catch (Exception e) {
			 * 
			 * }
			 */
	
	
	public static void main(String[] args) {

		// 1. Bölüm
		// int y = 25 / 0;
		
		try {
			int y = 25 / 0;
		} catch (Exception e) {
			System.out.println("Sıfıra bölme hatası");
		}
		
		try {
			int y = 25 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme hatası");
		}
		
		
		// 2. Bölüm
		//
		System.out.println();
		int[] arr = { 1,2,3,4 };
		// System.out.println(arr[4]);   => Exception verir
		try {
			System.out.println(arr[4]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Array'in sınırı dışına çıkılma hatası");
			// Log dosyasına veya veritabanındaki log tablosuna kayıt atılır.
			e.printStackTrace();
			String logaYAzilacakMesaj = e.toString();
			System.out.println(logaYAzilacakMesaj);
		}
		System.out.println("Hoşçakal");
		
		
		// 3. Bölüm
		//
		// Birden çok exception yakalama
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bölen giriniz: ");
		int bolen = scanner.nextInt();
		
		try {
			int sayi = 25 / bolen;
			int[] array = { 1,2,3,4 };
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayin sınırları dışına çıkılıyor.");
		}catch (ArithmeticException e) {
			System.out.println("0'a bölme hatası");
		}catch (Exception e) {
			System.out.println("Tahmin edilemeyen hata oluştu");
			e.printStackTrace();
		}
		System.out.println("\nBye...");
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
