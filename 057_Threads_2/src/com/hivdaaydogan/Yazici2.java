package com.hivdaaydogan;


// Bir class'ı Thread sınıfından extend ederseniz (türetirseniz), türettiğiniz bu yeni class'ta bir thread olur.
public class Yazici2 extends Thread{
	
	private String isim;
	
	public Yazici2(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Yazici [isim=" + isim + "]";
	}

	// Dikkat!
	// Thread'imiz start() ettirildiğinde (çalıştırıldığında) çalışacak kodlar run() metodunun içine yazılmalıdır.
	@Override
	public void run() {
		
		System.out.println(this.isim + " isimli thread çalışıyor...");
		
		for(int i=0;i<=10;i++) {
			System.out.println(this.isim + " yazıyor: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(this.isim + " isimli thread işini bitirdi...");
	}

	
	
	
	
}
