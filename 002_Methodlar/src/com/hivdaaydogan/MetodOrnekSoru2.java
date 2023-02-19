package com.hivdaaydogan;

import java.lang.reflect.Array;

public class MetodOrnekSoru2 {

	//bir tamsayı dizisi içindeki sayılar toplatıp toplamı return eden bir metod yazın:
	
	
	public static int diziTop(int[] dizi) {
		
		int toplam =0;
		for(int i=0; i< dizi.length; i++) {
			toplam = toplam + dizi[i];	
		}
		return toplam;	
	}
	
	
	
	public static void main(String[] args) {
		
		int[] array = {5,10,15,20};
		System.out.println(diziTop(array));
		
	}

}
