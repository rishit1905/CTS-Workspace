package com.cts.oopp.ui;

import java.util.Random;
import com.cts.oopp.model.GenericSort;
import com.cts.oopp.model.ISort;

public class InterfaceClient {

	public static void main(String[] args) {
		int [] a=new int[10];
		Random random=new Random();
		
		for(int i=0;i<a.length;i++) {
			a[i]=random.nextInt(100);
		}
		
		ISort sort;
		sort=new GenericSort();
		sort.sortData(a);
		for(int value:a) {
			System.out.println(value);
		}

	}

}
