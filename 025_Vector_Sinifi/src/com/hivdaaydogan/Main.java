package com.hivdaaydogan;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// Multi-threading application'larda ArrayList'ler safe kabul edilmez. 
		// Multı-threading uygulamalarda ArrayList yerine Vector kullanılmalıdır. Vector sınıfı thread-safe bir sınıftır.
		//Vector'lerin dexavantajı ise ArrayList'e göre daha yavaş çalışmalarıdır.
		
		List<String> vector = new Vector<String>();
		
		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Aslan");
		vector.add("Kaplan");
		
		for(String s : vector) {
			System.out.println(s);
		}
		
		// Iterator kullanımı:
		System.out.println();
		
		ListIterator<String> iterator = vector.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
