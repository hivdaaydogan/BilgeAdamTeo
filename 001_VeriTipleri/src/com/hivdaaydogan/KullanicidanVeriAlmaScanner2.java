package com.hivdaaydogan;

import java.util.Scanner;

public class KullanicidanVeriAlmaScanner2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen adınızı yazın:");
		String isim;
		isim = input.nextLine();
		//System.out.println("İsminiz: " + isim);
		
		System.out.println("Lütfen soyadınızı yazın:");
		String soyIsim;
		soyIsim = input.nextLine();
		//System.out.println("İsminiz: " + isim + " Soyadınız: " + soyIsim);
		
		System.out.println("Lütfen yaşınızı yazın:");
		int yas = input.nextInt();
		
		// DİKKAT!
		// nextInt()'den sonra eğer kullanıcıdan String değer alacaksanız araya bir boş nextLine() yazın.
		input.nextLine();
		
		System.out.println("Lütfen yaşadığınız şehri yazın:");
		String sehir;
		sehir = input.nextLine();
		System.out.println("İsminiz: " + isim + " Soyadınız: " + soyIsim + " Yaşınız: " + yas + " Yaşadığınız şehir: "+ sehir);
		
		
		

	}

}
