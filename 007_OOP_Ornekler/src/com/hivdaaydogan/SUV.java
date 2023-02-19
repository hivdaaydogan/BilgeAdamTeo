package com.hivdaaydogan;

public class SUV {
	
	public String marka;   // String nesneleri null olarak initialize edilir.
	public String model;   // String nesneleri null olarak initialize edilir.
	public int yil;        // Sayısal veri tipleri 0 olarak initialize edilir.
	public int aracinKm;   // Sayısal veri tipleri 0 olarak initialize edilir.
	public String cekisSistemi;
	public Motor motor;    // Otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişke olarak tutuyorum  

	public void bilgileriEkranaYaz() {
		System.out.println("Marka: " + this.marka + " model: " + this.model + " yıl: "+ this.yil 
				           + " aracın km : " + this.aracinKm + " çekiş sistemi: " + this.cekisSistemi);
		this.motor.motorBilgileriniYazdir(); 
	}


}
