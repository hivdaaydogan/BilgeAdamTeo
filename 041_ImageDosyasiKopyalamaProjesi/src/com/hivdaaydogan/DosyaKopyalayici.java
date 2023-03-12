package com.hivdaaydogan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DosyaKopyalayici {
	
	
	public static List<Integer> dosyaIcerigiByteList = new ArrayList<Integer>();
	
	
	private static void dosyadanOku(String dosyaAdi) {
		System.out.println("Dosya okunuyor... okunan dosya adı: " + dosyaAdi );
		// FileInputStream dosyaları binary olarak okur ve yazar.
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(dosyaAdi);
			int okunan;
			
			while ((okunan = fileInputStream.read()) != -1) {
				dosyaIcerigiByteList.add(okunan);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("File close sırasında bir hata oluştu!");
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	

	private static void dosyayakopyala(String dosyaAdi) {
		System.out.println("Dosya kopyalanıyor... kopyalanan dosya adı: " + dosyaAdi);
		FileOutputStream fileOutPutStream = null;
		
		try {
			fileOutPutStream = new FileOutputStream(dosyaAdi);
			
			for (int yazilacakByte : dosyaIcerigiByteList) {
				fileOutPutStream.write(yazilacakByte);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı veya yazma hakkınız yok!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya yazma hatası oluştu! Belirtilen dosyaya yazma işlemi yapılamadı!");
			e.printStackTrace();
		} finally {
			if(fileOutPutStream != null) {
				try {
					fileOutPutStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken bir hata oluştu!");
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		dosyadanOku("C:\\test\\r2d2.jpg");
		
		
		dosyayakopyala("C:\\test\\r2d2_kopya1.jpg");
		dosyayakopyala("C:\\test\\r2d2_kopya2.jpg");
		dosyayakopyala("C:\\test\\r2d2_kopya3.jpg");
		
		System.out.println("bye...");
		
		
		
	}




}
