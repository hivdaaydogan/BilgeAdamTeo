package com.hivdaaydogan;

import java.util.Scanner;

public class ThrowIleExceptionFirlatma {

	// hiz değeri 120den büyükse exception fırlatacağız
	public static void hizKontrol(int hiz) {
		
		if (hiz > 120) {
			throw new ArithmeticException();
		}else {
			System.out.println("iyi yolculuklar...");
			// Arabanın hızını parametre olarak gelen değere yükselt
			// veya sıcaklıkla ilgili işlemlerinizi yapın...
		}
		
	}
	
	
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = scanner.nextInt();
		
		// Throw ile atılan exception'larda try-catch yazmayabilirsiniz ama bu durumda exception yenildiğinde program çöker. 
		// hizKontrol(145);  => program çöker.
		
		try {
			hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsun, lütfen hızını azalt...");
		}
		System.out.println("Hoşça kal!");
		
		
		
		
		
		
		
	}

}
