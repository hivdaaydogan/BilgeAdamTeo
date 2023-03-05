package com.hivdaaydogan;

public class FinallyMain {

	// Finally bolgu içindeki kodlarınız try-catch statementların sonunda mutlaka çalıştırılır.
	
	public static void main(String[] args) {


		try {
			int x = 5 / 0;
		} catch (Exception e) {
			System.out.println("Bir hata oluştu!");
		}finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır...");
		}
		System.out.println("Bye 1...");

		System.out.println();
		
		try {
			int x = 5 / 1;
		} catch (Exception e) {
			System.out.println("Bir exception oluştu!");
		}finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır...");
		}
		System.out.println("Bye 2...");

		System.out.println("- - - - - ");
		
		try {
			int y = 10 / 0;
		} catch (NullPointerException e) {
			System.out.println("null pointer exception aldık.");
		}finally {
			System.out.println("Finally kod bloğu içine ne yazarsan yaz her zaman çalışır...");
			// connection.close();
		}
		System.out.println("Bye 3...");
		
		// Finally kullanımı:
		// 
		// Dosya kapama, veritabanı bağlantısı kapama, açık bir network socketini kapama
		// gibi işlemler mutlaka finally kod bloğu içinde yapılır.
		
		
		
		
		
		
		
		
		
		
		
	}

}
