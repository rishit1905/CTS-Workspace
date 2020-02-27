package com.cts.mat.ui;

public class MatrixTran {
	static int [][] tran(int [][] arr) {
		int [][] arr1=new int[arr[0].length][arr.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
					arr1[i][j]=arr[j][i];
				}
			}
		return arr1;
	}
	
	public static void main(String[] args) {
		int [][] arr= {{6,87},{35,1},{-1,-10},{2,-567}};
		int [][] arr1=tran(arr);
		
		System.out.println("Sorted Array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
			System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
