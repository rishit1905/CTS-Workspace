package com.cts.mat.ui;

public class Sums {
	public static void main(String[] args) {		
		int [][] arr= {{6,87,1},{35,1,2},{12,12,12}};
		
		if(arr.length!=arr[0].length) {
			System.out.println("Not compatible");
			System.exit(0);
		}
		
		int diag=0, upper=0, lower=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
					if(i==j) {
						diag+=arr[i][j];
					}
					
					else if(i<j) {
						upper+=arr[i][j];
					}
					
					else {
						lower+=arr[i][j];
					}
					
				}
			}
		
		System.out.println("Diagonal sum: "+diag);
		System.out.println("Upper Traingle sum: "+upper);
		System.out.println("Lower Triangle sum: "+lower);
	}
}
