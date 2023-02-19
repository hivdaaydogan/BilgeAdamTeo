package com.hivdaaydogan;

import com.alikaya.ParalelKenar;
import com.alikaya.Ucgen;

public class Main {

	public static void main(String[] args) {
		
		
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 7;
		dikdortgen1.uzunKenar = 10;
		
		Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar = 8;
		dikdortgen2.uzunKenar = 15;
		
		System.out.println("dikdörtgen1 nesnesinin alanı: "+dikdortgen1.alanHesapla());
		System.out.println("dikdörtgen2 nesnesinin alanı: "+dikdortgen2.alanHesapla());
		
		dikdortgen2.uzunKenar = 20;
		System.out.println("dikdörtgen2 nesnesinin alanı: "+ dikdortgen2.alanHesapla());
		
		Kare kare1 = new Kare();
		kare1.kenar = 10;
		System.out.println("kare1 alanı: "+ kare1.alanHesapla());
		
		Kare kare2 = new Kare();
		kare2.kenar = 20;
		System.out.println("kare2 alanı: "+ kare2.alanHesapla());
		
		
		// Ali'nin paralelKenar sınıfını kullanilir miyim istediğim gibi?
		ParalelKenar paralelKenar1 = new ParalelKenar();
		// paralelKenar1.kenarKisa = 30;  ==> Erişilemez çünkü access modifier(erişim belirleyici) 
		                                    // default yani protected olarak tanımlanmış.
		// paralelKenar1.isim ===> Erişilemez.
		
		
		Ucgen ikizKenarUcgen = new Ucgen();
		ikizKenarUcgen.kenar1 = 10;
		ikizKenarUcgen.kenar2 = 10;
		ikizKenarUcgen.kenar3 = 20;
		System.out.println("üçgenin çevre uzunluğu: " + ikizKenarUcgen.ucgenCevresi());
		// ikizKenarUcgen.kenarlariUzat(5);  => protected olduğu için farklı paketlerden erişilemez
		ikizKenarUcgen.kereminMetodu(20);   // => Ali'nin sınıfında protected metodu public içine attığımız için bunu çalıştırabildik.
		System.out.println(ikizKenarUcgen.kenar1 + " " + ikizKenarUcgen.kenar1 + " " + ikizKenarUcgen.kenar1);
		
		
		// Daire
		// Daire daire = new Daire();  ==> Daire sınıfı başka bir pakette ve protected (package spesific) 
		                                // olduğu için buradan erişilemez.
		



	}

}
