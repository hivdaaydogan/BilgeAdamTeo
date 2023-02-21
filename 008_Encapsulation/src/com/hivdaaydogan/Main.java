package com.hivdaaydogan;

public class Main {

	public static void main(String[] args) {
		
		Motor motor = new Motor();
		motor.setMotorHacmi(1400); 
		//motor.saseNo = "MW4335";
		motor.setYakitTuketimi(10);
		
		//System.out.println(motor.toString());
		System.out.println(motor);
		
		
		//
		Otomobil otomobil1 = new Otomobil();
		otomobil1.setAracinKm(0);
		otomobil1.setMarka("opel");
		otomobil1.setModel("insignia");
		otomobil1.setYil(2023);
		
		Motor motor1 = new Motor();
		motor1.setMotorHacmi(1500);
		motor1.setYakitTuketimi(10);
		
		otomobil1.setMotor(motor1);
		
		Motor motor2 = new Motor();
		motor2.setMotorHacmi(1800);
		motor2.setYakitTuketimi(12);
		otomobil1.setMotor(motor2);
		
		System.out.println("\nMotor değiştikten sonra: ");
		System.out.println(otomobil1);
		
		// 
		System.out.println();
		System.out.println(motor2.getMotorHacmi());
		System.out.println(otomobil1.getMotor().getMotorHacmi());  // otomobil1.motor.motorHacmi
		
		
		//
		System.out.println();
		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.setAracinKm(100);
		otomobil2.setMarka("Audi");
		otomobil2.setModel("A3");
		otomobil2.setYil(2023);
		
		System.out.println(otomobil2.getMotor());
		
		Motor m = null;
		otomobil2.setMotor(m);
		//otomobil2.getMotor().setMotorHacmi(1400); ==> hata verir, çünkü otomobilde motor nesnesi yok sadece
		                                              //nesne referansı var o da null'ı gösteriyor
		m = new Motor();
		otomobil2.setMotor(m);
		otomobil2.getMotor().setMotorHacmi(1400);
		System.out.println("oto2 mot hacmi: " + otomobil2.getMotor().getMotorHacmi());
		
		
		//
		System.out.println();
		Otomobil otomobil3 = new Otomobil();
		otomobil3.setMarka("Fiat");
		otomobil3.setModel("Aegea");
		otomobil3.setMotor(new Motor());
		otomobil3.getMotor().setYakitTuketimi(8);
		System.out.println(otomobil3.getMotor().getYakitTuketimi());
		System.out.println(otomobil3);
		
		
		
		
		

	}

}
