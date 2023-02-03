package com.hivdaaydogan;

import java.util.Scanner;

public class Diziler {

	public static void main(String[] args) {
		
		// Tamsayı dizisi: => { 1, 7, 12, 39, 55, 88, 91 }
		// Metin dizisi : => { "ali", "veli", "ayşe", "ahmet" }
		
		// dizi tanımlama:
		// dizinin cinsi önce yazılır byte, short, int, long, ...vs sonra []
		long[] dizi1;
		
		// Kural : Dizileri initialize etmeden onları kullanamazsınız.
		dizi1 = new long[7];  // Siz bu satırı yazdığınızda Java arka planda şöyle bir şey oluşturur.
		                      // { 0, 0, 0, 0, 0, 0, 0 }
		System.out.println(dizi1[0]);  //UNUTMAYALIM: dizilerin ilk elemanının indeksi 0'dır.
		System.out.println(dizi1[dizi1.length-1]);
		System.out.println(dizi1.length);
		
		// Dikkat:
		// Dizinin boyutlarını aşan indekslere erişmeye çalışırsanız hata alırsınız, mesela:
		// System.out.println(dizi1[7]); => Hata verir çünkü 7 son indeksteb büyük.
		
		// Dizilere atama yapmak:
		dizi1[0] = 10;
		dizi1[1] = 15;
		dizi1[6] = 28;   // { 10, 15, 0, 0, 0, 0, 28 }
		System.out.println(dizi1[1]);
		System.out.println("\n\n");
		
		// Dizilerin değerleri okunurken genelde for loop kullanılır:
		for (int i=0;i<dizi1.length;i++) {
			System.out.println(dizi1[i]);
		}
		
		System.out.println();
		
		// Dizi tanımlama 2. yöntem:
		int[] myArray = {1,5,9,24,112};
		System.out.println(myArray[2]);
		
		
		// Dizi tanımlama 3. yöntem
		int[] arrayInt = new int[] {1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<arrayInt.length;i++) {
			System.out.println(arrayInt[i]);
		}
		
		
		// Soru:
		int[] array1 = {1,5,9,24,112};
		int[] array2 = {10,50,90,240,1120};
		array1 = array2;
		array1[0] = 999;
		System.out.println(array2[0]);
		// Ekrana ne yazar?
		
		// Dizi Tanımlama String
		//
		String[] arrayString = new String[] { "Ali", "Veli", "Zeynep", "Can"};
		for (int i=0; i<arrayString.length;i++) {
			System.out.println(arrayString[i]);
		}
		
		// Böyle de tanımlayabilirsiniz:
		String[] dizi2 = new String[3];
		dizi2[0] = "Papatya";
		dizi2[1] = "Gül";
		dizi2[2] = "Lale";
		// dizi2[3] = "Orkide"; => hatalı olur.
		for (int i=0; i<dizi2.length;i++) {
			System.out.println(dizi2[i]);
		}
		
		
		System.out.println("\n**********\n");
		
		// null konusu.
		// 
		String isim;
		// System.out.println(isim);  // isim değişkenine arama yapmazsam (initialize etmezsem) IDE kırmızıya noyayıp hata veriyor.
		
		// örnek:
		String[] dizi3 = new String[3];  // => { null, null, null }
		dizi3[0] = "Ali";
		for (int i=0;i<dizi3.length;i++) {
			System.out.println(dizi3[i]);
		}
		
		// Örnek:
		// Kullanıcıdadn bir tamsayı alalım, girilen tamsayı dizinin boyutu olsun.
		// Bu dizinin içeriğini de yine kullanıcı console'dan girerek oluştursun.
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen dizinin boyutunu giriniz: ");
		int diziBoyutu = scanner.nextInt();
		int[] diziOrnek = new int[diziBoyutu];
		for (int i=0; i<diziBoyutu;i++) {
			System.out.println("Lütfen dizinin "+ i + ". elemanını giriniz: ");
			diziOrnek[i]=scanner.nextInt();
		}
		
		// yukarıdaki kullanıcının oluşturduğu diziyi ekrana yazdıralım:
//		for (int i=0; i<diziOrnek;i++) {
//			System.out.println(diziOrnek[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
