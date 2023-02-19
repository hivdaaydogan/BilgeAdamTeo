package com.hivdaaydogan;

public class ForEachKullanimi {

	public static void main(String[] args) {
		
		int[] dizi = {1,24,35,55,78,83,39};
		for (int i =0;i<dizi.length;i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println();
		
		
		//for each döngüsü
		// köşeli parantezler kullanılmadan yapılır
		
		for (int sayi : dizi) {
			System.out.print(sayi + " ");
		}
		System.out.println();
		String name = "";
		//örnek 2:
		//
		String[] isimlerDizi = {"ali" , "veli" , "osman" , "zeynep"};
		for (String isim : isimlerDizi) {
			System.out.println(isim);
			name = isim;
		}
		
		//scope'a dikkat edelim!!
		//System.out.println(isim);
		System.out.println("name: " + name);
	
	
		//Dikkat 2!!
		int z;
		//int y = z*2; => z değerini initialize etmediğimiz için hata verir. z'ye bir ilk değer atanması lazım.
	
	}

}
