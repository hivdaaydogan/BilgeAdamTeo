package com.hivdaaydogan;

public class AlgoritmaKarmasikligi {

	public static void main(String[] args) {


		int islemAdedi = 100000;
		
		// 1. Algoritmanın çalışma süresi hesalanıyor:
//		long startTime = System.currentTimeMillis();
//		String metin = "Hello";
//		for (int i=0;i<islemAdedi;i++) {
//			metin = metin + i;
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("İşlem süresi : " + (endTime - startTime) + " milisaniye.");
		
		
		// 2. Algoritmanın çalışma süresi hesaplanıyor:
		long startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		for (int i=0;i<islemAdedi;i++) {
			stringBuilder.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("İşlem süresi : " + (endTime - startTime) + " milisaniye.");

	}

}
