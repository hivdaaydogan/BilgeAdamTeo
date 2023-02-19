package com.hivdaaydogan;

// Constructor : Nesnelerin ilk oluşumu sırasında çağırılan metoddur. Constructorlar public olur.

// Yazılımcı sınıf içinde hiçbir constructor tanımlamazsa Java o sınıf için otomatik boş
// bir constructor oluşturur.
//
// Ancak :
// Yazılımcı sınıf içine herhangi bir//birden fazla parametre lan bir constructor tanımlarsa 
// Java otomatik constructos oluşturmaz. Bu durumda boş constructor'a ihtiyaç duyarsanız
// sizin manuel olarak boş constructor'ı kendiniz oluşturmanız gerekir.

public class Motor {
	
	private int motorHacmi;
	private String saseNo = "";
	private int yakitTuketimi;
	
	
	public Motor(int motorHacmi, String saseNo, int yakitTuketimi) {
//		this.motorHacmi = motorHacmi;
//		this.saseNo = saseNo;
//		this.yakitTuketimi = yakitTuketimi;
		this.setMotorHacmi(motorHacmi);
		this.saseNo = saseNo;
		this.setYakitTuketimi(yakitTuketimi);
		
	}
	
	public Motor() {
		
	}
	
	public int getMotorHacmi() {
		return motorHacmi;  // => return ths.motorHacmi;
	}
	
	public void setMotorHacmi(int motorHacmi) {
		if (motorHacmi>=800 && motorHacmi<=10000) {
			this.motorHacmi = motorHacmi;
		}else {
			System.out.println("Motor hacmi 800-10000 dışında girdiğiniz için otomatik olarak 800 değerinde ayarlanmıştır.");
			this.motorHacmi = 800;
		}
		
	}
	
	public int getYakitTuketimi() {
		return yakitTuketimi;
	}
	
	public void setYakitTuketimi(int yakitTuketimi) {
		if (yakitTuketimi>=4 && yakitTuketimi<=25) {
			this.yakitTuketimi = yakitTuketimi;
		}else {
			System.out.println("yakıt tüketim değeri mantıklı sınırların dışnda, "
					+ "muhtelemen yanlış girildi en düşük değere ayarlanıyor.");
			this.yakitTuketimi = 4;
		}
		
	}
	
	public String getSaseNo() {
		return saseNo;
	}

	@Override
	public String toString() {
		return "Motor [motorHacmi=" + motorHacmi + ", saseNo=" + saseNo + ", yakitTuketimi=" + yakitTuketimi + "]";
	}
	
	public void setBAziMotorBilgileri(int motorHacmi, int yakitTuketimi) {
		this.setMotorHacmi(motorHacmi);
		this.setYakitTuketimi(yakitTuketimi);
	}


}
