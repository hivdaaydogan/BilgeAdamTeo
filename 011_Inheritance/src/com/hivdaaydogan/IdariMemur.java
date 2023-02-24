package com.hivdaaydogan;


// extends Personel : İdariMemur sınıfı Personel sınıfının alt sınıfıdır.
// extend etmek miras almak/kalıtımla özelliklerini taşıyor anlamına gelir.
public class IdariMemur extends Personel {

	// gorevi ve telSeriNo IdariMemur sınıfına ait özellikler tüm personelin genel özellikleri değildir.
	private String gorevi;
	private long telSeriNo;
	
	

	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public long getTelSeriNo() {
		return telSeriNo;
	}

	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}
	
	

	
	
	
}
