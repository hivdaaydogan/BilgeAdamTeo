package com.hivdaaydogan;

public class DizilerMultiDimensional {

	public static void main(String[] args) {


		int[] tekBoyutluDizi = new int[4]; // { 0,0,0,0 } => Tek boyutlu dizi
		int[] tekBoyutluDizi2 = { 3,7,12,95,23 };
		
		// Çok boyutlu dizi (matris de denir matematikte)
		int[][] cokBoyutluDizi = new int[2][3];  // 2 satır ve 3 sütunlu bir matris/dizi oluşturduk!
		                                         // { {0,0,0}, {0,0,0}
		// 0 0 0
		// 0 0 0
		
		cokBoyutluDizi[0][0]=1;
		// 1 0 0
		// 0 0 0
		
		cokBoyutluDizi[1][2]=8;
		// 1 0 0
		// 1 0 8
		
		System.out.println(cokBoyutluDizi[0][0]);
		System.out.println(cokBoyutluDizi[1][2]);
		System.out.println(cokBoyutluDizi[0][1]);

	}

}
