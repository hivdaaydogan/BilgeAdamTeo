package com.hivdaaydogan;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnekSoru1 {
	// rastgele 7'nin katı olan 10 tane tamsayı üreten ve ekrana yazdıran bir metod
	// yazınız.
	// üst limiti parametre olarak kullanıcıdan alın.
	
	

	// Yasin'in çözümü:
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("üst limit giriniz: ");
//	int ustLimit = scanner.nextInt();
//	
//	rastgeleKati(ustLimit);
//
//}
//
//private static void rastgeleKati(int ustLimit) {
//	Random random = new Random();
//	for (int i = 0; i < 10;) {
//		int sayi = random.nextInt(7,ustLimit);
//		if (sayi %7==0) {
//			
//			System.out.println((i+1) + ". sayı " + sayi);
//			i++;
//		}
//	}	
//}
	
	
	//hocanın çözümü:
	public static void randomNumber7() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("üst limit giriniz: ");
	int ustLimit = scanner.nextInt();
	Random random = new Random();
	for (int i=0;i<10;i++) {
		int result = 1;
		do {
			result = random.nextInt(ustLimit);
		} while ((result%7) !=0);
		System.out.println("sayı " + i + " : " + result);
	}
	}
	
	public static void main(String[] args) {

		randomNumber7();

	}
}
