package com.hivdaaydogan;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma {

	// hiz değeri 120den büyükse exception fırlatacağız
		public static void hizKontrol(int hiz) throws SQLException {
			
			if (hiz>120) {
				throw new SQLException();  // SQLException bir checkedException olduğu için metodun başına extra throws yazmamız gerekir.
			}else {
				System.out.println("İyi yolculuklar...");
			}	
		}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = scanner.nextInt();
		
		try {
			hizKontrol(hiz);
		} catch (SQLException e) {
			System.out.println("Çok hızlı gidiyorsun, lütfen hızını azalt...");
			//e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
