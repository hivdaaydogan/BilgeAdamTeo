package com.hivdaaydogan;

import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int x = input.nextInt();
		
		// Kullanııcının girdiği sayı pozitif, negatif veya sıfır olduğunu bulan bir kod yazalım.
		if (x > 0) {
			System.out.println("Girilen sayı pozitiftir!");
		}
		else if (x < 0) {
			System.out.println("Girilen sayı negatiftir!");
		}
		else if (x == 0) {
			System.out.println("Girilen sayı sıfırdır!");
		}
				

	}

}
