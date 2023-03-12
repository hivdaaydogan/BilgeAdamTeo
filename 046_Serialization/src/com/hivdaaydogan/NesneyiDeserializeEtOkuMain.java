package com.hivdaaydogan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NesneyiDeserializeEtOkuMain {

	public static void main(String[] args) {
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Bilinemeyen bir hata oluştu!");
			e.printStackTrace();
		}

	}

}
