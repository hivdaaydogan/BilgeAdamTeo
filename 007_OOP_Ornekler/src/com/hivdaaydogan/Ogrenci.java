package com.hivdaaydogan;

public class Ogrenci {
	
	public int ogrenciNo;
	public String ad;
	public String soyad;
	public IletisimBilgileri iletisimBilgileri;
	
	
	@Override
	public String toString() {
		return "Ogrenci (ogrenciNo=" + ogrenciNo + ", ad=" + ad + ", soyad=" + soyad + "İletişim bilgileri: " + 
	             iletisimBilgileri + ")";
	}
	
	
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.ogrenciNo = 100;
		ogrenci1.ad = "Ali";
		ogrenci1.soyad = "Özkan";
		ogrenci1.iletisimBilgileri = new IletisimBilgileri();
		ogrenci1.iletisimBilgileri.tel = 5554443322L;
		ogrenci1.iletisimBilgileri.adres = "Ihlamur sok. no:5 Çnkaya/Ankara";
		System.out.println(ogrenci1.toString());
		
		// toString() kullanımı: syso içine nesney yazarsak syso otomatik olarak nesnenin toString() metodunu çağırır.
		System.out.println(ogrenci1);
		
		
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ogrenciNo = 101;
		ogrenci2.ad = "Zeynep";
		ogrenci2.soyad = "Çalışkan";
		ogrenci2.iletisimBilgileri = new IletisimBilgileri();
		ogrenci2.iletisimBilgileri.tel = 5553332211L;
		ogrenci2.iletisimBilgileri.adres = "Manolya apt sok. no:27 Kadıköy/İstabul";
		System.out.println(ogrenci2);
		
		
		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.ogrenciNo = 103;
		ogrenci3.ad = "Ahmet";
		ogrenci3.soyad = "Kaya";
		ogrenci3.iletisimBilgileri = new IletisimBilgileri();
		ogrenci3.iletisimBilgileri.tel = 5556667788L;
		ogrenci3.iletisimBilgileri.adres = "Menekşe apt. no:55 Karşıyaka/İzmir";
		System.out.println(ogrenci3);
		
		
		// Soru:
		// Ogrenci nesnelerinden oluşan bir dizi oluşuturun
		// diziye sırasıyla ogrenci1, ogrenci2, ogrenci3 içerik olarak atayın
		// for each dongusu ile dizinin tüm elemanlarını yazın
		
		System.out.println("\n*********\n");
		Ogrenci[] dizi = new Ogrenci[4];  // => { null,null,null,null }
		dizi[0] = ogrenci1;     // =>  {ogrenci1,null,null,null }
		dizi[1] = ogrenci2;     // =>  {ogrenci1,ogrenci2,null,null}
		dizi[2] = ogrenci3;     // =>  {ogrenci1,ogrenci2,ogrenci3,null }
		dizi[3] = new Ogrenci();  // => {ogrenci1,ogrenci2,ogrenci3, (Ogrenci sınıfından bir nesne) }
		dizi[3].ogrenciNo = 103;
		dizi[3].ad = "Bartu";
		dizi[3].soyad = "Ak";
		
		
		
		
		System.out.println("**Öğrenci Listesi**");
		for (Ogrenci ogrenci : dizi) {
			// null kontrolü
			if (ogrenci != null) {
				System.out.println(ogrenci.ad);	
			}
		}
	}

	

}
