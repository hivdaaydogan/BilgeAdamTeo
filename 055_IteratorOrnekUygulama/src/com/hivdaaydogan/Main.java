package com.hivdaaydogan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Otomobil> cars = new ArrayList<Otomobil>();
		cars.add(new Otomobil("Opel", "Astra", 2011));
		cars.add(new Otomobil("Audi", "A+", 2021));
		cars.add(new Otomobil("BMW", "118", 2014));
		cars.add(new Otomobil("Renault", "Megane", 2011));

		// Soru:
		//
		// Audi A4 otomobili for döngüsü içinde silmeye çalışalım
//		for (Otomobil oto : cars) {
//			if (oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
//				cars.remove(oto);
//			}
//		}
		// yukarıdaki gibi bir for döngüsü içinde döndüğümüz listenin herhangi bir
		// elamanını silemeyiz

		// Iteratorların en önemli kullanım alanı döngü içinde istediğimiz elemanı
		// silebilmemizdir.
		for (Iterator<Otomobil> iterator = cars.iterator(); iterator.hasNext();) {
			Otomobil oto = (Otomobil) iterator.next();
			if (oto.getMarka().equalsIgnoreCase("Audi") && oto.getModel().equalsIgnoreCase("A4")) {
				cars.remove(oto);
			}
		}
		System.out.println(cars);
		
		
		
		
		
		

	}

}
