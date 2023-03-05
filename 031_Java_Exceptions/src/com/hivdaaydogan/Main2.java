package com.hivdaaydogan;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 4. Bölüm
		//
		// Birden çok exception yakalama
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bölen giriniz: ");
		int bolen = scanner.nextInt();

		String s = null;
		
		try {
			int sayi = 25 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayin sınırları dışına çıkılıyor.");
		} catch (ArithmeticException e) {
			System.out.println("0'a bölme hatası");
		} catch (Exception e) {
			System.out.println("Tahmin edilemeyen hata oluştu");
			e.printStackTrace();
		}
		System.out.println("\nBye...");

	}

}
