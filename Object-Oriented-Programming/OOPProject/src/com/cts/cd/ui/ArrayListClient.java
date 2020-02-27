package com.cts.cd.ui;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;
import java.util.Scanner;

public class ArrayListClient {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		List<String> a=new ArrayList<>();
		String name=null;
		
		while(true) {
			System.out.println("Name:");
			name=scan.nextLine();
			if(name.equals("end")) {
				break;
			}
			a.add(name);
		}
			
		for(String data:a) {
				System.out.println(data);
		}
	}

}
