package com.hivdaaydogan;

public class Otomobil {
	
	public static String ARAC_TIPI = "Kara Aracı";
	
	// Üye Özellikler
	// Otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği nesneye ait özellikler
	private String marka;   // String nesneleri null olarak initialize edilir.
	private String model;   // String nesneleri null olarak initialize edilir.
	private int yil;        // Sayısal veri tipleri 0 olarak initialize edilir.
	private int aracinKm;   // Sayısal veri tipleri 0 olarak initialize edilir.
	private Motor motor;    // Otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişke olarak tutuyorum
	private int depodakiYakit;
	private final int depoHacmi;
	
	


	// Parametre : Bir metodun parantez içinde aldığı değişkenlere denir. 
	public Otomobil (String marka, String model, int yil, int aracinKm, Motor motor,int depoHacmi) {
		this.setAracinKm(aracinKm);
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);
		this.setMotor(motor);
		this.depoHacmi = depoHacmi;
		this.depodakiYakit = 0;
	}
	
	public Otomobil(String marka, String model, int yil, int aracinKm, int motorHacmi, String saseNo, int yakitTuketimi,int depoHacmi) {
		this.setAracinKm(aracinKm);
		this.setMarka(marka);
		this.setModel(model);
		this.setYil(yil);
		this.motor = new Motor(motorHacmi,saseNo,yakitTuketimi);
		// Aşağıdaki gibi de doğru olur.
		// this.setMotor(new Motor(motorHacmi,saseNo,yakitTuketimi));
		this.depoHacmi = depoHacmi;
		this.depodakiYakit = 0;
	}

	

	public int getDepodakiYakit() {
		return depodakiYakit;
	}

	public void setDepodakiYakit(int depodakiYakit) {
		this.depodakiYakit = depodakiYakit;
	}

	public int getDepoHacmi() {
		return depoHacmi;
	}


	public void araciSur(int km) {
		System.out.println("araç "+km+ " km. yol yapıyor...");
		this.aracinKm = this.aracinKm +km; 
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getYil() {
		return yil;
	}



	public void setYil(int yil) {
		this.yil = yil;
	}



	public int getAracinKm() {
		return aracinKm;
	}



	public void setAracinKm(int aracinKm) {
		this.aracinKm = aracinKm;
	}



	public Motor getMotor() {
		return motor;
	}



	public void setMotor(Motor motor) {
		if (motor != null) {
			this.motor = motor;
		}else {
			System.out.println("otomobile takılan motor nesnesi null-yok");
		}
	}

	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", aracinKm=" + aracinKm + ", motor="
				+ motor + ", depodakiYakit=" + depodakiYakit + ", depoHacmi=" + depoHacmi + "]";
	}




	

}
