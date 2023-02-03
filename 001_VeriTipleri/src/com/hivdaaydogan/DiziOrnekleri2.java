package com.hivdaaydogan;

import java.util.Scanner;

public class DiziOrnekleri2 {

	public static void main(String[] args) {
		
		// soru:
		// Kullanıcı bir sayı girsin bu sayının binary olup olmadığını bulan bir program yazınız.
		//
		// örnek: 10101 => Binary
		//        123 => Binary değil
		System.out.println("Lütfen bir sayı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String temp =String.valueOf(num);
		boolean sayiBinaryMi = true;
		// "10101"
		for (int i=0;i<temp.length();i++) {
			char rakam = temp.charAt(i);
			if (rakam == '1' || rakam == '0') {
				//hiçbir şey yapma
			}else { 
				sayiBinaryMi = false;
				break;
			}
		}
		if (sayiBinaryMi == true)
			System.out.println("girdiğiniz sayı binary");
		else
			System.out.println("girdiğiniz sayı binary değil");
	}

}
