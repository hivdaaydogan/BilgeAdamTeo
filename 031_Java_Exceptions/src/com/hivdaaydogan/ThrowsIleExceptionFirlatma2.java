package com.hivdaaydogan;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma2 {

	// hiz değeri 120den büyükse exception fırlatacağız
		public static void hizKontrol(int hiz) throws SQLException {
			
			if (hiz>120) {
				throw new SQLException();  // SQLException bir checkedException olduğu için metodun başına extra throws yazmamız gerekir.
			}else {
				System.out.println("İyi yolculuklar...");
			}	
		}
	
	// main metot başlığında throws ile exception atması, API olarak bizim kodumuzu 
	// kullanacak kişinin yakalaması içindir
	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = scanner.nextInt();
		
		hizKontrol(hiz);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
