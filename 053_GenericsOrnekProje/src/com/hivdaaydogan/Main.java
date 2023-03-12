package com.hivdaaydogan;

public class Main {
	
	
	// GENERİC METOTLAR :
	public static <E> void myGenericMethod(E[] array) {
		
		// Bu metot array'in içindeki şekillerin toplam alanını hesaplasın..
		System.out.println("\n* * * * * * * * * * \n");
		int toplam = 0;
		for (E obj : array) {
			Sekil objSekil = (Sekil) obj;
			if (objSekil != null) {
				toplam += objSekil.alanHesapla();
			}
		}
		System.out.println("Arrayın toplam alanı: " + toplam);		
	}
	
	

	public static void main(String[] args) {
		
		GeometrikAlan<DikUcgen, Kare> alan1 = new GeometrikAlan<DikUcgen, Kare>(new DikUcgen(10,10), new Kare(5));
		System.out.println("alan1 alanı: " + alan1.geometrikSeklinAlaniniHesapla());
		
		GeometrikAlan<Dikdortgen, DikUcgen> alan2 = new GeometrikAlan<Dikdortgen, DikUcgen>(new Dikdortgen(8,5), new DikUcgen(4,12));
		System.out.println("alan2 alanı: " + alan2.geometrikSeklinAlaniniHesapla());
		
		GeometrikAlan<Kare, Kare> alan3 = new GeometrikAlan<Kare, Kare>(new Kare(7), new Kare(3));
		System.out.println("alan3 alanı: " + alan3.geometrikSeklinAlaniniHesapla());
		
		GeometrikAlan<Circle, Kare> alan4 = new GeometrikAlan<Circle, Kare>(new Circle(10), new Kare(5));
		System.out.println("alan4 alanı: " + alan4.geometrikSeklinAlaniniHesapla());

		System.out.println("\n* * * * * * * * * *\n");
		
		Kare[] kareArray = new Kare[3]; // kareArray => {null, null, null}
		kareArray[0] = new Kare(3);
		kareArray[1] = new Kare(4);
		kareArray[2] = new Kare(5);
		myGenericMethod(kareArray);
		
		Dikdortgen[] darr = new Dikdortgen[3];
		darr[0] = new Dikdortgen(3,4);
		darr[1] = new Dikdortgen(4,5);
		darr[2] = new Dikdortgen(5,7);
		myGenericMethod(darr);
		
		// Soru:
		// 
		// İçinde 1 dikdörtgen, 1 Kare, 1 DikÜçgen nesneleri olan bir array oluşturun. 
		//myGenericMethod'a bu arrayı parametre olarak gönderin ve bu farklı nesnelerin 
		//toplam alanını ekrana yazdırın.
		 
		Sekil[] figures = new Sekil[3];
		figures[0] = new Dikdortgen(3,4);
		figures[1] = new Kare(4);
		figures[2] = new DikUcgen(2, 3);
		myGenericMethod(figures);
		
		
		
		
		
	}

}
