package com.hivdaaydogan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Okul {

	private String okulAdi;
	private String okulAdresi;
	private List<Sinif> siniflarList;
	
	
	
	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarList = new LinkedList<Sinif>();
	}

	
	// Iterator kullanmadan safe delete : 
	public void okuldanSinifCikar(String sinifAdi) {
		Sinif silinecekSinif = null;
		
		for(Sinif snf : this.siniflarList) {
			if (snf.getSinifAdi().equals(sinifAdi) ) {
				silinecekSinif = snf;
				break;
			}
		}
		if(silinecekSinif != null) {
			this.siniflarList.remove(silinecekSinif);
		}else {
			System.err.println(sinifAdi + " isimli sınıf bu okulda bulunamadı.");
		}
	}
	
	 
	// Iterators ile safe delete operation : 
	public void okuldanSinifCikarIterators(String sinifAdi) {
		Iterator<Sinif> i = this.siniflarList.iterator();
		while (i.hasNext())
		{
			Sinif snf = i.next();
			if (snf.getSinifAdi().equalsIgnoreCase(sinifAdi) ) {
				i.remove();
				break;
			}
		}
	}
	
	
	public void okuldakiOgrencileriYazdir() {
		System.out.println("\n* * * * " + this.okulAdi + " Okulundaki Öğrenciler * * * *\n");
		int sayac = 0;
		for (Sinif sinif : this.siniflarList) {
			System.out.println("\n" + sinif.getSinifAdi() + " :");
			for (Ogrenci ogrenci : sinif.getOgrencilerArrayList()) {
				System.out.println("Öğrenci adı: " + ogrenci.getAd() + " Öğrenci soyadı: " + ogrenci.getSoyad()
									+ " Okul No: " + ogrenci.getOkulNo() + " Not ortalaması: " + ogrenci.getNotOrtalamasi());
			sayac++;
			}
		}
		System.out.println("\nBu okulda " + sayac + " öğrenci vardır." );
	}
	
	
	
	public void sinifEkle(Sinif sinif) {
		this.siniflarList.add(sinif);
	}
	
	
	// Okulun içindeki siniflari yazdırır
	public void siniflariYazdir() {
		System.out.println("\n* * * " + this.okulAdi + " Okulundaki Sınıflar * * *\n");
		for(Sinif sinif : this.siniflarList) {
			System.out.println("Sınıf adı: " + sinif.getSinifAdi() + " Lokasyon: " + sinif.getLokasyon());
		}
	}
	
	
	// Parametre olarak sinifAdi girilen ve sonuçta ilgili sinif nesnesini return eden bir metot
	public Sinif getSinif(String sinifAdi) {
		for (Sinif sinif : siniflarList) {
			if (sinif.getSinifAdi().equalsIgnoreCase(sinifAdi)) {
				return sinif;
			}
		}
		return null;
	}
	
	

	public String getOkulAdi() {
		return okulAdi;
	}


	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}


	public String getOkulAdresi() {
		return okulAdresi;
	}


	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}


	public List<Sinif> getSiniflarList() {
		return siniflarList;
	}


	public void setSiniflarList(List<Sinif> siniflarList) {
		this.siniflarList = siniflarList;
	}
	
	
	
}
