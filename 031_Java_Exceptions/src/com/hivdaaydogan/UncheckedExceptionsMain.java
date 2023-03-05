package com.hivdaaydogan;

public class UncheckedExceptionsMain {

	// Unchecked Exception'ları programcının öngörmesi ve kontrol etmesi lazım.
	// Java bu tarz exceptionlar üzerinde hata veya uyarı vermez
	// Bunlar RunTime exception sınıfından türerler.
	
	public static void main(String[] args) {
		
		String s = null;
		// System.out.println(s.length());  // => NullPointerException
		
		try {
			System.out.println(s.length()); 
		} catch (Exception e) {
			System.out.println("Hatayı yakaladık");
			// Loga bu hatayı yaz.
		}
		
		System.out.println("Programın sonu...");
		
		
	}

}
