package com.cts.oopp.ui;

import com.cts.oopp.model.Complex;

public class ComplexClient {

	public static void main(String[] args) {
		Complex first=new Complex();
		System.out.println(first);
		
		Complex second=new Complex(8,2);
		System.out.println(second);
		
		Complex third=new Complex();
		System.out.println(third.sum(first,second));
		
		Complex fourth=first;
		System.out.println(fourth);
		
		Complex fifth=new Complex(second);
		System.out.println(fifth);
		
		if(second==third) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		if(first.getRealPart()==fourth.getRealPart() && first.getImaginaryPart()==fourth.getImaginaryPart()) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
	}

}
