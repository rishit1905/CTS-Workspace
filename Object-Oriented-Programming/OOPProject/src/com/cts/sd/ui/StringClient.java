package com.cts.sd.ui;

public class StringClient {

	public static void main(String[] args) {
		String str1="ABCD-1243";
//		str1.toUpperCase();
//		System.out.println(str1);
//		String str2="ABCA";
//		System.out.println(str1==str2);
		
//		String str3=new String("Java");
//		String str4=new String("Java");
//		System.out.println(str3==str4);
//		System.out.println(str3.equals(str4));
//		System.out.println(str1.compareTo(str2));
		for(String data: str1.split("1")) {
			System.out.println(data);
		};
	}

}
