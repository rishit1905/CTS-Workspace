package com.cts.mat.ui;
public class MatrixAddClient {
	
	static int[][] add(int [][] arr1, int [][] arr2){
		
		if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length) {
			System.out.println("Not compatible for addition");
			System.exit(0);
		}
			
		int row=arr1.length;
		int col=arr1[0].length;
		int [][] arr=new int[row][col];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
			
		return arr;
	}

	public static void main(String[] args) {
		int [][] arr1= {{2,2},{4,4},{6,6}};
		int [][] arr2= {{1,6},{4,6},{0,9}};
		int [][] arr=add(arr1,arr2);
		
		System.out.println("Matrix addition:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
