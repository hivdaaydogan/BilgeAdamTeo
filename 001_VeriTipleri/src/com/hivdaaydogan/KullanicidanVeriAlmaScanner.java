package com.hivdaaydogan;

import java.util.Scanner;

public class KullanicidanVeriAlmaScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  // Scanner sınıfından nesne oluşturur bu komut. 
		                                         //system.in demek console'dan sayı almak.
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi1 = 0;
		sayi1 = input.nextInt();
		System.out.println("Girdiğiniz sayı: " + sayi1);
		
		int sayi2 = sayi1 * sayi1;
		System.out.println("Girdiğiniz sayının karesi: " + sayi2);
		
		int sayi3 = sayi1*sayi1*sayi1;
		System.out.println("Girfiğiniz sayının küpü:" + sayi3);
	}

}
