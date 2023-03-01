package com.hivdaaydogan;

import java.util.Stack;

public class StackSoru {

	public static boolean isValid(String s) {
		Stack<Character> solParantez = new Stack<>();
		
		// loop the string s
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			// eğer sol parantez ile karşılaşırsa
			if(c=='(' || c=='[' || c=='{') {
				solParantez.push(c);
			} // Eğer sağ parantezler ile karşılaşırsa:
			else if(c== ')' && !solParantez.isEmpty() && solParantez.peek() == '(') {
				solParantez.pop();
			}else if(c== ']' && !solParantez.isEmpty() && solParantez.peek() == '[') {
				solParantez.pop();
			}else if (c== '}' && !solParantez.isEmpty() && solParantez.peek() == '{') {
				solParantez.pop();
			} else {
				return false;
			}
		}
		
		return solParantez.isEmpty();    // [(((((() olursa hata vereceği için true dönmemeli. Sola parantez kaldıysa false döner, hiçbir şey kalmadıysa true döner
	}												   // Sola parantezlerle dolu bir örneğin burada valid olmadığını yakalarız. 
	
	
	public static void main(String[] args) {
		
		// Düzgün Parantezler Problemi 
		/* 
		 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
		 * ']', determine if the input string is valid.
		 * 
		 * An input string is valid if:
		 * 
		 * Open brackets must be closed by the same type of brackets. Open brackets must
		 * be closed in the correct order. Constraints : s consists of parentheses only
		 * '()[]{}'.
		 * 
		 * Example 1: Input: s = "()" Output: true
		 * 
		 * Example 2: Input: s = "()[]{}" Output: true
		 * 
		 * Example 3: Input: s = "(]" Output: false
		 * 
		 * Example 4: Input: s = "([)]" Output: false
		 * 
		 * Example 5: Input: s = "{[]}" Output: true
		 * 
		 * Note: In this question, we need to deal with only 6 symbols — (, ), {, }, [,
		 * ]. We will be given a string containing only these symbols.
		 */				
		

		System.out.println(StackSoru.isValid("([))"));
		System.out.println(StackSoru.isValid("[(((((())"));
		System.out.println(StackSoru.isValid("{[()]}"));
		System.out.println(StackSoru.isValid("()[]{}"));
	}

}
