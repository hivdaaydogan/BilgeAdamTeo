package com.hivdaadydogan;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void nemGoster(INemOlcer nemOlcer) {
		System.out.println(nemOlcer.nemOlc());
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + " " + tarihSaatGosterenCihaz.saatGoster());
	}

	// Interface'ler abstraction (soyutlama) sağlar.
	public static ITermometre termometreOlustur() {
		ITermometre termometre = new Arzum();
		return termometre;
	}
	
	
	
	public static void main(String[] args) {
		
		Arzum arzum = new Arzum();
//		System.out.println(arzum.sicakligiOlc());
		
//		ITermometre termometre = new Sinbo();
//		System.out.println(termometre.sicakligiOlc());
		
		Sinbo sinboCihaz = new Sinbo();
//		sinboCihaz.sicakligiOlc();
//		sinboCihaz.nemOlc();
		//List<String> mylist = new ArrayList<String>();  ==> buradaki yöntem gibi yazıyoruz, ikisi de interface.
		
		Main.nemGoster(sinboCihaz);
		Main.nemGoster(arzum);
		
		Casio casio = new Casio();
		// Main.nemGoster(casio);  --> hata verir, çünkü casio sınıfı INemOlcer Interface'ini implement etmiyor.
		
		System.out.println("\n* * * * * * * * *");
		Main.tarihSaatGoster(casio);
		// Main.tarihSaatGoster(sinboCihaz); --> Kullanamayız çünkü sinboCihaz Interface'ini implement etmiyor.
		Main.tarihSaatGoster(arzum);
		
		
		System.out.println("\n* * * * * * * * *");
		ITermometre term = Main.termometreOlustur();
		System.out.println(term.sicakligiOlc());
		
		
		
		
		
		
		
	}

}
