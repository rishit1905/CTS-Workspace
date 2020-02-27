package com.cts.mat.ui;
public class SortingClient {
	static int [] sort(int [] arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				} else
					continue;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arr= {6,87,35,1,-1,-10,2,-567};
		int [] arr1=sort(arr);
		
		System.out.println("Sorted Array:");
		for(int val:arr1) {
			System.out.print(val+"\t");
		}

	}

}
