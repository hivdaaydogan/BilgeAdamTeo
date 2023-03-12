package com.hivdaaydogan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOgrenci {

	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
		
		// Scanner sınıfı Closeable interface'ini implement ettiği için try-with-resources kalıbı ile kullanılabilir.
		// (+ Scanner bir InputStream ile çalıştığı için tabii ki)
		try (Scanner scanner = new Scanner(new FileReader("liste.txt"))){
			
			// tüm satırları nasıl okunur?
			while (scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();
				String[] array = okunanSatir.split(",");  // Ali Kaya, 111 => array[0]="Ali Kaya" ve array[1]=" 111"
				Ogrenci ogrenci = new Ogrenci(array[0], Integer.parseInt(array[1].trim()));
				ogrenciList.add(ogrenci);
			}	
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		}

		
		for (Ogrenci ogr : ogrenciList) {
			System.out.println(ogr);
		}
		
		
		
		
		
	}

}
