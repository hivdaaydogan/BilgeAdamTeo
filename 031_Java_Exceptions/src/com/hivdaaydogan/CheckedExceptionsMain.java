package com.hivdaaydogan;

public class CheckedExceptionsMain {

	public static void main(String[] args) {

		// Checked exceptionlar direkt Exception sınıfından türerler
		// Bunlar program compile edilirken yakalanması ve handle edilmesi (ilgilenilmesi) zorunlu exception'lardır.
		// Bu tarz exceptionlar mutlaka kod run edilmeden önce try-catch blokları içinde handle edilmelidir.
		// Akdi takdirde compile hatası alırsınız, programınızı çalıştıramazsınız (run edemezsiniz)
		//
		// Not : Checked Exception'lar Runtime Exception'dan türemezler.
		
		
		System.out.println(1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(2);
	}

}
