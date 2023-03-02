package com.hivdaaydogan.controller;

import java.util.Scanner;

import com.hivdaaydogan.repository.OgretmenRepository;
import com.hivdaaydogan.repository.entity.Ogrenci;
import com.hivdaaydogan.repository.entity.Ogretmen;

public class OgretmenController {

	private OgretmenRepository ogretmenRepository;
	
	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository();
	}
	
	public void ogretmenEkleme() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklenecek öğretmen adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Eklenecek öğretmen soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Eklenecek öğretmen TCKimlikNo giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = new Ogretmen(id, adi, soyadi);
		
		this.ogretmenRepository.save(ogretmen);
		
	}

	public void ogretmenSil() {
		System.out.println("Silinecek öğretmenin TCKimlikno'sunu giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogretmenRepository.delete(id);
		
	}

	public void ogretmenGuncelle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Güncellenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		System.out.println("Güncellenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		System.out.println("Güncellenecek öğretmenin TCKimlikno giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = new Ogretmen(id, adi, soyadi);
		this.ogretmenRepository.update(ogretmen);
		
	}

	public void ogretmenBul() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgilerini görüntülemek istediğiniz öğretmenin TCKimlik numarasını giriniz: ");
		int id = scanner.nextInt();
		Ogretmen ogretmen = this.ogretmenRepository.findById(id);
		System.out.println("\nBilgilerini görmek istediğiniz öğretmen: ");
		System.out.println(ogretmen);
	}

	public void ogretmenListesiniGoster() {
		System.out.println("**************************");
		System.out.println("*                                    *");
		System.out.println("*    ÖGRETMEN LİSTESİ      *");
		System.out.println("*                                    *");
		System.out.println("**************************");
		for(Ogretmen ogr: this.ogretmenRepository.findall()) {
			System.out.println(ogr);
		}
		
	}

	
	
	
	
}
