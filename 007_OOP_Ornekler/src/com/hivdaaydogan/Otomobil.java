package com.hivdaaydogan;

public class Otomobil {
	
	public static String ARAC_TIPI = "Kara Aracı";
	
	// Üye Özellikler
	// Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği nesneye ait özellikler
	public String marka;   // String nesneleri null olarak initialize edilir.
	public String model;   // String nesneleri null olarak initialize edilir.
	public int yil;        // Sayısal veri tipleri 0 olarak initialize edilir.
	public int aracinKm;   // Sayısal veri tipleri 0 olarak initialize edilir.
	public Motor motor;    // Otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişke olarak tutuyorum
	
	public void bilgileriEkranaYaz() {
		System.out.println("marka: "+this.marka+" model: "+this.model+" yıl: "+this.yil+" km: "+this.aracinKm);
		this.motor.motorBilgileriniYazdir();
		// yukarıdaki ile aynı işi yapar:
		//System.out.println("motor hacmi"+this.motor.motorHacmi+ "saseno"+this.motor.saseNo+....);
		System.out.println();
	}
	
	public void araciSur(int km) {
		System.out.println("araç "+km+ " km. yol yapıyor...");
		this.aracinKm = this.aracinKm +km; 
	}
	
	public void aracYilBilgisiDegistir(int yil) {
		//yil = yil; // ??? ambiguity : kafa karışıklığı oluştu. 
		this.yil = yil; // => Ok  this ile ambiguity (kafa karışıklığı) giderilmiş olur. 
	}
	

}
