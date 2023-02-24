package com.hivdaaydogan;

import java.util.ArrayList;

public class Sinif {

	private String sinifAdi;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrencilerArrayList;
	
	
	public Sinif(String sinifAdi, String lokasyon, ArrayList<Ogrenci> ogrencilerArrayList) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = ogrencilerArrayList;
	}

	
	
	
	public Sinif(String sinifAdi, String lokasyon) {
		super();
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		this.ogrencilerArrayList = new ArrayList<>();
	}

	// Gelen nesne referansına sahip öğrencinin silinmesi
	public void siniftanOgrenciCikar(Ogrenci ogr) {
		this.ogrencilerArrayList.remove(ogr);
	}

	// OkulNo parametresine göre siniftan öğrenci silinmesi 
	public void siniftanOgrenciCikar(int okulNo) {
		Ogrenci silinecekOgrenci = null;
		
		for(Ogrenci ogr : this.ogrencilerArrayList) {
			if (ogr.getOkulNo() == okulNo) {
				silinecekOgrenci = ogr;
				break;
			}
		}
		if(silinecekOgrenci != null) {
			this.ogrencilerArrayList.remove(silinecekOgrenci);
		}else {
			System.err.println(okulNo + " numaralı öğrenci bu sınıfta bulunamadı.");
		}
	}
	
	

	public void sinifaOgrenciEkle(Ogrenci ogrenci) {
		this.ogrencilerArrayList.add(ogrenci);
	}
	
	// metod overloading
	public void sinifaOgrenciEkle(String ad, String soyad, int okulNo, int notOrtalamasi) {
		if (ad.length()<2 || soyad.length()<2){
			System.err.println("Ad veya soyad 2 karakterden küçük olamaz! Öğrenci sınıfa eklenemedi.");
		}else {
			this.ogrencilerArrayList.add(new Ogrenci(ad, soyad, okulNo, notOrtalamasi));
		}
	}
	
	
	public void siniftakiOgrenciListesiYazdir() {
		System.out.println("\n* * * " + this.sinifAdi + " sınıfındaki Öğenci Listesi * * *\n");
		for(Ogrenci ogrenci : this.ogrencilerArrayList) {
			System.out.println(ogrenci);
		}
	}
	

	public String getSinifAdi() {
		return sinifAdi;
	}


	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}


	public String getLokasyon() {
		return lokasyon;
	}


	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}


	public ArrayList<Ogrenci> getOgrencilerArrayList() {
		return ogrencilerArrayList;
	}


	public void setOgrencilerArrayList(ArrayList<Ogrenci> ogrencilerArrayList) {
		this.ogrencilerArrayList = ogrencilerArrayList;
	}





	
	
	
}
