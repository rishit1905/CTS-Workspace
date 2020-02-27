package com.cts.fd.ui;

import java.io.FileWriter;
//import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		try (FileWriter fw=new FileWriter("Reverse.txt");){ 
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter numbers:");
			while(scan.nextInt()!=0) {
				int i=scan.nextInt();
				fw.write(i);
			}
				System.out.println("Data added");
		}	catch(Exception excep) {
				excep.getMessage();
			}
				
		}
		
	}
