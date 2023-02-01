package com.hivdaaydogan;

public class DongulerBreakContinue {

	public static void main(String[] args) {
		
		// break
		//
		// Döngünün akışını durdurur ve } sonrasındaki koda gider...
		
		for (int i=0;i<10;i++) {
			
			if (i==5) {
				break;
			}
			
			System.out.println(i);
		}
		
		
		// continue
		//
		// Döngünün dışına çıkarmaz ancak bir sonraki indekse devam ettirir.
		
		for (int i=0;i<10;i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("\n\n********\n");
		
		// Örnek:
		int sayac = 0;
		while (sayac < 10) {
			if (sayac == 7)
				break;
			sayac++;
			System.out.println(sayac);
		}
		
		
		
		
		
		
		
		
		
	}

}
