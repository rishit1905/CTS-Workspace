package com.cts.mat.ui;

public class MatrixMultClient {
	
	static int[][] mul(int [][] arr1, int [][] arr2){
		
		if(arr1[0].length!=arr2.length) {
			System.out.println("Not compatible for multiplication");
			System.exit(0);
		}
			
		int row=arr1.length;
		int col=arr2[0].length;
		int [][] arr=new int[row][col];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=0;
			}
		}
		
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<arr2.length;k++) {
				arr[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
			
		return arr;
	}

	public static void main(String[] args) {
		int [][] arr1= {{2,4},{1,6},{2,2}};
		int [][] arr2= {{1,2,3},{0,1,2}};
		int [][] arr=mul(arr1,arr2);
		
		System.out.println("Matrix addition:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
