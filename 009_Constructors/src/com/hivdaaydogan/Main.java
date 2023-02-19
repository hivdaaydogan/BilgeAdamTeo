package com.hivdaaydogan;

public class Main {

	public static void main(String[] args) {
		
		//Motor motor = new Motor();
		//motor.setMotorHacmi(1400);
		//motor.setYakitTuketimi(10);
		
		Motor motor = new Motor(1400, "WLO4455", 10);
		System.out.println(motor);
		
		Motor motor2 = new Motor(150000, "WS8877", 12);
		System.out.println(motor2);
		
//		Otomobil otomobil1 = new Otomobil();
//		otomobil1.setAracinKm(0);
//		otomobil1.setMarka("Opel");

		
		System.out.println();
		Otomobil otomobil1 = new Otomobil("BMW", "1.18", 2020, 57500, motor2);
		System.out.println(otomobil1);
		
		Otomobil otomobil2 = new Otomobil("Renault", "Clio", 2017, 120000, new Motor(1200, "RN2233", 8));
		System.out.println(otomobil2);
		otomobil2.setAracinKm(122000);
		System.out.println(otomobil2);
		otomobil2.getMotor().setMotorHacmi(1800);
		System.out.println(otomobil2.getMotor().getMotorHacmi());
		
		//
		System.out.println();
		Otomobil otomobil3 = new Otomobil("Fiat", "Aegea");
		System.out.println(otomobil3);
		// otomobil3.getMotor().setMotorHacmi(1800); ==> hata verir çünkü otomobil3 nesnesine henüz bir motor nesnesi
		                                               // üye olarak atamadık.
		otomobil3.setMotor(new Motor(2000, "WE33445", 7));
		System.out.println(otomobil3.getMotor());
		
		
		//
		System.out.println();
		otomobil3.getMotor().setBAziMotorBilgileri(3000, 9);
	}

}
