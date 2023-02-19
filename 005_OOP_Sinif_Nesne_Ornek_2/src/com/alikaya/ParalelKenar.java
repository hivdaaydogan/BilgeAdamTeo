package com.alikaya;

public class ParalelKenar {
	
	// Access modifiers for member variables:
	// public: tüm paketlerden erişilebilir ve kullanılabilir.
	// protected: sadece aynı paket içindeki sınıflardan erişilebilir, farklı paketlerden erişilemez.
	// private: sadece bulunduğu sınıf içinden erişilebilir.
	// default (boş bırakmak): Hiçbir şey yazmazsanız protected gibi davranır.
	int kenarKisa;   // hiçbir şey yazmazsak protected kabul eder
	int kenarUzun;
	
	private String isim;
	
	private String getIsim() {
		return isim;
	}
	
	public static void main(String[] args) {
		ParalelKenar paralelKenar = new ParalelKenar();
		paralelKenar.isim = "benim paralelkenarım";
		System.out.println(paralelKenar.getIsim());
	}
	
	

}
