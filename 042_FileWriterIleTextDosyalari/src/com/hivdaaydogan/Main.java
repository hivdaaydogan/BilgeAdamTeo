package com.hivdaaydogan;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter ile sadece text dosyaları yazılabilir
// write() metodunun içine direkt String verilebilir

public class Main {

	public static void main(String[] args) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter("dosya.txt", true);
			
			// FileWriter ile dosyaya veriyi byte'a çevirmeden direkt String olarak yazabiliriz.
			fileWriter.write("Bartu Sungur\n");
			fileWriter.write("Ahmet Ozan");
			
		} catch (IOException e) {
			System.out.println("Dosya açılırken veya yazarken hata oluştu!");
			e.printStackTrace();
		} finally {
			
		}

		
		
		
		
		
		
		
		
	}

}
