package com.hivdaaydogan;

public class DizilerMultiDimensional {

	public static void main(String[] args) {


		int[] tekBoy = new int[4]; // {0,0,0,0} => tek boyutlu dizi
		int[] tekBoy2 = {1,2,3,4,5,6};
		
		
		//çok boyutlu dizi (matris de denir matematikte)
		
		//2. yöntem
		int[][] cokBoy = new int[2][3]; // 2 satır ve 3 sütunlu matris / dizi oluşturdum
										// {{0,0,0,},{0,0,0,}}
		// 0 0 0 
		// 0 0 0
		
		cokBoy[0][0] =1;
		//1 0 0
		//0 0 0 
		
		cokBoy[1][2] = 8;
		//1 0 0
		//0 0 0
		 System.out.println(cokBoy[0][0]);
		 System.out.println(cokBoy[1][2]);
		 System.out.println(cokBoy[0][1]);
		 
		 
		 //örnek uygulama:
		 //bir sınıf listesi yapalım.
		 // sıra no:	öğrenci no:		adı:		Soyad:
		 // 1				101			ALi			Kaya
		 // 2				102			Veli		Öz
		 // 3				103			Zeynep		Çalışkan
		 
		 
		 String[][] sinifListesi = new String[3][4];  // 3 satır, 4 sütunlu matris(2 boyutlu string dizisi) oluşturdum.
		 
		 //şimdi içine kayıt atalım;
		 sinifListesi[0][0]= "1";
		 sinifListesi[0][1]= "101";
		 sinifListesi[0][2]= "Ali";
		 sinifListesi[0][3]= "Kaya";
		 
		 sinifListesi[1][0]= "2";
		 sinifListesi[1][1]= "102";
		 sinifListesi[1][2]= "Veli";
		 sinifListesi[1][3]= "Öz";
		 
		 sinifListesi[2][0]= "3";
		 sinifListesi[2][1]= "103";
		 sinifListesi[2][2]= "Zeynep";
		 sinifListesi[2][3]= "Çalışkan";
		 
		 //Yukarıdaki öğrenci bilgilerini ekrana yazdıralım;
		 System.out.println("öğrenci listesi");
		 System.out.println("\n--------------\n");
		 System.out.println(sinifListesi[0][0] + " " +sinifListesi[0][1]+ " "+ sinifListesi[0][2]+" "+sinifListesi[0][3]);
		 System.out.println(sinifListesi[1][0] + " " +sinifListesi[1][1]+ " "+ sinifListesi[1][2]+" "+sinifListesi[1][3]);
		 System.out.println(sinifListesi[2][0] + " " +sinifListesi[2][1]+ " "+ sinifListesi[2][2]+" "+sinifListesi[2][3]);
		 //Böyle satır satır yazmak çok uzun sürüyor, burada 3 kayıt değil de 500 kayıt olsaydı?
		 //Peki ne yapacağız?
		 
		 //Çözüm: İç içe for döngüleri:
		 //
		 System.out.println("\n\nöğrenci listesi");
		 System.out.println("----------------");
		 for (int i=0; i<3; i++) { //satır
			 for(int j=0;j<4;j++) { //sütun
				 System.out.print(sinifListesi[i][j] + " ");;
			 }
			 System.out.println();
		 }
		 
		 // code refining:
		 //
		 //burada 3 satır veya 4 sütun sayılarını kod içine direkt yukardaki gibi görmek doğru değil
		 //bunun yerine dizilerin length özelliğini kullanalaım.
		 
		 System.out.println("\n\nöğrenci listesi");
		 System.out.println("----------------");
		 for (int i=0; i<sinifListesi.length; i++) { //satır
			 for(int j=0;j<sinifListesi[i].length;j++) { //i-yinci satırdaki sütun sayısını verir..
				 System.out.print(sinifListesi[i][j] + " ");;
			 }
			 System.out.println();
		 }
		 
		 
		 

		 //Ek bilgi:
		 //Herhangi bir String ifade içindeki sayıyı primitive veri tipine çevirmek için wrapper(sarmalayıcı) classları kullanırız.
		 int siraNo = Integer.parseInt(sinifListesi[0][0]);
		 System.out.println(siraNo);
		 
		 String sayiStr = "12.345";
		 double sayi2 = Double.parseDouble(sayiStr);
		 System.out.println(sayi2);
		 
		 String sy = "12.3455450";
		 float xx = Float.parseFloat(sy);
		 System.out.println(xx);
		 
		//Diğerlerini inceleyip test edin internetten araştırın.
		//       WRAPPER  SINIFLAR:
		//        byte      Byte
		//        short     Short
		//        int       Integer
		//        long      Long
		//        float     Float
		//        double    Double
		//        boolean   Boolean
		//        char      Character
		 
		 
		 //3. boyutlu dizi
		 int[][][] dizi3Boyut  = new int[3][3][3];
		 dizi3Boyut[0][0][0] = 23;
		 System.out.println(dizi3Boyut[0][0][0]);
		
		
	}
}