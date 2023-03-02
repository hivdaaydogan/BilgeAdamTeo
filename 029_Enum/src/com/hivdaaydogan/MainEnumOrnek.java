package com.hivdaaydogan;

public class MainEnumOrnek {
	
	enum Size {
		LOW,
		MEDIUM,
		HIGH
	}
	
	enum Mevsimler {
		ILKBAHAR,
		YAZ,
		SONBAHAR,
		KIS
	}
	
	
	// enum'lar bizleri aşağıdaki şekilde tek tek static değişken tanımlamak zahmetinden kurtarır
	// enum değerleri static ve final'dır.
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int LARGE = 3;
	
	public static void ekranaYaz(Mevsimler m) {
		System.out.println(m);
	}
	

	public static void main(String[] args) {
		
		// enum
		//
		// enum'lar değişmez (final'dır)
		// enum'lardan nesne türetilemez.
		Size size = Size.HIGH;
		size = Size.MEDIUM;
		System.out.println(size);
		
		for (Size s : Size.values()) {
			System.out.println(s);
		}

		
		// enum'lar nerelerde kullanılır?
		// Değişmeze değerlerini varsa kullanırsınız
		// Meslea ilkbahar, yaz, v.b.
		Size beden = size.MEDIUM;
		if (beden == size.MEDIUM)
		{
			System.out.println("Orta-M beden");
		}
		
		// Enum'lar sayeisnde parametre gönderimi daha hızlı ve doğru olur.
		MainEnumOrnek.ekranaYaz(Mevsimler.SONBAHAR);
		
	}

}