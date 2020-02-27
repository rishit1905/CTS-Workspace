package com.cts.sd.ui;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("HELLO");
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("HELLO");
		System.out.println(sb1);
		
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));

	}

}
