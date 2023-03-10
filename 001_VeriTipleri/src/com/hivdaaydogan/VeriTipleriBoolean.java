package com.hivdaaydogan;

public class VeriTipleriBoolean {

	public static void main(String[] args) {
		
		// boolean veritipi:
		// 1 bit 
		// açık-kapalı, doğru-yanlış, 1-0...
		//
		// boolean olarak neler tutulabilir?
		// Ör, Bir kullanıcının sistemde aktif olup olmadığını tutabilirsiniz (online veya offline durumu).
		//
		boolean boolDegisken;
		boolDegisken = true;  // true veya false olarak sadece 2 değerden birini alabilir.
		System.out.println(boolDegisken);
		
		// boolean isHeavy = false;
		boolean agirMi = false;  // initialize - ilk değer verme. 
		int agirlik = 85;
		agirMi = (agirlik >= 85);
		System.out.println("Ağır mı? " + agirMi);
		
		// ==  !=  >=  <=   <  > 
		boolean durum = agirlik == 50;
		System.out.println("Durum: " + durum);
		
		
		durum = agirlik != 50;
		System.out.println("Durum: " + durum);
		
		
		int boy = 180;
		boolean uzunKilolu = (boy >= 180 && agirlik >=85);   // Karşılaştırma durumunda parantez olmak zorunda değil.
		System.out.println("Şahıs uzun ve kilolu mu? " + uzunKilolu);
		
		
		// Soru:
		char cinsiyet = 'K';  // 'E'
		if (uzunKilolu && cinsiyet == 'K') {
			System.out.println("Şahıs kadın, uzun ve kilolu");
		}
		
		
		// if => Ternary kullanımı 
		// Örnek:
		int yas = 19;
		String deger;
		if (yas >= 18) {
			deger = "Yetişkin değil";
		}
		
		
		// yukarıdaki işelmin Ternary ile yapılması:
		yas = 11;
		deger = yas >= 18 ? "Yetişkin" : "Yetişkin değil";
		System.out.println(deger);
		
		
		// Microsoft USA'in mülakatında sorduğu sınav sorusu (SWAP Numbers Question):
		// 3. değişken kullanmadan sayi1 ve sayi2 sayılarını birbirine eşit olacak şekilde değiştirin.
		int sayi1 = -5;
		int sayi2 = 3;
		sayi1 = (sayi1 + sayi2);
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;
		System.out.println("sayi1: " + sayi1 + "sayi2: "+ sayi2);
		System.out.println("\n\n***********\n\n");
		
		
		
		int x =10;
		int y = 3;
		
		int result = x / y;
		System.out.println(result);
		int kalan = x % y;
		System.out.println(kalan);
		
		double res = x / y;
		System.out.println("res: " + res);  // yine küsurat gözükmez çünkü eşitliğin sağ tarafı tamsayılarda hep int olur. 
		 
		// Çözüm:
		// x ve y double olmalı
		double xx = 10;
		double yy = 3;
		res = xx / yy;
		
		// Küsuratı azaltıp gösterelim
		String kusurat = String.format("%.3f" , res);
		System.out.println("res: " + kusurat); 
		
		  
		System.out.println("\n\n**********\n");
		
		int sayisalDeger = 4;
		sayisalDeger = sayisalDeger + 1;
		System.out.println("sayısal deger: " + sayisalDeger);
		
		sayisalDeger++;
		System.out.println("sayisal değer: " + sayisalDeger);
		
		sayisalDeger += 5;
		System.out.println("sayisal değer: " + sayisalDeger);
		
		sayisalDeger--;
		System.out.println("sayisal değer: " + sayisalDeger);
		
		// *=  /=  %=  yukarıdaki mantığa benzer şekilde çalışır...
		
		
//		int a = 3;
//		int b = a++;  //DİKKAT! Önce atamayı yapar, sonra ++ işlemini gerçekleştirir.
//		System.out.println("a: " + a + "b: " + b);
		
//		int a = 3;
//		int b = ++a;  // Önce a:4 ,sonra b:4
//		System.out.println("a: " + a + "b: " + b);

		
		int a = 3;
		int b = 4;
		int z = 5;
		int tpl = a++ + ++b + --z;
		System.out.println("tpl: " + tpl + "a: " + a + "b: "+ b + "z: " + z);
	}

}
