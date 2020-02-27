package com.cts.cd.ui;

import com.cts.cd.model.GenericClass;


public class GenericClient {

	public static void main(String[] args) {
		GenericClass<Integer> i=new GenericClass<>();
		i.add(4);
		System.out.println(i.get());

	}

}
