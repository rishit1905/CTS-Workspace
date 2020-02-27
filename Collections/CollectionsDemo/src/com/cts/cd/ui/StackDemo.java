package com.cts.cd.ui;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		 Stack<String> stackOfGuitars = new Stack<>();

	        stackOfGuitars.push("Fender");
	        stackOfGuitars.push("Epiphone");
	        stackOfGuitars.push("Yamaha");
	        stackOfGuitars.push("Cort");
	        stackOfGuitars.push("Gibson");

	        System.out.println("Stack => " + stackOfGuitars + "\n");

	        String guitarAtTop = stackOfGuitars.pop(); 
	        System.out.println("Stack.pop() -> " + guitarAtTop);
	        System.out.println("Current Stack -> " + stackOfGuitars + "\n");
	        
	        guitarAtTop = stackOfGuitars.peek();
	        System.out.println("Stack.peek() -> " + guitarAtTop);
	        System.out.println("Current Stack -> " + stackOfGuitars);
	}

}
