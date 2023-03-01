package com.hivdaaydogan;

import java.util.Stack;

public class Main {
	
		public static void main(String[] args) {
	
			// Stack içinde synchronized metodlar bulunur, Vector sınıfı gibi thread'lerle kullanılabilir.
			Stack<String> stack = new Stack<String>();
			
			stack.add("Kedi");
			stack.add("Köpek");
			stack.add("Aslan");
			stack.add("Kuş");
			
			for(String s : stack) {
				System.out.println(s);
			}
			
			// LIFO Uygulanışı:
			//
			// peek() : stack'e son giren elemanı getir(göster) metodu
			System.out.println("\n* * * * peek  * * * * \n");
			System.out.println(stack.peek());
			System.out.println(stack.peek());
			
			// pop() : stack'e son giren elemanı çıkar metodu
			System.out.println("\n* * * * pop * * * * \n");
			String str = stack.pop();
			System.out.println(str);
			System.out.println(stack.peek());
			System.out.println(stack.pop());
			
			// isEmpty() : stack boş mu kontrolü
			System.out.println("Stack boş mu? " + stack.isEmpty());
			stack.pop();
			stack.pop();
			System.out.println("Stack boş mu? " + stack.isEmpty());
			
			if(!stack.isEmpty()) {
				stack.pop();
			}
			
			
			
			
			
			
			
			
			
		}
}
